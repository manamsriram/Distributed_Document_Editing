package com.collaborative.editor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableWebSocket
public class CollaborativeDocumentEditorApplication {
    public static void main(String[] args) {
        SpringApplication.run(CollaborativeDocumentEditorApplication.class, args);
    }
}