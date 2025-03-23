package de.nightsilk.cards.cards.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(
        name = "CRUD REST APIs for Cards in PookyBank",
        description = "CRUD REST APIs in PookyBank to CREATE, UPDATE, FETCH AND DELETE card details"
)
@RestController
@RequestMapping(path = "/api/cards", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
public class CardsController {

    /**
     * Health check endpoint for the Cards REST API.
     *
     * @return a string stating that the Cards App is up and running
     */
    @GetMapping("/healthCheck")
    public String performCardsAppHealthCheck() {
        return "Cards REST API is up and running";
    }
}
