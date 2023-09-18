package com.pokebot.api.service.GetAllCards;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetAllCardsServiceImpl implements GetAllCardsService {

    private final RestTemplate restTemplate;
    @Value("${tcgdex.api.baseurl}")
    private String tcgdexBaseUrl;
    @Value("${tcgdex.api.version}")
    private String tcgdexVersion;

    public GetAllCardsServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getAllCards() {
        String apiUrl = String.format("%s/%s/fr/cards", tcgdexBaseUrl, tcgdexVersion);

        return restTemplate.getForObject(apiUrl, String.class);
    }
}
