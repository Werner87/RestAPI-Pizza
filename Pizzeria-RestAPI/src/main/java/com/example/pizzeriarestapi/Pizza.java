package com.example.pizzeriarestapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int price;
    private String login;
    private String haslo;
    private String name;
    private String description;

    // konstruktory
    public Pizza(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // gettery, settery

    public int getPrice() {
        return price;
    }

    public void setPrice(int cena) {
        this.price = cena;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String hasło) {
        this.haslo = hasło;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

