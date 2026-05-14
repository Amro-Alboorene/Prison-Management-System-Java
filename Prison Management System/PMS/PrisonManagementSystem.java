/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prisonmanagementsystem;

/*
* Developed by: Amro Alboorene.
*/
public class PrisonManagementSystem {
  
    public static void main(String[] args) {
        // Guard Object
        Person guard1 = new Guard("Ahmad Ali", 101, "Captain");

        // Cell Object
        Cell cell1 = new Cell(
                12,
                6,
                4,
                (Guard) guard1
        );

        // Crime Object
        Crime crime1 = new Crime("Robbery" , 4);

        // Lawyer object
        Person lawyer1 = new Lawyer("Mohammad" , 324 , "LAW7788");
        
        // Prisoner Object
        Person p1 = new Prisoner(
                "Omar",
                5001,
                "Trial",
                3,
                "12/3/2024",
                "12/3/2027",
                crime1,
                cell1,
                (Lawyer)lawyer1
        );

        System.out.println("--Prisoner (p1 ) Information--");
        System.out.println(p1.toString());

        System.out.println("\nIs Prisoner (p1) Under Trial?");
        System.out.println(((Prisoner) p1).isInTrial());
        
        System.out.println("\n--Lawyer 1 Information--");
        System.out.println(((Prisoner) p1).getLawyer().toString());

        System.out.println("\n--Guard 1 Information--");
        System.out.println(((Prisoner) p1).getCell().getGuard());

        System.out.println("\n --Crime 1 Information--");
        System.out.println(crime1);

        System.out.println("\n--Cell 1 Information--");
        System.out.println(cell1);


    }
}