package lei.wang.dao;

import lei.wang.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductDao {
    @Select("select * from product")
    List<Product> findAll()throws Exception;
}
