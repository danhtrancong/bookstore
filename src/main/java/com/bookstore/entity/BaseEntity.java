package com.bookstore.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp_created", nullable = false)
	private Calendar createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp_updated", nullable = false)
	private Calendar updatedDate;

//	@PrePersist
	public void onCreate() {
		createdDate = Calendar.getInstance();
		updatedDate = Calendar.getInstance();
	}

//	@PreUpdate
	public void onUpdate() {
		updatedDate = Calendar.getInstance();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Calendar createdDate) {
		this.createdDate = createdDate;
	}

	public Calendar getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Calendar updatedDate) {
		this.updatedDate = updatedDate;
	}

}
