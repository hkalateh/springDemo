package ir.kalateh.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringApplication.run(SpringDemoApplication.class, args);
		Coach theCoach = (Coach) context.getBean("baseballCoach");
		System.out.println(theCoach.getDailyWorkout());
		context.close();
		
	}
	
}