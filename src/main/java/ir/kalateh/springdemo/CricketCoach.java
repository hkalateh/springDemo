package ir.kalateh.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	private final FortuneService fortuneService;
	@Value("h.cricket@gmail.com")
	private String emailAddress;
	@Value("cricket")
	private String team;

	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice fast bowling for 15 minutes, if you have any question from team : " + team + " please deal with us with email: " + emailAddress;
	}
	
	@Override
	public String getDailyFortune() {
		return "let's do it: " + fortuneService.getFortune();
	}
	
	public void myInitMethod(){
		System.out.println("in cricket coach : in the init method");
	}
	
	public void myDestroyMethod(){
		System.out.println("in cricket coach : in the destroy method");
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
}
