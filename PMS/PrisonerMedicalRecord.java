import java.time.LocalDate;
public class PrisonerMedicalRecord {
    private String medicalRecordId;
    private String bloodType;
    private String allergies;
    private String chronicConditions;
    private String currentMedications;
    private String medicalStatus;
    private LocalDate lastMedicalCheckup;
    private String medicalNotes;

     public PrisonerMedicalRecord(String medicalRecordId, String bloodType, String allergies, String chronicConditions, String currentMedications, String medicalStatus, LocalDate lastMedicalCheckup, String medicalNotes) {
        this.medicalRecordId = medicalRecordId;
        this.bloodType = bloodType;
        this.allergies = allergies;
        this.chronicConditions = chronicConditions;
        this.currentMedications = currentMedications;
        this.medicalStatus = medicalStatus;
        this.lastMedicalCheckup = lastMedicalCheckup;
        this.medicalNotes = medicalNotes;
    }

	 public String getMedicalRecordId() {
		 return medicalRecordId;
	 }

	 public String getBloodType() {
		 return bloodType;
	 }

	 public String getAllergies() {
		 return allergies;
	 }

	 public void setAllergies(String allergies) {
		 this.allergies = allergies;
	 }

	 public String getChronicConditions() {
		 return chronicConditions;
	 }

	 public void setChronicConditions(String chronicConditions) {
		 this.chronicConditions = chronicConditions;
	 }

	 public String getCurrentMedications() {
		 return currentMedications;
	 }

	 public void setCurrentMedications(String currentMedications) {
		 this.currentMedications = currentMedications;
	 }

	 public String getMedicalStatus() {
		 return medicalStatus;
	 }

	 public void setMedicalStatus(String medicalStatus) {
		 this.medicalStatus = medicalStatus;
	 }

	 public LocalDate getLastMedicalCheckup() {
		 return lastMedicalCheckup;
	 }

	 public void setLastMedicalCheckup(LocalDate lastMedicalCheckup) {
		 this.lastMedicalCheckup = lastMedicalCheckup;
	 }

	 public String getMedicalNotes() {
		 return medicalNotes;
	 }

	 public void setMedicalNotes(String medicalNotes) {
		 this.medicalNotes = medicalNotes;
	 }

	 @Override
	 public String toString() {
		return "Prisoner Medical Record" + 
        "\nMedical Record Id: " + medicalRecordId + 
        "\nBlood Type: " + bloodType + 
        "\nAllergies: " + allergies + 
        "\nChronic Conditions: " + chronicConditions + 
        "\nCurrent Medications: " + currentMedications + 
        "\nMedical Status: " + medicalStatus + 
        "\nLast Medical Checkup: " + lastMedicalCheckup + 
        "\nMedical Notes: " + medicalNotes;
	 }


    
}