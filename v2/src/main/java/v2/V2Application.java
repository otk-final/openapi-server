package v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/22 15:46
 * Created by huangxy
 */
@SpringBootApplication
@EnableSwagger2
public class V2Application {

    public static void main(String[] args) {
        SpringApplication.run(V2Application.class, args);
    }
}
