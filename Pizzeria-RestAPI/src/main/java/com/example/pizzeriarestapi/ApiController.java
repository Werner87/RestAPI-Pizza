package com.example.pizzeriarestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/pizzas")
public class ApiController {

    private final PizzaRepository pizzaRepository;

    @Autowired
    public ApiController(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @GetMapping
    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Pizza getPizzaById(@PathVariable Long id) {
        return pizzaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Pizza createPizza(@RequestBody Pizza pizza) {
        pizza.setPrice(1);
        return pizzaRepository.save(pizza);
    }

    @PutMapping("/{id}")
    public Pizza updatePizza(@PathVariable Long id, @RequestBody Pizza pizzaDetails) {
        Pizza pizza = pizzaRepository.findById(id).orElse(null);
        if (pizza != null) {
            pizza.setName(pizzaDetails.getName());
            pizza.setDescription(pizzaDetails.getDescription());
            return pizzaRepository.save(pizza);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePizza(@PathVariable Long id) {
        pizzaRepository.deleteById(id);
    }
}
