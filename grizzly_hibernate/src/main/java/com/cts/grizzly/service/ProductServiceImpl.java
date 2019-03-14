package com.cts.grizzly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.grizzly.bean.Login;
import com.cts.grizzly.bean.Product;
import com.cts.grizzly.bean.Profile;
import com.cts.grizzly.dao.LoginDAO;
import com.cts.grizzly.dao.ProductDAO;
import com.cts.grizzly.dao.ProfileDAO;



@Service("productService")
@Transactional(propagation=Propagation.SUPPORTS)
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDAO productDAO ;

	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.addProduct(product);
	}

	public List<Product> viewProducts() {
		// TODO Auto-generated method stub
		return productDAO.viewProducts();
		//return productDAO.viewProducts();
	}

	
		
	

	
}
