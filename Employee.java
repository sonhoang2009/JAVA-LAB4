package lab42;

public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(){
        ID = 123;
        firstName = "Son";
        lastName = "Hoang";
        salary = 456;
    }

    public int getID(){
        return ID;
    }

    public String getFirstName(String pFirstName){
         return firstName;
    }

    public String getLastName(String pLastName){
        return lastName;
    }

    public String getName(String firstName, String lastName){
        return firstName + lastName ;
    }

    public int getSalary(){
        return salary;
    }

//    public void setSalary(int salary1){
//        salary = salary1;
//    }

    public int getAnualSalary(){
        return salary * 12;
    }

//    public int raiseSalary(int percent){
//        percent = salary;
//        return salary
//    }

    public String toString(){
        return "Employee ID ="+ ID + "\t"+"name ="+firstName+lastName +"\t"+ "salary ="+ salary ;
    }

    public static void main(String[] args) {
        Employee s1 = new Employee();

        System.out.println(s1);


    }
}
