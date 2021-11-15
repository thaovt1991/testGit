package products.com.service;

import products.com.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {

    List<Product> findAll() ;

    boolean save(Product product) throws SQLException;

    boolean update(Product product) throws SQLException;

    boolean remove(int id) throws SQLException ;

    Product findById(int id) ;

    List<Product> searchByName(String keySearch) ;

}
