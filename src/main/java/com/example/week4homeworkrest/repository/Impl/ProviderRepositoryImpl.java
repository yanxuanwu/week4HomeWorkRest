package com.example.week4homeworkrest.repository.Impl;

import com.example.week4homeworkrest.pojo.dto.ProviderResponseDTO.*;
import com.example.week4homeworkrest.pojo.entity.Provider;
import com.example.week4homeworkrest.repository.ProviderRepository;
import com.example.week4homeworkrest.service.ProviderService;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProviderRepositoryImpl implements ProviderRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Provider updateProvider(Provider p) {
        return em.merge(p);
    }

    @Override
    public Provider insertProvider(Provider p) {
        em.persist(p);
        return p;
    }

    @Override
    public Provider getProviderById(Long id) {
        Provider p = em.find(Provider.class, id);
        if (p == null) {
            throw new EntityNotFoundException("provider does not exist");
        }
        return p;
    }

    @Override
    public void deleteProvider(Provider p) {
        em.remove(p);
    }

    @Override
    public void deleteProviderById(Long id) {
        Provider p = em.find(Provider.class, id);
        if (p == null) {
            throw new EntityNotFoundException("provider id does not exist");
        }
        em.remove(p);
    }
}
