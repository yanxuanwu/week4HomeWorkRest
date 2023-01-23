package com.example.week4homeworkrest.controller;

import com.example.week4homeworkrest.pojo.dto.ProviderResponseDTO.*;
import com.example.week4homeworkrest.pojo.entity.Provider;
import com.example.week4homeworkrest.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProviderController {
    @Autowired
    @Qualifier("providerServiceImpl")
    private final ProviderService service;

    public ProviderController(@Qualifier("providerServiceImpl") ProviderService service) {
        this.service = service;
    }

    @PostMapping("/userinfo")
    public ResponseEntity<ProviderDTO> postInfo(@RequestBody Provider provider) {
        return new ResponseEntity<>(service.insertProvider(provider), HttpStatus.OK);
    }

    @GetMapping("/userinfo/{id}")
    public ResponseEntity<ProviderDTO> getInfo(@PathVariable Long id) {
        return new ResponseEntity<>(service.getProviderById(id), HttpStatus.OK);
    }

    @PutMapping("/userinfo")
    public ResponseEntity<ProviderDTO> updateInfo(@RequestBody Provider provider){
        return new ResponseEntity<>(service.updateProvider(provider), HttpStatus.OK);
    }

    @DeleteMapping("/userinfo/{id}")
    public ResponseEntity<ProviderDTO> deleteInfoById(@PathVariable Long id) {
        service.deleteProviderById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/userinfo")
    public ResponseEntity<ProviderDTO> deleteInfo(@RequestBody Provider provider) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
