package com.bookstore.dto;

import java.util.ArrayList;
import java.util.List;

public class ProductListDTO {
	List<CategoryDTO> categories = new ArrayList<>();
	List<LanguageDTO> languages = new ArrayList<>();
	List<ProductDTO> products = new ArrayList<>();

	public List<CategoryDTO> getCategories() {
		return categories;
	}

	public List<LanguageDTO> getLanguages() {
		return languages;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

}
