package com.zulin.k8stomcathellocall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class K8sTomcatHelloCallApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sTomcatHelloCallApplication.class, args);
    }

    @GetMapping("/")
    public String index(){
        RestTemplate rest = new RestTemplate();
        String url = "http://tomcat-hello";
        String resp = rest.getForEntity(url,String.class).getBody();
        return resp;
    }
}
