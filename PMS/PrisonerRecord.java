import java.time.LocalDate;

public class PrisonerRecord {
    private String recordId;
    private LocalDate admissionDate;
    private LocalDate releaseDate;
    private String securityLevel;
    private String behaviorStatus;
    private int disciplinaryActions;
    private String visitationStatus;
    private String notes;
    private PrisonerMedicalRecord medicalRecord;

    //Constructor
    public PrisonerRecord(String recordId, LocalDate admissionDate, LocalDate releaseDate, String securityLevel, String behaviorStatus, int disciplinaryActions, String visitationStatus, String notes, String medicalRecordId, String bloodType, String allergies, String chronicConditions, String currentMedications, String medicalStatus, LocalDate lastMedicalCheckup, String medicalNotes) {
        this.recordId = recordId;
        this.admissionDate = admissionDate;
        this.releaseDate = releaseDate;
        this.securityLevel = securityLevel;
        this.behaviorStatus = behaviorStatus;
        this.disciplinaryActions = disciplinaryActions;
        this.visitationStatus = visitationStatus;
        this.notes = notes;
        this.medicalRecord = new PrisonerMedicalRecord(medicalRecordId, bloodType, allergies, chronicConditions, currentMedications, medicalStatus, lastMedicalCheckup, medicalNotes);
    }

	public String getRecordId() {
		return recordId;
	}

	public LocalDate getAdmissionDate() {
		return admissionDate;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getSecurityLevel() {
		return securityLevel;
	}

	public void setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}

	public String getBehaviorStatus() {
		return behaviorStatus;
	}

	public void setBehaviorStatus(String behaviorStatus) {
		this.behaviorStatus = behaviorStatus;
	}

	public int getDisciplinaryActions() {
		return disciplinaryActions;
	}

	public void setDisciplinaryActions(int disciplinaryActions) {
		this.disciplinaryActions = disciplinaryActions;
	}

	public String getVisitationStatus() {
		return visitationStatus;
	}

	public void setVisitationStatus(String visitationStatus) {
		this.visitationStatus = visitationStatus;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public PrisonerMedicalRecord getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(PrisonerMedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	@Override
	public String toString() {
		return "Prisoner Record" +
        "\nRecord Id: " + recordId + 
        "\nAdmission Date: " + admissionDate + 
        "\nRelease Date: " + releaseDate + 
        "\nSecurity Level: " + securityLevel + 
        "\nBehavior Status: " + behaviorStatus + 
        "\nDisciplinary Actions: " + disciplinaryActions + 
        "\nVisitation Status: " + visitationStatus + 
        "\nNotes: " + notes + "\nMedical Record: " + medicalRecord.toString();
	}

    

}
