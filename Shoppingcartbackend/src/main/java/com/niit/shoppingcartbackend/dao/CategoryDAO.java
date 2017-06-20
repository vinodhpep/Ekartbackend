package com.niit.shoppingcartbackend.dao;

import java.util.List;

import com.niit.shoppingcartbackend.model.Category;

public interface CategoryDAO {

public void save (Category category);
public void update(Category category);
public List<Category> list();
public Category get(String supplierId);

public void delete(String supplierId);
public List <Category> search (String keyword);


}
