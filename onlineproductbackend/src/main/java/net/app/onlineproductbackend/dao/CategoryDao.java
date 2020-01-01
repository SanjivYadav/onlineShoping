package net.app.onlineproductbackend.dao;

import java.util.List;

import net.app.onlineproductbackend.dto.Category;

public interface CategoryDao {

	Category get(int id);
	List<Category> list();
}
