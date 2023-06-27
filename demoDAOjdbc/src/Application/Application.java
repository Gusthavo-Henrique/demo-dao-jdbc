package Application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Application {
	public static void main(String[] args) {
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		Department dep = new Department(2, null);
		Seller seller4 = new Seller(7, "Gusthavo", "gustha@gmail.com", new Date(), 60000.0, dep);
		System.out.println("=== TESTE 1: seller find by id: ====");
		Seller seller = sellerdao.findByID(3);
		System.out.println(seller);
		List<Seller> seller1 = sellerdao.findByDepartment(dep);
		System.out.println("=== TESTE 2: seller find by department ====");
		System.out.println(seller1);
		System.out.println("=== TESTE 3: seller findall =====");
		List<Seller> seller2 = sellerdao.findAll();
		System.out.println(seller2);
		System.out.println("=== TESTE 4: seller insert =====");
		Seller seller3 = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.0, dep);
		sellerdao.insertSeller(seller3);
		System.out.println("Inserted! New id: "+seller3.getId());
		System.out.println("=== TESTE 5: seller update =====");
		
		sellerdao.updateSeller(seller4);
		System.out.println("=== TESTE 6: seller delete =====");
		sellerdao.deleteById(seller4.getId());

	
	}
}
