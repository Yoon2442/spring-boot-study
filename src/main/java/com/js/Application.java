package com.js; 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// memo 
// package 명시를 하지 않아서 에러 - 2023-04-12
// jre 버전이 맞지 않아서 에러 -> jdk 디렉토리 추가 후 해결 - 2023-04-12 

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext context = SpringApplication.run(Application.class, args)) {
            // 애플리케이션 실행 코드
            int i=0;
            while (i<200) {
                System.out.println("Hello world! "+ i);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1); // 애플리케이션을 비정상적으로 종료
        }
    }
}