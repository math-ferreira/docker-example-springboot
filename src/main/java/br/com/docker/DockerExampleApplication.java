package br.com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerExampleApplication.class, args);
    }

    @GetMapping("/hello-world")
    private String getHelloWorld() {
        return "Hello world springboot-docker";
    }
}
