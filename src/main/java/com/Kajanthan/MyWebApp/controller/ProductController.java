package com.Kajanthan.MyWebApp.controller;
import com.Kajanthan.MyWebApp.model.Product;
import com.Kajanthan.MyWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController
{
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts()
    {
        return productService.getProductList();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id)
    {
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product proud)
    {
        productService.addProduct(proud);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product proud)
    {
        productService.updateProduct(proud);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id)
    {
        System.out.println(id);
        productService.deleteProduct(id);
    }
}
