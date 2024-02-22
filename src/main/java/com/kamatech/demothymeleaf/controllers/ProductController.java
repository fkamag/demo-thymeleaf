package com.kamatech.demothymeleaf.controllers;

import com.kamatech.demothymeleaf.models.Product;
import com.kamatech.demothymeleaf.repositories.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @GetMapping("/produtos")
  public String findAll(Model model) {
    List<Product> products = productRepository.findAll();
    model.addAttribute("produtos", products);

    return "produtos";
  }

}
