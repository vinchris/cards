package de.nightsilk.cards.cards.service.impl;

import de.nightsilk.cards.cards.dto.CardsDto;
import de.nightsilk.cards.cards.repository.CardsRepository;
import de.nightsilk.cards.cards.service.ICardsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CardsService implements ICardsService {

    private CardsRepository repository;

    @Override
    public void createCard(String mobileNumber) {

    }

    @Override
    public CardsDto fetchCard(String mobileNumber) {
        return null;
    }

    @Override
    public boolean updateCard(CardsDto cardsDto) {
        return false;
    }

    @Override
    public boolean deleteCard(String mobileNumber) {
        return false;
    }
}
