package com.ms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ms.mapping.many2one.College;
import com.ms.mapping.many2one.UniversityRepo;
import com.ms.mapping.many2one.University;
import com.ms.mapping.one2many.Category;
import com.ms.mapping.one2many.CategoryRepo;
import com.ms.mapping.one2many.Product;
import com.ms.mapping.one2many.ProductRepo;
import com.ms.mapping.one2one.Adhar;
import com.ms.mapping.one2one.AdharRepo;
import com.ms.mapping.one2one.PersonRepo;
import com.ms.mapping.one2one.Person;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner{
	@Autowired
	UniversityRepo universityRepo;
	@Autowired
	AdharRepo adharRepo;
	
	@Autowired
	CategoryRepo categoryRepo;
	
	@Autowired
	UniversityRepo collegeRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// OneToOne Mapping=> 1 Person <-> 1 Adhar
		/*Person person1 = new Person();

		person1.setId(1);
		person1.setName("Rama");
		person1.setMobile("12345");

		Adhar adhar1 = new Adhar();

		adhar1.setId(1);
		adhar1.setAdharNum(334523189733L);
		adhar1.setCity("bng");
		adhar1.setState("karnataka");
		adhar1.setPincode(325465);
		adhar1.setCountry("india");
		adhar1.setPerson(person1);
		
		person1.setAdhar(adhar1);
		
		personRepo.save(person1);*/
		
		
		//OneToMany => One Category <-> Many Products
		/*Category category = new Category();
		category.setId(1);
		category.setCategoryName("electronics");
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setBrand("LED");
		product1.setPrice(15000);
		product1.setCategory(category);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setBrand("Mobile");
		product2.setPrice(12000);
		product2.setCategory(category);
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setBrand("Laptop");
		product2.setPrice(150000);
		product2.setCategory(category);
		
		List<Product> products = Arrays.asList(product1,product2,product3);
		
		category.setProducts(products);
		
		categoryRepo.save(category); */
		
		
		//ManyToOne => Many Colleges <-> One University
		College clg1 = new College();
		clg1.setId(1);
		clg1.setName("ABC College");
		clg1.setClgType("Autonomous");
		
		College clg2 = new College();
		clg2.setId(2);
		clg2.setName("BCA College");
		clg2.setClgType("Goverment");
		
		College clg3 = new College();
		clg3.setId(3);
		clg3.setName("BGM College");
		clg3.setClgType("Private");
		
		
		University university = new University();
		university.setId(1);
		university.setName("VPGR, LAPOHB");
		university.setRegNo("R-32089-35");
		
		clg1.setUniversity(university);
		clg2.setUniversity(university);
		clg3.setUniversity(university);
		
		List<College> colleges = Arrays.asList(clg1,clg2,clg3);
		
		university.setColleges(colleges);
		
		universityRepo.save(university);
		
		 
	}

}
