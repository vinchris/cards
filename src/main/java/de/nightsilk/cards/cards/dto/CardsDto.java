package de.nightsilk.cards.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(name = "CardsDto", description = "Schema to hold card details")
@Data
public class CardsDto {

    @NotEmpty(message = "Mobile Number cannot be empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile Number must be 10 digits")
    @Schema(example = "1234567890", description = "Mobile Number of the Customer")
    private String mobileNumber;

    @NotEmpty(message = "Card Number cannot be empty")
    @Pattern(regexp = "^[0-9]{12}$", message = "Card Number must be 12 digits")
    @Schema(example = "123456789012", description = "Card Number of the Customer")
    private String cardNumber;

    @NotEmpty(message = "Card Type cannot be empty")
    @Schema(example = "Credit Card", description = "Card Type of the Customer")
    private String cardType;

    @Positive(message = "Total Limit must be a positive number")
    @Schema(example = "100000", description = "Total Limit against a card of the Customer")
    private int totalLimit;

    @PositiveOrZero(message = "Amount Used must be a non-negative number")
    @Schema(example = "1000", description = "Amount Used against a card of the Customer")
    private int amountUsed;

    @PositiveOrZero(message = "Available Amount must be a non-negative number")
    @Schema(example = "90000", description = "Available Amount against a card of the Customer")
    private int availableAmount;
}
