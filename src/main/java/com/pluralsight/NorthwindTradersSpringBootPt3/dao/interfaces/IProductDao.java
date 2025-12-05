package com.pluralsight.NorthwindTradersSpringBootPt3.dao.interfaces;

import com.pluralsight.NorthwindTradersSpringBootPt3.models.Product;
import java.util.List;

public interface IProductDao {
    Product insert(Product product);

    List<Product> getAll();

    Product getById(int productId);

    void update(int productId, Product product);

    void delete(int productId);
}