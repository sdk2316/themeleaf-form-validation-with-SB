package in.springframework.services;

import java.util.List;

import in.springframework.domain.Product;

/**
 * Created by jt on 1/26/16.
 */
public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
