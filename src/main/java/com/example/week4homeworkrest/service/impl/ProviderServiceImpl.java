package com.example.week4homeworkrest.service.impl;

import com.example.week4homeworkrest.pojo.dto.ProviderResponseDTO.*;
import com.example.week4homeworkrest.pojo.entity.Provider;
import com.example.week4homeworkrest.repository.ProviderRepository;
import com.example.week4homeworkrest.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    @Qualifier("providerRepositoryImpl")
    private final ProviderRepository repo;

    public ProviderServiceImpl(@Qualifier("providerRepositoryImpl") ProviderRepository repo) {
        this.repo = repo;
    }

    @Override
    public ProviderDTO insertProvider(Provider p) {
        return new ProviderDTO(repo.insertProvider(p));
    }

    @Override
    public ProviderDTO updateProvider(Provider p) {
        return new ProviderDTO(repo.updateProvider(p));
    }

    @Override
    public ProviderDTO getProviderById(Long Id) {
        return new ProviderDTO(repo.getProviderById(Id));
    }

    @Override
    public void deleteProvider(Provider p) {
        repo.deleteProvider(p);
    }

    @Override
    public void deleteProviderById(Long id) {
        repo.deleteProviderById(id);
    }
}
