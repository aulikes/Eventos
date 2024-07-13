package com.event.app.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserValidatedEvent {
    private final String username;
    private final boolean isValid;
}
