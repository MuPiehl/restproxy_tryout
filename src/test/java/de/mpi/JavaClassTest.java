package de.mpi;

import de.mpi.tryouts.MainApp;
import junit.framework.TestCase;

/**
 * Created by MPi on 09.10.2014.
 */
public class JavaClassTest extends TestCase {


    public void testMPi(){
        System.out.println("***** Test (java) *****");
        assertEquals(1, MainApp.getCount());
    }
}
