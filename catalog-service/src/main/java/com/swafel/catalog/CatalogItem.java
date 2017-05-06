package com.swafel.catalog;

import java.math.BigDecimal;

public class CatalogItem {
	private long id;
	private String name;
	private BigDecimal price;

	public CatalogItem() {}

	public CatalogItem(long id, String name, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal count) {
		this.price = price;
	}
}