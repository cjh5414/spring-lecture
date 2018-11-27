package kr.ac.hansung.cse.controller;

import kr.ac.hansung.cse.model.Product;
import kr.ac.hansung.cse.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jihun on 2018. 11. 26..
 */

@Controller
@RequestMapping("/admin")
public class AdminController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping
    public String adminPage() {
        return "admin";
    }

    @RequestMapping("/productInventory")
    public String getProducts(Model model) {
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);

        return "productInventory";
    }

    @RequestMapping(value = "/productInventory/addProduct", method = RequestMethod.GET)
    public String addProduct(Model model) {
        Product product = new Product();

        product.setCategory("컴퓨터");
        model.addAttribute("product", product);
        return "addProduct";
    }

    @RequestMapping(value = "/productInventory/addProduct", method = RequestMethod.POST)
    public String addProductPost(Product product) {
        if (!productService.addProduct(product)) {
            System.out.println("Adding product cannot be done");
        }

        return "redirect:/admin/productInventory";
    }
}
