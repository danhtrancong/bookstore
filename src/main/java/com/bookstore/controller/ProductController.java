package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookstore.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/{id}")
	public String getProductDetail(Model model, @PathVariable("id") Long id) {
		model.addAttribute("productDetail", productService.getProductById(id));
		return "productDetail";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showProductsView(Model model, @RequestParam("categoryId") Long categoryId) {
		model.addAttribute("productsView", productService.getProduct(categoryId));
		return "productsView";
	}

}
