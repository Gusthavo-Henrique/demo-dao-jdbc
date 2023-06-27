package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	void insertSeller(Seller obj);
	void updateSeller(Seller obj);
	void deleteById(Integer id);
	Seller findByID(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
	
}
