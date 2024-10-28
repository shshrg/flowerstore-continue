package flower.store.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import flower.store.Flower;
import flower.store.Rose;
import flower.store.Tulip;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {



    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(
            new Rose(),
            new Tulip()
        );
    }

}