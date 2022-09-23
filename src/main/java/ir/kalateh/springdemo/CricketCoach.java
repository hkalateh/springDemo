package ir.kalateh.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "practice fast bowling for 15 minutes";
	}
	
	@Override
	public String getDailyFortune() {
		return "let's do it: " + fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
