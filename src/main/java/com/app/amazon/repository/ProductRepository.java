package com.app.amazon.repository;

import com.app.amazon.models.entity.Product;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class ProductRepository {
    private Map<Long, Product> products = new HashMap<>();
    private static AtomicLong productId = new AtomicLong(1l);

    public Product product(Product product) {
        product.setProductId(product.getProductId());
        products.put(product.getProductId(), product);
        productId.incrementAndGet();
        return product;
    }
}
