package com.bookstore.dto;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO {
	List<CategoryDTO> categories = new ArrayList<>();

	public List<CategoryDTO> getCategories() {
		return categories;
	}

}
