import java.util.*;
import java.text.*;
import java.sql.*;

public class Aufgabe {
a
	private String aufgabentext;
    private GregorianCalender dautumErstellung;

    public GregorianCalender getDautumErstellung() {
        return dautumErstellung;
    }

    public void setDautumErstellung(GregorianCalender dautumErstellung) {
        this.dautumErstellung = dautumErstellung;
    }
    
    /**
     * Get the value of aufgabentext
     *
     * @return the value of aufgabentext
     */
    public String getAufgabentext() {
        return aufgabentext;
    }

    /**
     * Set the value of aufgabentext
     *
     * @param aufgabentext new value of aufgabentext
     */
    public void setAufgabentext(String aufgabentext) {
        this.aufgabentext = aufgabentext;
    }

}
