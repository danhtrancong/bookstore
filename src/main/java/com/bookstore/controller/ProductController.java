package com.bookstore.controller;

import com.bookstore.dto.CommonDataDTO;
import com.bookstore.dto.ProductDTO;
import com.bookstore.entity.ProductEntity;
import com.bookstore.mapper.CategoryMapper;
import com.bookstore.mapper.ProductMapper;
import com.bookstore.service.CategoryService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.bookstore.service.ProductService;

@Controller
@RequestMapping(value = {"/product"})
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/{id}")
    public String getProductDetail(Model model, @PathVariable("id") Long id) {
        CommonDataDTO commonDataDTO = new CommonDataDTO();
        commonDataDTO.setCategories(CategoryMapper.mapFromEntities(categoryService.getAll()));
        commonDataDTO.setBestSellerProducts(ProductMapper.mapFromEntities(productService.getBestSellers()));
        model.addAttribute("commonData", commonDataDTO);
        model.addAttribute("productDetail", productService.getProductById(id));
        return "productDetail";
    }

//	@GetMapping(value = {"/product"})
//	public String showProductsView(Model model, @RequestParam("categoryId") Long categoryId) {
//		model.addAttribute("productsView", productService.getProduct(categoryId));
//		return "productsView";
//	}

    @GetMapping(value = "/save")
    public String showCreateView(Model model) {
        CommonDataDTO commonDataDTO = new CommonDataDTO();
        commonDataDTO.setCategories(CategoryMapper.mapFromEntities(categoryService.getAll()));
        commonDataDTO.setBestSellerProducts(ProductMapper.mapFromEntities(productService.getBestSellers()));
        model.addAttribute("commonData", commonDataDTO);
        model.addAttribute("product", new ProductDTO());
        return "addProductPage";
    }

    @PostMapping("/save")
    public String saveProduct(Model model, @ModelAttribute("product") ProductDTO product) throws NotFoundException {

        ProductEntity productEntity = ProductMapper.mapFromDTO(product);
        productService.saveProduct(productEntity, product.getCategoryId(), product.getLanguageId());
        model.addAttribute("product", productEntity);
        return "redirect:/productDetail";
    }
}

