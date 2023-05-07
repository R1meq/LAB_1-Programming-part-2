package ua.lviv.iot.algo.part1.ShipApp.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan({
        "ua.lviv.iot.algo.part1.ShipApp.mapper",
        "ua.lviv.iot.algo.part1.ShipApp.service",
        "ua.lviv.iot.algo.part1.ShipApp.controllers"
})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RestApplication {

    public static void main(final String[] arg) {
        SpringApplication.run(RestApplication.class, arg);
    }

}
