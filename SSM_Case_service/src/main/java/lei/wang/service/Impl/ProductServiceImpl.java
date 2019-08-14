package lei.wang.service.Impl;

import lei.wang.dao.ProductDao;
import lei.wang.domain.Product;
import lei.wang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception {
        List<Product> productList = productDao.findAll();
        return productList;
    }
}
