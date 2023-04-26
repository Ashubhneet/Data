import org.Hibernate.Employee;
import org.Hibernate.ProductRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = {org.Hibernate.DatabaseExampleApplication.class})
public class DatabaseExampleApplicationTests {
    @Autowired
    ProductRepo productRepo;

    @Test
    void contextLoads(){

    }

    @Test
    void add() {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setAge(23);
        e1.setLocation("Delhi");
        e1.setName("shubh");
        productRepo.save(e1);

    }

    @Test
    public void read() {
        Employee e1 = productRepo.findById(1).get();
        assertNotNull(e1);
        assertEquals("shubh", e1.getName());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>" + e1.getLocation());

    }

    @Test
    public void testupdate() {
        Employee e1 = productRepo.findById(1).get();
        e1.setAge(29);
        productRepo.save(e1);
        assertEquals(29,e1.getAge());
    }

    @Test
    public void testDelete() {
        productRepo.deleteById(1);
    }

    @Test
    public void textcount() {
        System.out.println("#############" + productRepo.count());
    }

    @Test
    public void testfindByname() {
        List<Employee> emp = productRepo.findByName("shubh");
        emp.forEach(p->assertEquals("shubh", p.getName()));
    }


    @Test
    public void testfindagebetween() {
        List<Employee> emp = productRepo.findByAgeBetween(28, 30);
        emp.forEach(e->System.out.println(e.getName()));
    }

    @Test
    public void testFindByLike() {
        List<Employee> emp = productRepo.findByNameLike("A%");
        emp.forEach(e -> System.out.println(e.getId() + "     " + e.getName() + "      " + e.getLocation() + "       " + e.getAge()));
        emp.forEach(e->assertEquals("Anmol",e.getName()));
    }

    @Test
    public void testFndAllPagingAndSorting(){
        Pageable page= PageRequest.of(0, 3, Sort.Direction.ASC, "age");
        productRepo.findAll(page).forEach(p-> System.out.println(p.getName()));

    }
}
