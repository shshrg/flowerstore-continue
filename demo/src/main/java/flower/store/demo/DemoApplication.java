package flower.store.demo;

import java.util.List;
import flower.store.demo.Flower;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// import flower from flowerbucket 
	@GetMapping("/flowers")
	public static List<Order> listFlowers() {
		return List.of(
			new Order(
				List.of(
					new Flower("rose", "pink"),
					new Flower("tulip", "white")
				),
				null
			)
		);
	} 

}
