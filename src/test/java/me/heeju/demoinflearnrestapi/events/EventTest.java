package me.heeju.demoinflearnrestapi.events;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EventTest {

    @Test
    public void builder(){
        Event event = Event.builder()
                .name("Inflearn study")
                .description("STUDY!!!")
                .build();
        assertThat(event).isNotNull();
    }

    @Test
    public void javaBean(){
        Event event = new Event();
        String name = "Inflearn study2";
        String description = "STUDY!!!!";
        event.setName(name);
        event.setDescription(description);
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);
    }
}