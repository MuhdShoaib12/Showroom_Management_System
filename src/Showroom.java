import java.util.Scanner;

public class Showroom implements utility{

    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock = 0;
    String manager_name;


    @Override
    public void get_details(){
        System.out.println("Showroom Name: "+showroom_name);
        System.out.println("Showroom Address: "+showroom_address);
        System.out.println("Total Employees: "+total_employees);
        System.out.println("Total Cars In Stock: "+total_cars_in_stock);
        System.out.println("Manger Name: "+manager_name);
    }
    @Override
    public void set_details(){
        Scanner scan = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        showroom_name = scan.nextLine();
        System.out.print("SHOWROOM ADDRESS: ");
        showroom_address = scan.nextLine();
        System.out.print("TOTAL EMPLOYEES: ");
        total_employees = scan.nextInt();
        System.out.print("TOTAL CARS IN STOCK: ");
        total_cars_in_stock = scan.nextInt();
        System.out.print("MANAGER NAME: ");
        manager_name = scan.nextLine();
    }
}
