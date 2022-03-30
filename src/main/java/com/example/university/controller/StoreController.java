package com.example.university.controller;

import com.example.university.model.Store;
import com.example.university.service.impl.StoreImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/store")
public class StoreController {
    private final StoreImpl store;

    @GetMapping
    public List<Store> getStoreList(){
        return store.getStoreList();
    }


}
