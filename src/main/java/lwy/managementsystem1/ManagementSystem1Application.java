package lwy.managementsystem1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("lwy.managementsystem1.mapper")
@SpringBootApplication
public class ManagementSystem1Application {

    public static void main(String[] args) {

        SpringApplication.run(ManagementSystem1Application.class, args);
    }

}
