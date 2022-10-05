package ir.kalateh.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	@Override
	public String getDailyFortune() {
		return null;
	}
}
