package de.nightsilk.cards.cards.mapper;

import de.nightsilk.cards.cards.dto.CardsDto;
import de.nightsilk.cards.cards.entity.Cards;

/**
 * Maps {@link Cards} and {@link CardsDto} objects in both directions.
 *
 * @author Cristian Vintilescu
 */
public class CardsMapper {

    /**
     * Maps a {@link Cards} object to a {@link CardsDto} object.
     *
     * @param card the {@link Cards} object to map
     * @param cardDto the {@link CardsDto} object to populate
     * @return the populated {@link CardsDto}
     */
    public static CardsDto mapToCardsDto(Cards card, CardsDto cardDto){

        cardDto.setMobileNumber(card.getMobileNumber());
        cardDto.setCardNumber(card.getCardNumber());
        cardDto.setCardType(card.getCardType());
        cardDto.setTotalLimit(card.getTotalLimit());
        cardDto.setAmountUsed(card.getAmountUsed());
        cardDto.setAvailableAmount(card.getAvailableAmount());

        return cardDto;

    }

    /**
     * Maps a {@link CardsDto} to a {@link Cards} object.
     *
     * @param cardDto the {@link CardsDto} to map
     * @param card the {@link Cards} object to populate
     * @return the populated {@link Cards}
     */
    public static Cards mapToCards(CardsDto cardDto, Cards card){

        card.setMobileNumber(cardDto.getMobileNumber());
        card.setCardNumber(cardDto.getCardNumber());
        card.setCardType(cardDto.getCardType());
        card.setTotalLimit(cardDto.getTotalLimit());
        card.setAmountUsed(cardDto.getAmountUsed());
        card.setAvailableAmount(cardDto.getAvailableAmount());

        return card;
    }
}
