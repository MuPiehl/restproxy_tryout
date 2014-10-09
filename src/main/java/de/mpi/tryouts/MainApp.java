package de.mpi.tryouts;


import de.mpi.trygroovy.MPiGroovyClass;

/**
 * Created by MPi on 02.10.2014.
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("Ausgabe aus der main()-Methode");

        MPiGroovyClass.printText();
    }

    public static void forTest() {
        System.out.println("***** forTest (java) *****");

        main(null);
    }
}
