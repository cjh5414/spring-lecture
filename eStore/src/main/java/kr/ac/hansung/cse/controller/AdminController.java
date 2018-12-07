package kr.ac.hansung.cse.controller;

import kr.ac.hansung.cse.model.Product;
import kr.ac.hansung.cse.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
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
    public String addProductPost(@Valid Product product, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("===Form data has some errors===");
            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError error: errors) {
                System.out.println(error.getDefaultMessage());
            }
            return "addProduct";
        }

        productService.addProduct(product);

        return "redirect:/admin/productInventory";
    }

    @RequestMapping("/productInventory/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProductById(id);

        return "redirect:/admin/productInventory";
    }

    @RequestMapping("/productInventory/editProduct/{id}")
    public String editProduct(@PathVariable int id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);

        return "editProduct";
    }

    @RequestMapping(value = "/productInventory/editProduct/{id}", method = RequestMethod.POST)
    public String editProductPost(@PathVariable int id, @Valid Product product, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("===Form data has some errors===");
            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError error: errors) {
                System.out.println(error.getDefaultMessage());
            }
            return "editProduct";
        }

        product.setId(id);

        if (!productService.editProduct(product)) {
            System.out.println("Editing product cannot be done");
        }

        return "redirect:/admin/productInventory";
    }
}
