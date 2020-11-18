package com.bookstore.dto;

import java.math.BigDecimal;

import com.bookstore.entity.CategoryEntity;
import com.bookstore.entity.LanguageEntity;

public class ProductDTO {
	private Long id;
	private String name;
	private BigDecimal sallingPrice;
	private BigDecimal originalPrice;
	private String imageUrl;
	private CategoryEntity category;
	private LanguageEntity language;
	private String summary;

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

	public LanguageEntity getLanguage() {
		return language;
	}

	public void setLanguage(LanguageEntity language) {
		this.language = language;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

}
