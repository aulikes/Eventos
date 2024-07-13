package com.event.app.listener;

import com.event.app.event.UserRegisteredEvent;
import com.event.app.event.UserValidatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener {

//    @EventListener
//    public void listenUserRegisteredEvent(UserRegisteredEvent userRegisteredEvent){
//        System.out.println("LISTENING: Event has been listened -> ".concat(userRegisteredEvent.toString()));
//    }

    /**
     *
     * ESTE MÉTODO SI SE USA, SOLO ES ES UN LISTENER QUE SE DISPARA UNA VEZ SE IMPLEMENTA userRegisteredEvent
     * @param userRegisteredEvent
     * @return
     */
    @EventListener
    public UserValidatedEvent listenUserRegisteredEvent(UserRegisteredEvent userRegisteredEvent){
        System.out.println("LISTENING listenUserRegisteredEvent: Event has been listened -> ".concat(userRegisteredEvent.toString()));
        return new UserValidatedEvent(userRegisteredEvent.getUsername(), true);
    }

    /**
     * ESTE MÉTODO SI SE USA, SOLO ES ES UN LISTENER QUE SE DISPARA UNA VEZ SE IMPLEMENTA UserValidatedEvent
     * @param userValidatedEvent
     */
    @EventListener
    public void listenUserValidatedEvent(UserValidatedEvent userValidatedEvent){
        System.out.println("LISTENING listenUserValidatedEvent: Event has been listened -> ".concat(userValidatedEvent.toString()));
    }
}
