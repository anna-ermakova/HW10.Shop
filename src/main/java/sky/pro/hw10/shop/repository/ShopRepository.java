package sky.pro.hw10.shop.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import sky.pro.hw10.shop.models.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ShopRepository {
    private int idCounter = 1;
    private final Map<Integer, Item> shop = new HashMap<>();

    @PostConstruct
    public void init() {
        shop.put(idCounter, new Item(idCounter++, "Ноутбук"));
        shop.put(idCounter, new Item(idCounter++, "Смартфон"));
        shop.put(idCounter, new Item(idCounter++, "Книга"));
        shop.put(idCounter, new Item(idCounter++, "Сумка"));
    }

    public void add(Item item) {
        shop.put(item.getId(), item);
    }

    public Item get(int id) {
        return shop.get(id);
    }

    public List<Item> getAll() {
        return new ArrayList<>(shop.values());
    }
    public void update(int id, Item item) {
        if (shop.containsKey(id)) {
            shop.replace(id, item);
        }
    }

    public Item delete(int id) {
        return shop.remove(id);
    }
}
