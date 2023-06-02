package dev.leanne.SpringBootAppFirst.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ImmutableLiveStreamTest {
    /*
     * Unit testing using Junit assertions
     */
    @Test
    void create_new_immutable_live_stream() {
        //stream is a new instance of MutableLiveStream
        ImmutableLiveStream stream = new ImmutableLiveStream(
                "1",
                "Spring Boot API building",
                "https://www.hello.com",
                "Build an API using spring boot in IntelliJ");

        assertNotNull(stream);
        assertEquals("Spring Boot API building", stream.getTitle());

    }
}
