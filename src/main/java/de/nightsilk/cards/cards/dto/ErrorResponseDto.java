package de.nightsilk.cards.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(name = "ErrorResponseDto", description = "Schema that holds error response information")
@Data @AllArgsConstructor
public class ErrorResponseDto {

    @Schema(description = "API path that was invoked by the client")
    private String apiPath;

    @Schema(description = "Status code of the error response")
    private HttpStatus statusCode;

    @Schema(description = "Status message of the error response")
    private String statusMessage;

    @Schema(description = "Timestamp when the error occurred")
    private LocalDateTime errorTime;
}
