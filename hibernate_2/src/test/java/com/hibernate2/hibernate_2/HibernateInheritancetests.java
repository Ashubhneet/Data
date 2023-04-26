package com.hibernate2.hibernate_2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateInheritancetests {
    @Autowired
    PaymentRepo payrepo;
    @Test
    public void contextLoads(){}

    @Test
    public void createPayment(){
        Credit_Card cd =new Credit_Card();
        cd.setId(1233);
        cd.setAmount(23d);
        cd.setCard_no("jdf123");
        payrepo.save(cd);

        Check ck =new Check();
        ck.setId(123);
        ck.setAmount(2303d);
        ck.setCheck_no("123asdf");
        payrepo.save(ck);

    }

}
