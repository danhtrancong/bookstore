package com.bookstore.dto;

import java.util.ArrayList;
import java.util.List;

import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LangBookEntity;
import com.bookstore.entity.ProductEntity;

public class ProductListDTO {
	List<CategoryDTO> categories = new ArrayList<>();
	List<LangBookDTO> langbooks = new ArrayList<>();
	List<ProductDTO> products = new ArrayList<>();

	public List<CategoryDTO> getCategories() {
		return categories;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}

	public void setCategories(List<CategoryDTO> categories) {
		this.categories = categories;
	}

	public List<LangBookDTO> getLangbooks() {
		return langbooks;
	}

	public void setLangbooks(List<LangBookDTO> langbooks) {
		this.langbooks = langbooks;
	}

}
