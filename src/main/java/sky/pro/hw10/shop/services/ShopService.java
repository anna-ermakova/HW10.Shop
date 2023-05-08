package sky.pro.hw10.shop.services;

import org.springframework.stereotype.Service;
import sky.pro.hw10.shop.models.Basket;
import sky.pro.hw10.shop.models.Item;
import sky.pro.hw10.shop.repository.ShopRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ShopService {

    private final Basket basket;
    private final ShopRepository shopRepository;

    public ShopService(Basket basket, ShopRepository shopRepository) {
        this.basket = basket;
        this.shopRepository = shopRepository;
    }

    public void addAll(Set<Integer> id) {
        basket.addAll(id);
    }

    public List<Item> getAll() {
        return basket.getAll().stream()
                .map(id -> shopRepository.get(id))
                .collect(Collectors.toList());
    }
}


