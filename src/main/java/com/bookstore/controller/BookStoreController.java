package com.bookstore.controller;

import com.bookstore.dto.CategoryDTO;
import com.bookstore.dto.CommonDataDTO;
import com.bookstore.mapper.CategoryMapper;
import com.bookstore.service.CategoryService;
import com.bookstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BookStoreController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

//	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
//	public String homePage(Model model) {
//		Authentication myUser = SecurityContextHolder.getContext().getAuthentication();
//		String userEmail = myUser.getName();
//		if (userEmail != null && !(userEmail.equals("anonymousUser"))) {
//			model.addAttribute("email", userEmail);
//		}
//		return "homePage";
//	}

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


    @GetMapping(value = {"/home"})
    public String getCommonData(Model model) {
        CommonDataDTO commonDataDTO = new CommonDataDTO();

        // TODO: the list of categories will be queried from database
        List<CategoryDTO> categoriesDTO = CategoryMapper.mapFromEntities(categoryService.getAll());
        commonDataDTO.setCategories(categoriesDTO);

        // TODO: the list of productsbestseller will be queried form db
//        commonDataDTO.getProductBestSeller();
//
        model.addAttribute("commonData", commonDataDTO);
        return "homePage";
    }

}
