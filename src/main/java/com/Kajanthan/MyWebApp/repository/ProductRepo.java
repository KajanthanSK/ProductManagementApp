package com.Kajanthan.MyWebApp.repository;

import com.Kajanthan.MyWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
