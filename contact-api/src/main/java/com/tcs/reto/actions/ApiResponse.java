package com.tcs.reto.actions;

import lombok.Builder;

@Builder
public record ApiResponse(int code, String message, Object data) {
}
