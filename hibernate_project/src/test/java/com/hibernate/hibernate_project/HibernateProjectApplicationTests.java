package com.hibernate.hibernate_project;

import jakarta.persistence.Access;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
class HibernateProjectApplicationTests {

	@Autowired
	repose repostary1;

	@Test
	void contextLoads() {
	}
@Test
	public void testCreate() {
		product prod = new product();
		product prod1 = new product();
		prod.setId(1);
		prod.setName("shubh");
		prod.setDesc("great");
		prod.setPrice(1000d);

		prod1.setId(2);
		prod1.setName("shubh2");
		prod1.setDesc("greatwork");
		prod1.setPrice(1309d);

		repostary1.save(prod);
		repostary1.save(prod1);

	}
	@Test
	public void textread(){
		product prod =repostary1.findById(1).get();
		assertNotNull (prod);
		assertEquals("shubh",prod.getName());
		System.out.println("---------------"+prod.getDesc()+"----------");
	}
	@Test
	public void testupdate(){
	product prod = repostary1.findById(1).get();
	prod.setPrice(2303d);
	repostary1.save(prod);
	}
	@Test
	public void testdelete(){
		if(repostary1.existsById(1)){
		repostary1.deleteById(1);}
}
	@Test
	public void testcount() {
		System.out.println("records"+repostary1.count());
	}
}
@RunWith(SpringRunner.class)
@SpringBootTest
class id_genratortests{
	@Autowired
	employee_repos emprs;
	@Test
	void contextLoads() {
	}
	@Test
	public void testcreate(){
		employee emp = new employee();
		emp.setName("shubh");
		emprs.save(emp);
	}
}