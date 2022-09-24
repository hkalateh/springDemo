package ir.kalateh.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	@Override
	public String getDailyWorkout() {
		return "practice fast bowling for 15 minutes, if you have any question from team : " + team + " please deal with us with email: " + emailAddress;
	}
	
	@Override
	public String getDailyFortune() {
		return "let's do it: " + fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
}
