package com.example.week4homeworkrest.service;


import com.example.week4homeworkrest.pojo.dto.ProviderResponseDTO.*;
import com.example.week4homeworkrest.pojo.entity.Provider;
import org.springframework.stereotype.Service;

@Service
public interface ProviderService {
    ProviderDTO insertProvider(Provider p);
    ProviderDTO updateProvider(Provider p);
    ProviderDTO getProviderById(Long Id);
    void deleteProvider(Provider p);
    void deleteProviderById(Long id);
}
