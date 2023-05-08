package sky.pro.hw10.shop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.hw10.shop.models.Item;
import sky.pro.hw10.shop.services.ShopService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class ShopController {
    private final ShopService shopService;


    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    public String greeting() {
        return "Hi, have a nice shopping!";
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") Set<Integer> id) {
        shopService.addAll(id);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return shopService.getAll();
    }
}
