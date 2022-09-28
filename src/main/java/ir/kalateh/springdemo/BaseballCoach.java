package ir.kalateh.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Autowired
	public void myCustomMethod(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout(){
		return "spend 30 minutes on batting practice";
	}
	
	public String getDailyFortune(){
		return fortuneService.getFortune();
	}
}
