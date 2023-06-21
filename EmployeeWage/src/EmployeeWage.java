import java.util.Random;

public class EmployeeWage {
    public void displaymsg() {
        System.out.println("Welcome to the Employee Wage");
    }

    public void checkemp() {
        Random random = new Random();
        int attendence = random.nextInt(2);
        if (attendence == 1) {
            System.out.println("Present");

        } else {
            System.out.println("Absent");
        }

    }

    public void checkpart() {


    }

    public void empwage(int hourrate, int hour) {
        double wage = hourrate * hour;
        System.out.println(wage);
    }

    public void empMonthWage(int hourrate, int hour, int day) {
        double wage = hourrate * (hour * day);
        System.out.println(wage);


    }

    public void wagesTillCondition(int hourate,int hour,int day){
        double wage=hourate*(hour*day);
        System.out.println(wage);
    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.checkemp();
        employeeWage.empwage(20, 8);
        employeeWage.empMonthWage(20, 8, 20);
        employeeWage.wagesTillCondition(20,100,20);


    }
}
