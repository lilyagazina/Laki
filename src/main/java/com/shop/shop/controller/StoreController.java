package com.shop.shop.controller;

import com.shop.shop.service.StoreService;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.*;

@RestController
@RequestMapping(path = "/order")
public class StoreController {
    private final StoreService service;

    public StoreController(StoreService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void addProducts(@RequestParam List<Integer> id){
        service.addProducts(id);
    }

    @GetMapping("/get")
    public List<Integer> getProducts() {
        return service.getProducts();
    }
}
