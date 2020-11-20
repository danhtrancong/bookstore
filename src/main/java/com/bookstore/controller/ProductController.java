package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookstore.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public String showProductView(Model model) {
		model.addAttribute("productsView", productService.getProduct());
		return "productsView";
	}
    @GetMapping("/{id}")
    public String listCustomersByName(Model model, @PathVariable("id") String id) {
        model.addAttribute("productDetail", productService.getProductById(Long.parseLong(id)));
        return "productDetail";
    }
}
