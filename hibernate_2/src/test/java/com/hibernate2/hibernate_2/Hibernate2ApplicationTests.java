package com.hibernate2.hibernate_2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest//(classes = {com.hibernate2.hibernate_2.Hibernate2Application.class})
class Hibernate2ApplicationTests {
	@Autowired
	studentrepo repo;
	@Test
	public void testStudentCreate(){
		student stud = new student();
		stud.setFirstname("shubh");
		stud.setLastname("agg");
		stud.setScore(23);
		repo.save(stud);

		student stud1 = new student();
		stud1.setFirstname("abcd");
		stud1.setLastname("ggaw");
		stud1.setScore(28);
		repo.save(stud1);

		student stud2 = new student();
		stud2.setFirstname("efgh");
		stud2.setLastname("asdf");
		stud2.setScore(25);
		repo.save(stud2);
	}
	@Test
	public void testFindAllStudents()
	{
		System.out.println(repo.findAllStudent(PageRequest.of(0,2, Sort.Direction.DESC,"score")));
	}
	@Test
	public void testFindAllStudentsPartialData()
	{
		List<Object[]> partialData = repo.findAllStudentsPartialData();
		for (Object[] objects:partialData){
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
	}
	@Test
	public void testFindAllStudentsByFirstName() {
			System.out.println(repo.findAllStudentByFirstName("shubh"));
	}
	@Test
	public void testFindStudentsForGivenScores() {
		System.out.println(repo.findStudentsForGivenScores(20, 26));
	}
	@Test
	@Transactional
	@Rollback(false)
	public void testDeleteStudentByFirstName(){
		repo.deleteStudentsByFirstName("shubh");
	}

	@Test
	public void testFindAllBStudentNQ(){
		System.out.println(repo.findAllByStudentNQ());
	}

	@Test
	public void testFindByFirstNameNQ(){
		System.out.println(repo.findByFirstNameNQ("shubh"));
	}
}
