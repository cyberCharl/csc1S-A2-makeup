public class Student {
    private String firstName;
    private String middleName;
    private String lastName;

    public Student( /*String firstName, String middleName, String lastName*/) {
        /*
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

         */
    }

    public void setNames(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }

    public String getFullName() {
        return "The full name is: " + firstName + " " + middleName.charAt(0) + ". " + lastName;
    }
}
