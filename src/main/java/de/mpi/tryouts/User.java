package de.mpi.tryouts;

/**
 * Created by MPi on 09.10.2014.
 */
public class User {
    private final int count;
    private String vorname;
    private String nachname;

    public User(int count) {
        this.count = count;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getCount() {
        return count;
    }
}
