package com.liamtseva.productcatalog;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
  private ProductRepository productRepository;

  @Override
  public void init() throws ServletException {
    productRepository = new ProductRepository();
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    List<Product> products = productRepository.getProducts();
    req.setAttribute("products", products);
    req.getRequestDispatcher("/products.jsp").forward(req, resp);
  }
}
