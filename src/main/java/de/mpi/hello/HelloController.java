package de.mpi.hello;

import de.mpi.MPiGroovy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


/**
 * Created by MPi on 23.10.2014.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        String result = "Greetings from Spring Boot!\n</br>" + new MPiGroovy().getMessage();

        try {
            URL oracle = new URL("http://www.oracle.com/");
            BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        return result;
    }
}
