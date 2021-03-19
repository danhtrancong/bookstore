package com.bookstore.controller;

import com.bookstore.dto.CommonDataDTO;
import com.bookstore.dto.ProductDTO;
import com.bookstore.mapper.CategoryMapper;
import com.bookstore.mapper.ProductMapper;
import com.bookstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.bookstore.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	CategoryService categoryService;

	@GetMapping("/{id}")
	public String getProductDetail(Model model, @PathVariable("id") Long id) {
		CommonDataDTO commonDataDTO = new CommonDataDTO();
		commonDataDTO.setCategories(CategoryMapper.mapFromEntities(categoryService.getAll()));
		commonDataDTO.setBestSellingProducts(ProductMapper.mapFromEntities(productService.getBestSellings()));
		model.addAttribute("commonData", commonDataDTO);
		model.addAttribute("productDetail", ProductMapper.mapFromEntity(productService.getProductById(id)));
		return "productDetail";
	}

	@GetMapping("/create-product")
	public String getCreatingProductPage(Model model) {
		CommonDataDTO commonDataDTO = new CommonDataDTO();
		commonDataDTO.setCategories(CategoryMapper.mapFromEntities(categoryService.getAll()));
		commonDataDTO.setBestSellingProducts(ProductMapper.mapFromEntities(productService.getBestSellings()));
		model.addAttribute("commonData", commonDataDTO);
		ProductDTO product= new ProductDTO();
		model.addAttribute("productDetail", product);
		return "createProductPage";
	}
	@PostMapping("/save-product")
	public String postSaveProductPag(Model model, @ModelAttribute("productDetail") ProductDTO product) {
		CommonDataDTO commonDataDTO = new CommonDataDTO();
		commonDataDTO.setCategories(CategoryMapper.mapFromEntities(categoryService.getAll()));
		commonDataDTO.setBestSellingProducts(ProductMapper.mapFromEntities(productService.getBestSellings()));
		model.addAttribute("commonData", commonDataDTO);
		//model.addAttribute("productDetail", product);
		return "redirect:/productDetail";
	}
}
