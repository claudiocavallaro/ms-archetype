#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ${msNameUpper}BeApplication {

    public static void main(String[] args) {
        SpringApplication.run(${msNameUpper}BeApplication.class, args);
    }

}
