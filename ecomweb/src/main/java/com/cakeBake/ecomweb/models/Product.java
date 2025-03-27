package com.cakeBake.ecomweb.models;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	private boolean available;
	private String name;
	private String brand;
	private String category;
	private BigDecimal price;
	private Date releaseDate;
	
	private String imageName;
	private String imageType;
	
	@Lob
	private byte[] imagedata;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	
	
	public Product() {}

	
	
	
	public Product(int id, String description, boolean available, String name, String brand, String category,
			BigDecimal price, Date releaseDate, String imageName, String imageType, byte[] imagedata) {
		this.id = id;
		this.description = description;
		this.available = available;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.releaseDate = releaseDate;
		this.imageName = imageName;
		this.imageType = imageType;
		this.imagedata = imagedata;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public byte[] getImagedata() {
		return imagedata;
	}
	public void setImagedata(byte[] imagedata) {
		this.imagedata = imagedata;
	}
	
	
	


	
}
