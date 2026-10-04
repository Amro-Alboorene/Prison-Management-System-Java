public class Person {
    
    private String name;
    private int id;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    
    

    
    
    public Person(String name, int id, int age, String gender, String address, String phoneNumber) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}



	public String getName() {
		return name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String toString() {
        return "\nName: " + name + 
        "\nID: " + id + 
        "\nAge: " + age + 
        "\nGender: " + gender + 
        "\nAddress: " + address + 
        "\nPhone Number: " + phoneNumber;
    }
}