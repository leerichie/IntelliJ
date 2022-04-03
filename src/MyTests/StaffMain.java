package MyTests;

public class StaffMain {
    public static void main(String[] args) {
        Staff staff1 = new Staff("Peter");
        staff1.setHoursWorked(160);
        int pay = staff1.calculatePay(1000, 400);
        System.out.println("Pay = " + pay);

        Staff staff2 = new Staff("Lee", "Richie");
        staff2.setHoursWorked(160);
        pay = staff2.calculatePay();
        System.out.println("Pay = " + pay);

        System.out.println("\n\nUpdating Lee's hours worked to -10");
        staff2.setHoursWorked(-10);
        System.out.println("\nHours worked = " + staff2.getHoursWorked());
        pay = staff2.calculatePay();
        System.out.println("Pay = " + pay);
    }

}
