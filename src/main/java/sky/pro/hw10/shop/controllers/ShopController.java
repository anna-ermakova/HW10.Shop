package sky.pro.hw10.shop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.hw10.shop.services.ShopService;

import java.util.List;

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
    public void add(@RequestParam("id") List<Integer> values) {
        shopService.addAll(values);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return shopService.getAll();
    }
}
