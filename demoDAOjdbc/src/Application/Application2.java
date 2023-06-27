package Application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Application2 {

	public static void main(String[] args) {
		DepartmentDao departmentdao = DaoFactory.createDepartmentDao();
		Department dep = new Department(null, "Bebidas");
		Department dep1 = new Department(12, "Cosméticos");

		System.out.println("===TESTE 1: Insert department ====");
		departmentdao.insert(dep);
		System.out.println("Insert Sucesful! ");
		System.out.println("===TESTE 2: Delete department ====");
		departmentdao.removeById(11);
		System.out.println("===TESTE 3: Update department ====");
		departmentdao.update(dep1);
		System.out.println("===TESTE 4: findById department ====");
		Department dep3 = departmentdao.findById(6);
		System.out.println(dep3);
		System.out.println("===TESTE 5: findAll department ====");
		List<Department> list = departmentdao.findAll();
		for(Department d : list) {
			System.out.println(d);
		}
	}

}
