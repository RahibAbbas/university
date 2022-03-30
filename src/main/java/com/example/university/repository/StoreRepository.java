package com.example.university.repository;

import com.example.university.model.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends CrudRepository<Store, Integer> {

    List<Store> findAll();
}
