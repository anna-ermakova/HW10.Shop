package sky.pro.hw10.shop.models;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> basket = new ArrayList<>();

    public void addAll(List<Integer> values) {
        basket.addAll(values);
    }

    public List<Integer> getAll() {
        return basket;
    }

}