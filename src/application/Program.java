package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Projetos");
		
		Seller seller = new Seller(29, "PH", "PHgmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);

	}

}
