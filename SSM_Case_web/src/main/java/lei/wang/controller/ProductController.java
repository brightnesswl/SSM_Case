package lei.wang.controller;

import lei.wang.domain.Product;
import lei.wang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@RequestMapping("/product")
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(ModelAndView mv) throws Exception {
        System.out.println("Controller已被访问");
        List<Product> productList = productService.findAll();
        mv.addObject("productList",productList);
        mv.setViewName("product-list");
        return mv;
    }
}
