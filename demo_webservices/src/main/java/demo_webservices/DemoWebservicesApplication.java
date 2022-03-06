package demo_webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"demo_webservices"})
public class DemoWebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebservicesApplication.class, args);
	}

}
