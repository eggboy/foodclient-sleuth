package io.pivotal.foodclient.controller;

import io.pivotal.foodclient.domain.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FoodClientController {
    @Value("${foodservice.url}")
    private String URL;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/food/{id}")
    public Food getFood(@PathVariable Integer id) {
        return restTemplate.getForObject(URL + id, Food.class);
    }
}
