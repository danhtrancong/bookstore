package com.bookstore.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

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
public class ProductController
{

	@Autowired
	ProductService productService;

	@Autowired
	CategoryService categoryService;

	@GetMapping("/{id}")
	public String getProductDetail(Model model, @PathVariable("id") Long id)
	{
		CommonDataDTO commonDataDTO = new CommonDataDTO();
		commonDataDTO.setCategories(CategoryMapper.mapFromEntities(categoryService.getAll()));
		commonDataDTO.setBestSellingProducts(ProductMapper.mapFromEntities(productService.getBestSellings()));
		model.addAttribute("commonData", commonDataDTO);
		model.addAttribute("productDetail", ProductMapper.mapFromEntity(productService.getProductById(id)));
		return "productDetail";
	}

	@GetMapping("/save")
	public String showCreateView(Model model)
	{
		CommonDataDTO commonDataDTO = new CommonDataDTO();
		commonDataDTO.setCategories(CategoryMapper.mapFromEntities(categoryService.getAll()));
		commonDataDTO.setBestSellingProducts(ProductMapper.mapFromEntities(productService.getBestSellings()));

		model.addAttribute("commonData", commonDataDTO);
		model.addAttribute("product", new ProductDTO());

		return "createProductPage";
	}

	@PostMapping("/save")
	public String saveProduct(Model model, @ModelAttribute("product") ProductDTO product, HttpSession session)
	{
		//http://localhost:8080/bookstore/product-images/filename.png

		String path = session.getServletContext().getRealPath("/");
		path = path.concat("static/asset/product-images/");
		String filename = product.getFile().getOriginalFilename();

		System.out.println(path + " " + filename);
		try
		{
			byte barr[] = product.getFile().getBytes();

			BufferedOutputStream bout = new BufferedOutputStream(
					new FileOutputStream(path + "/" + filename));
			bout.write(barr);
			bout.flush();
			bout.close();

		}
		catch (Exception e)
		{
			System.out.println(e);
		}

		CommonDataDTO commonDataDTO = new CommonDataDTO();
		commonDataDTO.setCategories(CategoryMapper.mapFromEntities(categoryService.getAll()));
		commonDataDTO.setBestSellingProducts(ProductMapper.mapFromEntities(productService.getBestSellings()));
		model.addAttribute("commonData", commonDataDTO);
		model.addAttribute("productDetail", product);

		return "redirect:/product/1";
	}
}
