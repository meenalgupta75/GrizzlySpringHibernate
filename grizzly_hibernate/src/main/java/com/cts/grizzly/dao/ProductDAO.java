package com.cts.grizzly.dao;

import java.util.List; 

import com.cts.grizzly.bean.Category;
import com.cts.grizzly.bean.Login;
import com.cts.grizzly.bean.Product;

public interface ProductDAO {

	public String addProduct(Product product);

	public List<Product> viewProducts();

	
}
