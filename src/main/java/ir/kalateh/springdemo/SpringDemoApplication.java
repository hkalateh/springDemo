package ir.kalateh.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@PropertySource("sport.properties")
public class SpringDemoApplication {
	
	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		Coach theCoach = context.getBean("cricketCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
//		context.close();
		
	}
	
}
