package lei.wang.service;

import lei.wang.domain.Product;
import java.util.List;

public interface ProductService {
    List<Product> findAll() throws Exception;
}
