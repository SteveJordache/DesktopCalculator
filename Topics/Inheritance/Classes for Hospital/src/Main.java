
class Person {
    protected String name;
    protected String address;
    protected int age;
    protected String phoneNumber;

}

class Employee extends Person {
    protected int salary;
    protected boolean employed;

}

class Doctor extends  Employee {
    protected String department;
    protected String manager;
    protected int vacationDays;

}

class Patient extends Person {
    protected String[] specialities;
    protected String[] booksWritten;


}