
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisonmanagementsystem;

/*
 * Developed by Mahmoud.
 */

public class Prisoner extends Person {

    private String status;
    private int sentenceYears;
    private String entryDate;
    private String releaseDate;
    private Crime crime;
    private Cell cell;
    private Lawyer lawyer;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSentenceYears() {
        return sentenceYears;
    }

    public void setSentenceYears(int sentenceYears) {
        this.sentenceYears = sentenceYears;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Crime getCrime() {
        return crime;
    }

    public void setCrime(Crime crime) {
        this.crime = crime;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Lawyer getLawyer() {
        return lawyer;
    }

    public void setLawyer(Lawyer lawyer) {
        this.lawyer = lawyer;
    }
    
    
    
// Constructor
    public Prisoner(String name, int id,
                    String status,
                    int sentenceYears,
                    String entryDate,
                    String releaseDate,
                    Crime crime,
                    Cell cell,
                    Lawyer lawyer)
    {

        super(name, id);

        this.status = status;
        this.sentenceYears = sentenceYears;
        this.entryDate = entryDate;
        this.releaseDate = releaseDate;
        this.crime = crime;
        this.cell = cell;
        this.lawyer = lawyer;
    }

    public boolean isInTrial() {

        if (status.equalsIgnoreCase("Trial")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nStatus: " + status +
                "\nSentence Years: " + sentenceYears +
                "\nEntry Date: " + entryDate +
                "\nRelease Date: " + releaseDate +
                "\nCrime: " + crime +
                "\nCell: " + cell.getCellNumber() +
                "\nLawyer: " + lawyer.getName();
    }

    
    
}