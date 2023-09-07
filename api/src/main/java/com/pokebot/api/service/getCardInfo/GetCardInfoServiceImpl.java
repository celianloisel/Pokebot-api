package com.pokebot.api.service.getCardInfo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetCardInfoServiceImpl implements GetCardInfoService {

    @Value("${tcgdex.api.baseurl}")
    private String tcgdexBaseUrl;

    private final RestTemplate restTemplate;

    public GetCardInfoServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getCardInfoWithSetAndLocalId(String set, String cardLocalId) {
        String apiUrl = String.format("%s/v2/fr/sets/%s/%s", tcgdexBaseUrl, set, cardLocalId);

        return restTemplate.getForObject(apiUrl, String.class);
    }

    public String getCardInfoWithId(String id) {
        String apiUrl = String.format("%s/v2/fr/cards/%s", tcgdexBaseUrl, id);

        return restTemplate.getForObject(apiUrl, String.class);
    }
}
