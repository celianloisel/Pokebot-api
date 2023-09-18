package com.pokebot.api.service.getCardInfo;

import com.pokebot.api.config.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class GetCardInfoServiceImpl implements GetCardInfoService {

    private final RestTemplate restTemplate;
    @Value("${tcgdex.api.baseurl}")
    private String tcgdexBaseUrl;
    @Value("${tcgdex.api.version}")
    private String tcgdexVersion;

    public GetCardInfoServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getCardInfoWithSetAndLocalId(String set, String cardLocalId) {
        String apiUrl = String.format("%s/%s/fr/sets/%s/%s", tcgdexBaseUrl, tcgdexVersion, set, cardLocalId);

        try {
            return restTemplate.getForObject(apiUrl, String.class);
        } catch (HttpClientErrorException.NotFound ex) {
            throw new ResourceNotFoundException("La carte avec le set " + set + " et l'ID local " + cardLocalId + " n'a pas été trouvée.");
        }
    }

    public String getCardInfoWithId(String id) {
        String apiUrl = String.format("%s/%s/fr/cards/%s", tcgdexBaseUrl, tcgdexVersion, id);

        try {
            return restTemplate.getForObject(apiUrl, String.class);
        } catch (HttpClientErrorException.NotFound ex) {
            throw new ResourceNotFoundException("La carte avec l'ID " + id + " n'a pas été trouvée.");
        }
    }
}
