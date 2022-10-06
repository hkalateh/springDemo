package ir.kalateh.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		String[] data = {
			"today is your lucky day", "today is not with you"
		};
		return data[new Random().nextInt(data.length)];
	}
}
