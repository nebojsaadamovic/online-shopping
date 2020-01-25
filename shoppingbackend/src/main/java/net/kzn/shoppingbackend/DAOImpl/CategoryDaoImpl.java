package net.kzn.shoppingbackend.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.DAO.CategoryDAO;
import net.kzn.shoppingbackend.DTO.Category;





@Repository("categoryDAO")
public class CategoryDaoImpl implements CategoryDAO {

	
	private static List<Category>categories=new ArrayList<Category>();
	
	static {
		
		Category category=new Category();
		category.setID(1);
		category.setName("Television");
		category.setDescription("thi is television");
		category.setImageUrl("CAT_1.png");
		categories.add(category);
		
		category=new Category();
		category.setID(2);
		category.setName("Mobile");
		category.setDescription("this is mobile");
		category.setImageUrl("CAT_2.png");
		categories.add(category);
		
		category=new Category();
		category.setID(3);
		category.setName("Lap top");
		category.setDescription("thi is computer");
		category.setImageUrl("CAT_3.png");
		categories.add(category);
		
		
	}
	
	
	
	@Override
	public List<Category> list() {		
		return categories;
	}
	
	

}
