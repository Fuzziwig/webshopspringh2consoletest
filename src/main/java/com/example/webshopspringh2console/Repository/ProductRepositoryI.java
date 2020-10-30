package com.example.webshopspringh2console.Repository;

import com.example.webshopspringh2console.Model.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepositoryI extends CrudRepository<Product, Integer> {
}

