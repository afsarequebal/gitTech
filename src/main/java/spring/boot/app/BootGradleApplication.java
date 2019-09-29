package spring.boot.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootGradleApplication.class, args);
		System.out.println("Hello r2 world1");
	}
}