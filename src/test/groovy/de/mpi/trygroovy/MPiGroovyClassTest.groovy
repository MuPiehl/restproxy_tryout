package de.mpi.trygroovy

import de.mpi.tryouts.MainApp

/**
 * Created by MPi on 02.10.2014.
 */
class MPiGroovyClassTest extends GroovyTestCase {
    void testPrintText() {
        MPiGroovyClass.printText();
        MainApp.forTest();
    }
}
