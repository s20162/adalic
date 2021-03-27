package pl.pjatk.adalic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public POJO myPojo() {
        return new POJO("a", 1, 2, 3);
    }
    @Bean
    public List<String> defaultData() {
        return List.of("1", "2", "3", "4", "5");
    }
    }
