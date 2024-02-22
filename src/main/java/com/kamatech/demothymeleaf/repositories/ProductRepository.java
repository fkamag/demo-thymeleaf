package com.kamatech.demothymeleaf.repositories;

import com.kamatech.demothymeleaf.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
