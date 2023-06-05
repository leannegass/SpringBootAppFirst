package dev.leanne.SpringBootAppFirst.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public record Greeting(long id, String content) { }