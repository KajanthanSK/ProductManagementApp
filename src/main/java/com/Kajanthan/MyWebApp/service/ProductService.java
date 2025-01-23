package com.Kajanthan.MyWebApp.service;

import com.Kajanthan.MyWebApp.model.Product;
import com.Kajanthan.MyWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService
{
    @Autowired
    ProductRepo repo;

//    List<Product> products= new ArrayList<>(Arrays.asList(
//            new Product(101, "Laptop", 1000),
//            new Product(102, "Camera", 2000),
//            new Product(103, "Phone", 3000)
//    ));

    public List<Product> getProductList()
    {
        return repo.findAll();
    }

    public Product getProductById(int id)
    {
        return repo.findById(id).orElse(new Product());
    }

    public void addProduct(Product proud)
    {
        repo.save(proud);
    }

    public void updateProduct(Product proud)
    {
       repo.save(proud);
    }

    public void deleteProduct(int id)
    {
        repo.deleteById(id);
    }
}
