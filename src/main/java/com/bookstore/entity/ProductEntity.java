package com.bookstore.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity {

	private String name;

	private BigDecimal sallingPrice;

	private BigDecimal originalPrice;

	private String imageUrl;

	private Boolean isBestSelling;

	@Column(columnDefinition="TEXT")
	private String summary;

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	// category used in mappedBy
	private CategoryEntity category;

	@ManyToOne
	@JoinColumn(name = "language_id", nullable = false)
	private LanguageEntity language;

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

	public Boolean getBestSelling() {
		return isBestSelling;
	}

	public void setBestSelling(Boolean bestSelling) {
		isBestSelling = bestSelling;
	}
}
