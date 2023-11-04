package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
class App
{

//    @Autowired
//    @Qualifier("applicationName")
//    private String applicationName;

    @Value("${application.name}")
    private String applicationName;

    @Autowired
    @Qualifier("cachorro")
    private Animal animal;

    @Bean
    public CommandLineRunner execute(){
        return args -> {
            this.animal.fazerBarrulho();
        };
    }
    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }
}
