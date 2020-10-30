package com.example.webshopspringh2console.Controller;



import com.example.webshopspringh2console.Model.Product;
import com.example.webshopspringh2console.Repository.ProductRepositoryI;
import com.example.webshopspringh2console.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    /*
    @Autowired
    ProductService productService;
    */
    //Her bruger vi contructor
    private ProductService productService;

    public ProductController(ProductService ps){
        this.productService = ps;
    }

    @GetMapping("/opretProduct")
    public String createFormProduct(Model model) {
        model.addAttribute("product",new Product());
        return "product";
    }

    @PostMapping("/createProduct")
    public String createProduct (@ModelAttribute Product product) {
        productService.createProduct(product);
        return "redirect:/oversigtProduct";
    }

    @GetMapping("/oversigtProduct")
    public String readAllProducts (Model model) {
        model.addAttribute("products", productService.readAlleProducts());
        return "/index";
    }


    @PostMapping("opdaterProduct/{id}")
    public String updateProduct(@PathVariable("id") int id, Model model) {
        Product product = productService.readOneProduct(id);
        model.addAttribute("product", product);
        return "redigerProduct";
    }

    @GetMapping("sletProduct/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "redirect:/oversigtProduct";
    }




}

