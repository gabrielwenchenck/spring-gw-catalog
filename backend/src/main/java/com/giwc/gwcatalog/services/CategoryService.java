package com.giwc.gwcatalog.services;

import com.giwc.gwcatalog.dto.CategoryDTO;
import com.giwc.gwcatalog.entities.Category;
import com.giwc.gwcatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {

        List<Category> list = repository.findAll();

        return list.stream().map(CategoryDTO::new).toList();

    }
}
