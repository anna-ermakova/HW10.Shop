package sky.pro.hw10.shop.services;

import org.springframework.stereotype.Service;
import sky.pro.hw10.shop.models.Basket;

import java.util.List;

@Service
public class ShopService {

    private Basket basket;

    public void shopService(Basket basket) {
        this.basket = basket;
    }

    public void addAll(List<Integer> values) {
        basket.addAll(values);
    }

    public List<Integer> getAll() {
        return basket.getAll();
    }
}


