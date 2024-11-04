package flower.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import flower.store.Flower;


@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long> {

    
}
