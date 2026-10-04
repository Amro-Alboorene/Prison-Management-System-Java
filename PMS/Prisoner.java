import java.time.LocalDate;

public class Prisoner extends Person {

    private int prisonerId;
    private String status;
    private int sentenceYears;
    private Crime crime;
    private Cell cell;
    private Lawyer lawyer;
    private PrisonerRecord prisonerRecord;

    

	public Prisoner(String name, int id, int age, String gender, String address, String phoneNumber, int prisonerId, String status,
			int sentenceYears, Crime crime, Cell cell, Lawyer lawyer, String recordId, LocalDate admissionDate, LocalDate releaseDate, 
            String securityLevel, String behaviorRating, int disciplinaryActions, String visitationStatus, String notes, String medicalRecordId, 
            String bloodType, String allergies, String chronicConditions, String currentMedications, String medicalStatus, LocalDate lastMedicalCheckup, String medicalNotes) {
		super(name, id, age, gender, address, phoneNumber);
		this.prisonerId = prisonerId;
		this.status = status;
		this.sentenceYears = sentenceYears;
		this.crime = crime;
		this.cell = cell;
		this.lawyer = lawyer;
		this.prisonerRecord = new PrisonerRecord(recordId, admissionDate, releaseDate, securityLevel, behaviorRating, disciplinaryActions, visitationStatus, notes, medicalRecordId, bloodType, allergies, chronicConditions, currentMedications, medicalStatus, lastMedicalCheckup, medicalNotes);
	}

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
    
    

    public boolean isInTrial() {

        if (status.equalsIgnoreCase("Trial")) {
            return true;
        } else {
            return false;
        }
    }

    public PrisonerMedicalRecord getPrisonerMedicalRecord() {
        return this.prisonerRecord.getMedicalRecord();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPrisoner ID: " + prisonerId +
                "\nStatus: " + status +
                "\nSentence Years: " + sentenceYears +
                "\nCrime: " + crime +
                "\nCell: " + cell.getCellNumber() +
                "\nLawyer: " + lawyer.getName() + 
                "\nPrisoner Record: " + prisonerRecord.toString();
    }

    
    
}