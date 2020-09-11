class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? "" : firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? "" : lastName;
    }

    public String getFullName() {
        String fullname;
        if (firstName.isEmpty() & lastName.isEmpty()) {
            fullname = "Unknown";
        } else {
            fullname = firstName + " " + lastName;
        }
        fullname.stripTrailing().stripLeading();

        return fullname;
    }
}