package com.example.week4homeworkrest.repository;

import com.example.week4homeworkrest.pojo.entity.Provider;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository {
    Provider updateProvider(Provider p);
    Provider insertProvider(Provider p);
    Provider getProviderById(Long id);
    void deleteProvider(Provider p);
    void deleteProviderById(Long id);
}
