package com.app.amazon.service.impl;

import com.app.amazon.models.entity.Product;
import com.app.amazon.repository.ProductSearchRepository;
import com.app.amazon.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    private ProductSearchRepository productSearchRepository;

    @Override
    public List<Product> searchByProductName(String name) {
        return productSearchRepository.getProductByName(name);
    }

    @Override
    public List<Product> searchByProductCategory(String categoryName) {
        return productSearchRepository.getProductByCategory(categoryName);
    }
}
