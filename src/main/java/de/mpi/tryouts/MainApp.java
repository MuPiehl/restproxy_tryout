package de.mpi.tryouts;


import de.mpi.trygroovy.MPiGroovyClass;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by MPi on 02.10.2014.
 */
public class MainApp {
    private static int count;

    public static void main(String[] args) {
        System.out.println("Ausgabe aus der main()-Methode");

        MPiGroovyClass.printText();

        User user = new User(getCount());
        user.setVorname("Eumel");
        user.setNachname("Sohn");
        ObjectMapper mapper = new ObjectMapper();

        try {
            String jasonString = mapper.writeValueAsString(user);
            System.out.println(jasonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void forTest() {
//        System.out.println("***** forTest (java) *****");
//
//        main(null);
//        count++;
//    }

    public static int getCount() {
        return ++count;
    }

    public static void setCount(int count) {
        MainApp.count = count;
    }
}
