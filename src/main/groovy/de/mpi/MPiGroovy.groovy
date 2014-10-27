package de.mpi

import de.mpi.tryouts.App

/**
 * Created by MPi on 24.10.2014.
 */
class MPiGroovy {
    static String printText() {
        return "Message from Groovy " + new Date() + "\n</br>" + App.lastReceivedMsgText;
    }

    public String getMessage() {
        App.main();
        return printText();
    }
}
