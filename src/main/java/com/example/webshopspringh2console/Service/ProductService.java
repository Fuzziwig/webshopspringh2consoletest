package com.example.webshopspringh2console.Service;


import com.example.webshopspringh2console.Model.Product;
import com.example.webshopspringh2console.Repository.ProductRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    //Her gør vi brug af Autowired
    @Autowired
    ProductRepositoryI productRepositoryI;

    /*
    public ProductService(ProductRepositoryI productRepositoryI){
        this.productRepositoryI = productRepositoryI;
    }*/
    public String createProduct(Product product){
        productRepositoryI.save(product);
        return("redirect:/index");
    }

    public Product readOneProduct(Integer id){
        return productRepositoryI.findById(id).orElse(null);
    }

    public List<Product> readAlleProducts(){
        return (List<Product>) productRepositoryI.findAll();
    }

    public void deleteProduct(Integer id){
        productRepositoryI.deleteById(id);
    }
}

