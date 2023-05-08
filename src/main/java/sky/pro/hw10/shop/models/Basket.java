package sky.pro.hw10.shop.models;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class Basket {
    private final Set<Integer> ids = new HashSet<>();

    public void addAll(Set<Integer> id) {
        ids.addAll(id);
    }

    public Set<Integer> getAll() {
        return Collections.unmodifiableSet(ids);
    }

}