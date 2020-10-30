package com.example.webshopspringh2console.Controller;

import com.example.webshopspringh2console.Repository.ProductRepositoryI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    ProductRepositoryI productRepositoryI;
    public HomeController (ProductRepositoryI productRepositoryI){
        this.productRepositoryI = productRepositoryI;
    }
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
