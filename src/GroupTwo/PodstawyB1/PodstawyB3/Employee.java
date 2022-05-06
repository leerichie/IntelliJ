package GroupTwo.PodstawyB1.PodstawyB3;

import java.util.Arrays;

public class Employee {
    public static void main(String[] args) {
        Employee ceo = new Employee("Ash", "Richards", Department.MANAGEMENT, 100000d);
        Employee headMan = new Employee("Ania", "Richards", Department.MANAGEMENT, 90000d);
        Employee headSales = new Employee("Lee", "Richie", Department.SALES, 80000d);
        Employee emp1Man = new Employee("Honey", "Bum", Department.MANAGEMENT, 40000d);
        Employee emp2Man = new Employee("Moja", "Dupa", Department.MANAGEMENT, 35000d);
        Employee emp1Warehouse = new Employee("Ben", "Hardy", Department.WAREHOUSE, 25000d);
        Employee emp2Warehouse = new Employee("Dave", "Becks", Department.INFORMATION, 20000d);

        ceo.addSubordinate(headMan);
        ceo.addSubordinate(headSales);

        headMan.addSubordinate(emp1Man);
        headMan.addSubordinate(emp2Man);

        headSales.addSubordinate(emp1Warehouse);
        headSales.addSubordinate(emp2Warehouse);

        ceo.showSubordinates();

//        headMan.showSubordinates();
//        headSales.showSubordinates();


//        Employee employer = new Employee("Lee", "Richards", Department.SALES, 2800.0, 10);
//        System.out.println(employer.name + employer.surname + Department.SALES);
//        fName("");
//    }
//    static String fName(String firstName){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter name: ");
//        firstName = input.next();
//        return firstName;
    }

    private String name;
    private String surname;
    private Department department;
    private double salary;
    private Employee[] subordinates = new Employee[10];

    public Employee(String name, String surname, Department department, double salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", subordinates=" + Arrays.toString(subordinates) +
                '}';
    }

    public void addSubordinate(Employee subordinate) {
        boolean isAdded = false;
        for (int i = 0; i < subordinates.length; i++) {
            if (subordinates[i] == null) {
                subordinates[i] = subordinate;
                isAdded = true;
                break;
            }
        }
        if (!isAdded)
            System.out.println("Couldn't add new subordinate!");
    }

    public void showSubordinates() {
        for (Employee s : subordinates) {
            if (s != null)
                System.out.println(s);
        }
    }

    public void showAllSubordinates() {
        showAllSubordinates(0);
    }

    private void showAllSubordinates(int level) {
        level++;
        for (Employee s : subordinates) {
            if (s != null) {
                for (int i = 0; i < level; i++)
                    System.out.print("--");
                System.out.println(s);
                s.showAllSubordinates(level);
            }
        }
    }
}