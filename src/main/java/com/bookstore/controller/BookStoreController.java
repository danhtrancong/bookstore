package com.bookstore.controller;

import com.bookstore.dto.CommonDataDTO;
import com.bookstore.mapper.CategoryMapper;
import com.bookstore.mapper.ProductMapper;
import com.bookstore.service.CategoryService;
import com.bookstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookStoreController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    ProductService productService;

    @GetMapping(value = {"/home"})
    public String homePage(Model model) {
        CommonDataDTO commonDataDTO = new CommonDataDTO();
        commonDataDTO.setCategories(CategoryMapper.mapFromEntities(categoryService.getAll()));
        commonDataDTO.setBestSellingProducts(ProductMapper.mapFromEntities(productService.getBestSellings()));
        model.addAttribute("commonData", commonDataDTO);
        model.addAttribute("allProducts", ProductMapper.mapFromEntities(productService.getAll()));
        return "homePage";
    }

    @RequestMapping(value = {"/contactus"}, method = RequestMethod.GET)
    public String contactusPage(Model model) {

        model.addAttribute("address", "Vietnam");
        model.addAttribute("phone", "09888888");
        model.addAttribute("email", "test@gmail.com");

        return "contactusPage";
    }

    @RequestMapping(value = {"/edit"}, method = RequestMethod.GET)
    public String showEditProductView(Model model) {
        return "editPage";
    }
}
