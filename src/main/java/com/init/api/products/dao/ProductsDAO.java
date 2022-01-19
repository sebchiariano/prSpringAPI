package com.init.api.products.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.api.products.entitys.Product;

public interface ProductsDAO  extends JpaRepository<Product, Long>{

}

