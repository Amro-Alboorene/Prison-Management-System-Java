/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisonmanagementsystem;

/*
 * Developed by Roa'a.
 */
public class Lawyer extends Person {

private String licenseNumber;

public Lawyer(String name , int id , String licenseNumber ) {
    super(name , id);
    this.licenseNumber = licenseNumber;
}

public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
}


public String getLicenseNumber() {
    return this.licenseNumber;
}

    @Override
    public String toString() {
        return super.toString() + "\nLicense Number: " + licenseNumber; 
    }




}

