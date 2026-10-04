import java.time.LocalDate;
public class PrisonManagementSystem {
  
    public static void main(String[] args) {
        
        // Guard Objects
        Guard guard1 = new Guard("Khalid" , 202435, 35 , "Male" , "Gaza" , "0555555555" , "Corporal");
        Guard guard2 = new Guard("Mohammad" , 202236, 43 , "Male" , "Nablus" , "0666666666" , "Captain");
        Guard guard3 = new Guard("Mahir" , 202031, 38 , "Male" , "Damascus" , "0555555555" , "Sergeant");
        Guard guard4 = new Guard("Saleh" , 201878, 49 , "Male" , "Riyadh" , "0555555555" , "Major");



        // Cell Objects
        Cell cell1 = new Cell(
                12,
                6,
                4,
                guard1
            );
        Cell cell2 = new Cell(
                5,
                13,
                7,
                guard3
            );
        Cell cell3 = new Cell(
                9,
                8,
                5,
                guard4
            );
        Cell cell4 = new Cell(
                14,
                9,
                6,
                guard2
            );


        // Crime Objects
        Crime crime1 = new Crime("Robbery" , 4);
        Crime crime2 = new Crime("Assault" , 3);
        Crime crime3 = new Crime("Fraud" , 2);
        Crime crime4 = new Crime("Murder" , 7);

        // Lawyer objects
        Lawyer lawyer1 = new Lawyer("Mohammad" , 6548795 , 36 , "Male" , "Aleppo" , "07777777" , "LAW7865");
        Lawyer lawyer2 = new Lawyer("Sara" , 54899 , 40 , "Female" , "Damascus" , "0222222" , "LAW45389");

        // Prisoner Objects
        Prisoner prisoner1 = new Prisoner("Omar" , 2018920 , 30 , "Male" , "Yafa" , "056526551" , 1001 , "Trial" , 2 , crime1 , cell2 , lawyer2 , "P-206" , LocalDate.of(2025, 3, 12) , LocalDate.of(2027, 3, 12) , "Medium" , "Good" , 0 , "Allowed" , "No special notes" , "M-315" , "O+" , "Peanuts" , "Hypertension" , "Lisinopril" , "Stable" , LocalDate.of(2025 , 12 , 19) , "Regular checkup scheduled");
        Prisoner prisoner2 = new Prisoner("Samer" , 203568 , 23 , "Male" , "Al-Karak" , "02455578" , 1532 , "Convicted" , 5 , crime4 , cell3 , lawyer1 , "P-214" , LocalDate.of(2023, 4, 29) , LocalDate.of(2028, 4 , 29) , "High" , "Poor" , 2 , "Restricted" , "Has history of violence" , "M-325" , "A-" , "Shellfish" , "Diabetes" , "Metformin" , "Unstable" , LocalDate.of(2026 , 7 , 14) , "Immediate attention required");
        Prisoner prisoner3 = new Prisoner("Lina" , 201234 , 28 , "Female" , "Amman" , "05555555" , 1789 , "Trial" , 3 , crime2 , cell1 , lawyer2 , "P-220" , LocalDate.of(2024, 1, 15) , LocalDate.of(2027, 1, 15) , "Low" , "Excellent" , 0 , "Allowed" , "No special notes" , "M-330" , "B+" , "None" , "Asthma" , "Albuterol" , "Stable" , LocalDate.of(2025 , 11 , 10) , "Regular checkup scheduled");
        Prisoner prisoner4 = new Prisoner("Meral" , 202345 , 35 , "Female" , "Beirut" , "06666666" , 1902 , "Convicted" , 4 , crime3 , cell4 , lawyer1 , "P-230" , LocalDate.of(2025, 6, 5) , LocalDate.of(2029, 6, 5) , "Medium" , "Fair" , 1 , "Restricted" , "Has history of theft" , "M-340" , "AB-" , "Penicillin" , "Hypertension" , "Amlodipine" , "Unstable" , LocalDate.of(2026 , 2 , 24) , "Immediate attention required");
        
        System.out.println("Prisoner 1: " + prisoner1);
        System.out.println("Crime: " + prisoner1.getCrime().toString());
        System.out.println("Lawyer: " + prisoner1.getLawyer().toString());
        System.out.println("Cell: " + prisoner1.getCell().toString());
        System.out.println("Guard: " + prisoner1.getCell().getGuard().toString());

        System.out.println("Prisoner 2: " + prisoner2);
        System.out.println("Crime: " + prisoner2.getCrime().toString());
        System.out.println("Lawyer: " + prisoner2.getLawyer().toString());
        System.out.println("Cell: " + prisoner2.getCell().toString());
        System.out.println("Guard: " + prisoner2.getCell().getGuard().toString());

        System.out.println("Prisoner 3: " + prisoner3);
        System.out.println("Crime: " + prisoner3.getCrime().toString());
        System.out.println("Lawyer: " + prisoner3.getLawyer().toString());
        System.out.println("Cell: " + prisoner3.getCell().toString());
        System.out.println("Guard: " + prisoner3.getCell().getGuard().toString());

        System.out.println("Prisoner 4: " + prisoner4);
        System.out.println("Crime: " + prisoner4.getCrime().toString());
        System.out.println("Lawyer: " + prisoner4.getLawyer().toString());
        System.out.println("Cell: " + prisoner4.getCell().toString());
        System.out.println("Guard: " + prisoner4.getCell().getGuard().toString());

    }
}