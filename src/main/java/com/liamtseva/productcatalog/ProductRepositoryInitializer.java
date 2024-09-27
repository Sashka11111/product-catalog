package com.liamtseva.productcatalog;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ProductRepositoryInitializer implements ServletContextListener {
  @Override
  public void contextInitialized(ServletContextEvent sce) {
    ProductRepository productRepository = new ProductRepository();
    sce.getServletContext().setAttribute("productRepository", productRepository);
  }
}

