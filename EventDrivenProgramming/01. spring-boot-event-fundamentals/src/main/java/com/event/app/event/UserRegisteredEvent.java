package com.event.app.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//NO ES NECESARIO COLOCAR extends ApplicationEvent, eso era antes de SpringBoot 3
@Getter
@RequiredArgsConstructor
public class UserRegisteredEvent {

    private final String username;
    private final String password;
    private final byte age;

    @Override
    public String toString() {
        return "UserRegisteredEvent{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
