package com.bookstore.controller;

import com.bookstore.dto.CommonDataDTO;
import com.bookstore.dto.ProductDTO;
import com.bookstore.entity.ProductEntity;
import com.bookstore.exceptions.NotFoundException;
import com.bookstore.mapper.CategoryMapper;
import com.bookstore.mapper.LanguageMapper;
import com.bookstore.mapper.ProductMapper;
import com.bookstore.service.CategoryService;
import com.bookstore.service.LanguageService;
import com.bookstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;

@Controller
@RequestMapping("/product")
public class ProductController implements ServletContextAware {
    private ServletContext servletContext;

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    LanguageService languageService;

    @GetMapping("/{id}")
    public String getProductDetail(Model model, @PathVariable("id") Long id) {
        CommonDataDTO commonDataDTO = new CommonDataDTO();
        commonDataDTO.setCategories(CategoryMapper.mapFromEntities(categoryService.getAll()));
        commonDataDTO.setLanguages(LanguageMapper.mapFromEntities(languageService.getAll()));
        commonDataDTO.setBestSellingProducts(ProductMapper.mapFromEntities(productService.getBestSellings()));
        model.addAttribute("commonData", commonDataDTO);
        model.addAttribute("productDetail", ProductMapper.mapFromEntity(productService.getProductById(id)));
        return "productDetail";
    }

    @GetMapping("/save")
    public String showSaveProductPage(Model model) {
        CommonDataDTO commonDataDTO = new CommonDataDTO();
        commonDataDTO.setCategories(CategoryMapper.mapFromEntities(categoryService.getAll()));
        commonDataDTO.setLanguages(LanguageMapper.mapFromEntities(languageService.getAll()));
        commonDataDTO.setBestSellingProducts(ProductMapper.mapFromEntities(productService.getBestSellings()));
        model.addAttribute("commonData", commonDataDTO);
        ProductDTO product = new ProductDTO();
        model.addAttribute("productDetail", product);
        return "createProductPage";
    }

    @PostMapping("/save")
    public String postSaveProduct(Model model, @ModelAttribute("productDetail") ProductDTO product) throws NotFoundException {
        ProductEntity productEntity = productService.saveProduct(ProductMapper.mapFromDTO(product), Long.parseLong(product.getCategory()), Long.parseLong(product.getLanguage()));

        // Return saved product
        String returnPage = "redirect:/product/" + productEntity.getId();

        return returnPage;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

}
