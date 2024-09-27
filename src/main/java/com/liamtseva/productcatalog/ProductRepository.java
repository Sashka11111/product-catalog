package com.liamtseva.productcatalog;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
  private List<Product> products = new ArrayList<>();

  public ProductRepository() {
    for (int i = 1; i <= 10; i++) {
      products.add(new Product(i, "Product " + i, i * 10));
    }
  }

  public List<Product> getProducts() {
    return products;
  }
}

