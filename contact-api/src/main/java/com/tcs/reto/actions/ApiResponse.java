package com.tcs.reto.actions;

public record ApiResponse(int code, String message, Object data) {
}
