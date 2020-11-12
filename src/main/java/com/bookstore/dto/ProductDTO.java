package com.bookstore.dto;

import java.util.ArrayList;
import java.util.List;

import com.bookstore.entity.LangBookEntity;

public class ProductDTO {
	List<CategoryDTO> categories = new ArrayList<>();
	List<LangBookDTO> langbooks = new ArrayList<>();

	public List<CategoryDTO> getCategories() {
		return categories;
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
