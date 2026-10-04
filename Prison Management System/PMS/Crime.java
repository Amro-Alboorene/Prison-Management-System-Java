/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisonmanagementsystem;

/*
 * Developed by Ayah.
 */
public class Crime {

    private String type;
    private int severity;
    private double fine;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {

        if (severity >= 1 && severity <= 10) {
            this.severity = severity;
        } else {
            this.severity = 4;
        }
        setFine();
    }

    public double getFine() {
        return fine;
    }

    public void setFine() {

        if (severity <= 2) {
            fine = 50;
        }
        else if (severity <= 4) {
            fine = 150;
        }
        else if (severity <= 8) {
            fine = 300;
        }
        else {
            fine = 500;
        }
    }

    // Constructor
    public Crime(String type, int severity) {

        this.type = type;
        setSeverity(severity);
        setFine();
    }


    public String getTrialStatus() {

        if (severity >= 6) {
            return "High severity - Under strict trial";
        }
        else if (severity >= 3) {
            return "Moderate severity - Under trial";
        }
        else {
            return "Low severity - Minor case";
        }
    }

    @Override
    public String toString() {

        return "Crime Type: " + getType() +
                "\nSeverity: " + getSeverity() +
                "\nFine: " + getFine() +
                "\nTrial Status: " + getTrialStatus();
    }
}
 