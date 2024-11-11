package flower.store;

import flower.store.Flower;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EntityScan(basePackages = "flower.store")
@EnableJpaRepositories(basePackages = "flower.store.repository")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/order")
	public static List<Flower> listFlowers() {
		return List.of(new Flower(12L, 10.1, FlowerColor.RED, FlowerType.ROSE));
	}


}
