package com.pokebot.api.controller;

import com.pokebot.api.service.getCardInfo.GetCardInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetCardInfoController {
    private final GetCardInfoService getCardInfoService;

    public GetCardInfoController(GetCardInfoService getCardInfoService) {
        this.getCardInfoService = getCardInfoService;
    }

    @GetMapping("/getCardInfoWithSetAndLocalId/{set}/{cardLocalId}")
    public String getCardInfoWithSetAndLocalId(@PathVariable String set, @PathVariable String cardLocalId) {
        return getCardInfoService.getCardInfoWithSetAndLocalId(set, cardLocalId);
    }

    @GetMapping("/getCardInfoWithId/{id}")
    public String getCardInfoWithId(@PathVariable String id) {
        return getCardInfoService.getCardInfoWithId(id);
    }
}
