package com.idi.gameofthrones;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

/**
 * @author Evgeny Borisov
 */
public class MyListener {


    @EventListener(ContextRefreshedEvent.class)
    public void onApplicationEvent() {

    }
}
