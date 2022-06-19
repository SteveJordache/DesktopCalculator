
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null && !"".equals(firstName)) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null && !"".equals(lastName)) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        if (!"".equals(firstName) && !"".equals(lastName)) {
            return String.format("%s %s", firstName, lastName);
        } else if ("".equals(firstName) && !"".equals(lastName)) {
            return  String.format("%s", lastName);
        } else if (!"".equals(firstName)) {
            return  String.format("%s", firstName);
        } else {
            return "Unknown";
        }

    }
}
/*

public class Main {
    public static void main(String[] args) {
        User tim = new User();
        tim.setFirstName("Tim");
        tim.setLastName("Towler");
        System.out.println(tim.getFullName()); // Tim Towler

        User katie = new User();
        katie.setFirstName("Katie");
        katie.setLastName(null);
        System.out.println(katie.getFullName()); // Katie (without additional spaces)

    }
}*/
