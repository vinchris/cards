package de.nightsilk.cards.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(name = "ResponseDto", description = "Schema to hold the succesful response information")
@Data @AllArgsConstructor
public class ResponseDto {

    @Schema(example = "200", description = "Status code of the response")
    private String statusCode;

    @Schema(example = "Success", description = "Status message of the response")
    private String statusMessage;
}
