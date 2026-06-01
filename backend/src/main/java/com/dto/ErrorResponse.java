package com.dto;

public record ErrorResponse(
        int status,
        String message,
        String details
) {
}
