package flower.store;

import java.util.List;
import flower.store.Flower;
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
					new Rose(),
					new Tulip()
				),
				null
			)
		);
	} 

}
