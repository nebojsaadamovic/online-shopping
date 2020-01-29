package net.kzn.shoppingbackend.DAO;

import java.util.List;

import net.kzn.shoppingbackend.DTO.Category;

public interface CategoryDAO {
	
	
	List <Category> list();
	
	Category get(int id);

}
