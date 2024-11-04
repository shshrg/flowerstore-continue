package flower.store.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import flower.store.Flower;
// import flower.store.Rose;
// import flower.store.Tulip;
import flower.store.repository.FlowerRepository;
// import jakarta.annotation.PostConstruct;


@Service
public class FlowerService {
    private final FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    // @PostConstruct
    // public void init() {
    //     flowerRepository.save(new Rose());
    //     flowerRepository.save(new Tulip());
    // }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public Flower addFlower(Flower flower) {
        return flowerRepository.save(flower);
    }
}
