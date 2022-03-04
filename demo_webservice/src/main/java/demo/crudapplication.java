package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import demo.entity.asset_table;
import org.hibernate.cfg.Configuration;

import java.util.Date;

@SpringBootApplication
@ComponentScan("/demo/assetservice")
public class crudapplication {

    public static void main(String[] args) {

        SpringApplication.run(crudapplication.class, args);
        asset_table a = new asset_table();
        a.setName("sahil");
        a.setCreatedDateTime(new Date());
        a.setStatus("active");
        a.setCreatedby("rohan");
        a.setDescription("java developer");

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(a);
        session.getTransaction().commit();
        session.close();


    }
}


