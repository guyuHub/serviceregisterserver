package guyu.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {"guyu.test"}
)
public class TradeWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradeWebApplication.class, args);
    }

}

