class ContactDetails {
    private String firstName;
    private String lastName;
    private int age;
    private String city;
    private int postalCode;
    private String streetName;
    private int gateNumber;

    ContactDetails(
            String firstName,
            String lastName,
            int age,
            String city,
            int postalCode,
            String streetName,
            int gateNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.postalCode = postalCode;
        this.streetName = streetName;
        this.gateNumber = gateNumber;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public String getName() {
         return (firstName + " " + lastName);
    }

    public String getAddress() {
        return ("City: " + city + " | Postal Code: " + postalCode + " | Street: " + streetName + " | Gate Number: "
                + gateNumber);
    }

    public String toString() {
        return "Contacts name: " + firstName + " " + lastName + ", Age: " + age + ", Address: " + getAddress();
    }

}
