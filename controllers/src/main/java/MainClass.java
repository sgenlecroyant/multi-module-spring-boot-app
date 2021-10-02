
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"repositories", "services", "controllers"})
//@EnableJpaRepositories(basePackages = "repositories")
public class MainClass {
	
	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
		System.out.println("running");
	}

}
