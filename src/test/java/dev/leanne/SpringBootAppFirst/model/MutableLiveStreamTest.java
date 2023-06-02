package dev.leanne.SpringBootAppFirst.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MutableLiveStreamTest {
    /*
    * Unit testing using Junit assertions
    */
    @Test
    void create_new_mutable_live_stream(){
        //stream is a new instance of MutableLiveStream
        MutableLiveStream stream = new MutableLiveStream();
        stream.setId("1");
        stream.setTitle("Spring Boot API building");
        stream.setDescription("Build an API using spring boot in IntelliJ");
        stream.setUrl("https://www.hello.com");

        assertNotNull(stream);
        assertEquals("Spring Boot API building", stream.getTitle());
    }

}
