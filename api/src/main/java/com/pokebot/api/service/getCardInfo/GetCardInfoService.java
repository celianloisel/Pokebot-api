package com.pokebot.api.service.getCardInfo;

public interface GetCardInfoService {
    String getCardInfoWithSetAndLocalId(String set, String cardLocalId);
    String getCardInfoWithId(String id);
}
