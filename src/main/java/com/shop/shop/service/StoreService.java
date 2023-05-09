package com.shop.shop.service;

import com.shop.shop.model.ShopBasked;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private final ShopBasked shopBasked;

    public StoreService(ShopBasked shopBasked) {
        this.shopBasked = shopBasked;
    }

    public void addProducts(List<Integer> input) {
        shopBasked.addAll(input);
    }

    public List<Integer> getProducts() {
        return shopBasked.getAll();
    }
}
