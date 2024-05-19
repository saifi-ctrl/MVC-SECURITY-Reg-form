package com.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {

	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String shipName;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getShipName() {
	return shipName;
}

public void setShipName(String shipName) {
	this.shipName = shipName;
}



}
