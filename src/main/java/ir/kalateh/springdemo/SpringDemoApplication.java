package ir.kalateh.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
		BaseballCoach theCoach = new BaseballCoach();
		System.out.println(theCoach.getDailyWorkout());
	}
	
}
