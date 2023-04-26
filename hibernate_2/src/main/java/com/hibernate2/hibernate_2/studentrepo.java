package com.hibernate2.hibernate_2;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.List;

public interface studentrepo extends CrudRepository<student, Long> {
    @Query("from student")
    List<student> findAllStudent(PageRequest pageRequest);

    @Query("select firstname,lastname from student st")
    List<Object[]> findAllStudentsPartialData();

    @Query("from student where firstname=:firstname")
    List<student> findAllStudentByFirstName(@Param("firstname")String firstname);

    @Query("from student where score>:min and score<:max")
    List<student> findStudentsForGivenScores(@Param("min")int min,@Param("max") int max);

    @Modifying
    @Query("delete from student where firstname=:first_name")
    void deleteStudentsByFirstName(@Param("first_name") String first_name);

    @Query(value = "select * from student",nativeQuery = true)
    List<student> findAllByStudentNQ();

    @Query(value = "select * from student where fname=:firstname",nativeQuery = true)
    List<student> findByFirstNameNQ(@Param("firstname") String firstname);
}
