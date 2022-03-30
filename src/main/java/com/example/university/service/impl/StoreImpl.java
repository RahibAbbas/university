package com.example.university.service.impl;

import com.example.university.model.Store;
import com.example.university.repository.StoreRepository;
import com.example.university.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreImpl implements StoreService {

    private final StoreRepository storeRepository;


    @Override
    public List<Store> getStoreList() {
        return storeRepository.findAll();
    }
}
