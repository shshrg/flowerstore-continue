package flower.store.service;

import java.util.List;

import java.util.List;
import org.springframework.stereotype.Service;
import flower.store.Flower;
import flower.store.Rose;
import flower.store.Tulip;


@Service
public class FlowerService {
    public List<Flower> getFlowers() {
        return List.of(
            new Rose(),
            new Tulip()
        );
    }
}
