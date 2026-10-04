public class Lawyer extends Person {

private String licenseNumber;

public Lawyer(String name , int id , int age , String gender , String address , String phoneNumber , String licenseNumber) {
    super(name , id , age , gender , address , phoneNumber);
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
        return super.toString() + 
        "\nLicense Number: " + licenseNumber; 
    }

}
