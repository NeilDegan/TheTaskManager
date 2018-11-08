import java.util.*;
import java.text.*;
import java.sql.*;

public class Aufgabe {

    private String aufgabentext;
    private GregorianCalender dautumErstellung;

    public GregorianCalender getDautumErstellung() {
        return dautumErstellung;
    }

    public void setDautumErstellung(GregorianCalender dautumErstellung) {
        this.dautumErstellung = dautumErstellung;
    }

    public String getAufgabentext() {
        return aufgabentext;
    }

    public void setAufgabentext(String aufgabentext) {
        this.aufgabentext = aufgabentext;
    }

}
