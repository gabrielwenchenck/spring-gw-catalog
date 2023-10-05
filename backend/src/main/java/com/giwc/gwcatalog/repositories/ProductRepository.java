package com.giwc.gwcatalog.repositories;

import com.giwc.gwcatalog.entities.Category;
import com.giwc.gwcatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
