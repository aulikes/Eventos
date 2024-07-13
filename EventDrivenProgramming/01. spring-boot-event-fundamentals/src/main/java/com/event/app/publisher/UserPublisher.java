package com.event.app.publisher;

import com.event.app.event.UserRegisteredEvent;
import com.event.app.event.UserValidatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserPublisher {

    private final ApplicationEventPublisher eventPublisher;

    /**
     * SE LES DICE PUBLISHER, PERO PUEDEN SER Services EN SPRINGBOOT
     * @param username
     * @param password
     * @param age
     */
    public void publishUserRegisteredEvent(String username, String password, byte age){
        System.out.println("PUBLISH publishUserRegisteredEvent: Event has been published");
        eventPublisher.publishEvent(new UserRegisteredEvent(username, password, age));
    }

    /**
     * SE LES DICE PUBLISHER, PERO PUEDEN SER Services EN SPRINGBOOT
     * @param username
     * @param password
     * @param age
     */
    public void publishUserValidatedEvent(String username, String password, byte age){
        System.out.println("PUBLISH publishUserValidatedEvent: Event has been published");
        eventPublisher.publishEvent(new UserValidatedEvent(username, true));
    }
}
