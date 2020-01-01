package net.app.onlineproductbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.app.onlineproductbackend.dao.CategoryDao;
import net.app.onlineproductbackend.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	static List<Category> categories = new ArrayList();
	
	static {
		
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is television description");
		category.setImageUrl("cat_1.img");
		category.setActive(true);
		
		categories.add(category);
		
		//2nd category
		category = new Category();
		category.setId(2);
		category.setName("Laptop");
		category.setDescription("This is laptop description");
		category.setImageUrl("cat_2.img");
		category.setActive(true);
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {

		for(Category category : categories)
		{
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
