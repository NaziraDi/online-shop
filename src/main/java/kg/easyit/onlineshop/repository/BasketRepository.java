package kg.easyit.onlineshop.repository;

import kg.easyit.onlineshop.model.entity.Basket;
import kg.easyit.onlineshop.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Long> {

    Optional<Basket> findBasketByUserIdAndIsActiveTrue(Long userId);

}
