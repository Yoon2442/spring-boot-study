package com.js; // 없어서 안됐었음 - 2023-04-12


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext context = SpringApplication.run(Application.class, args)) {
            // 애플리케이션 실행 코드
            System.out.println("Hello world!");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1); // 애플리케이션을 비정상적으로 종료
        }
    }
}