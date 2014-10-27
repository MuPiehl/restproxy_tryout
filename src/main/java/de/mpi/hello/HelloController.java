package de.mpi.hello;

import de.mpi.MPiGroovy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by MPi on 23.10.2014.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!\n</br>" + new MPiGroovy().getMessage();
    }
}
