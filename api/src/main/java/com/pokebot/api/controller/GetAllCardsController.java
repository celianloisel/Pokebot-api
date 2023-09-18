package com.pokebot.api.controller;


import com.pokebot.api.service.GetAllCards.GetAllCardsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetAllCardsController {
    private final GetAllCardsService getAllCardsService;

    public GetAllCardsController(GetAllCardsService getAllCardsService) {
        this.getAllCardsService = getAllCardsService;
    }

    @GetMapping("/getAllCards")
    public String getAllCards() {
        return getAllCardsService.getAllCards();
    }
}
