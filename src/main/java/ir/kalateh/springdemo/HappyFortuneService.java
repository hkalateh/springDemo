package ir.kalateh.springdemo;

import org.springframework.stereotype.Component;

@Component("fortuneService")
public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}
}
