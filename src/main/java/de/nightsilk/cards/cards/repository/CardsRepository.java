package de.nightsilk.cards.cards.repository;

import de.nightsilk.cards.cards.entity.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CardsRepository extends JpaRepository<Cards, Long> {

    /**
     * Retrieve a {@link Cards} object given a mobile number.
     *
     * @param mobileNumber the mobile number to search for
     * @return an {@link Optional} containing the {@link Cards} object if found, or an empty {@link Optional}
     */
    Optional<Cards> findByMobileNumber(String mobileNumber);

    /**
     * Retrieve a {@link Cards} object given a card number.
     *
     * @param cardNumber the card number to search for
     * @return an {@link Optional} containing the {@link Cards} object if found, or an empty {@link Optional}
     */
    Optional<Cards> findByCardNumber(String cardNumber);
}
