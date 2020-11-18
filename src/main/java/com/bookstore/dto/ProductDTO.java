package com.bookstore.dto;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LangBookEntity;

public class ProductDTO {

	private Long id;
	private String name;
	private BigDecimal sallingPrice;
	private BigDecimal originalPrice;
	private String imageUrl;
	private CategoryEntity category;
	private LangBookEntity langbook;
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSallingPrice() {
		return sallingPrice;
	}
	public void setSallingPrice(BigDecimal sallingPrice) {
		this.sallingPrice = sallingPrice;
	}
	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public CategoryEntity getCategory() {
		return category;
	}
	public void setCategory(CategoryEntity category) {
		this.category = category;
	}
	public LangBookEntity getLangbook() {
		return langbook;
	}
	public void setLangbook(LangBookEntity langbook) {
		this.langbook = langbook;
	}


}
