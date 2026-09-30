package spring.example.codepran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.NativeDetector;

@SpringBootApplication
public class CodepranApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CodepranApplication.class, args);

		Order o = context.getBean(Order.class);
		o.data();

		user p = context.getBean(user.class);
		p.mm();




	}

}
