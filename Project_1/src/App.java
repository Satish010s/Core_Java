import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        try {
            System.out.println("Welcome to Satish Garage");
            //customer name
            System.out.println("Enter customer name ");
            String name=sc.nextLine();

            System.out.println("Enter the car number");
            String carNo=sc.nextLine();

            System.out.println("Enter the car type like SUV sedan ");
            String carType=sc.nextLine();

            Customers customer=new Customers(name,carNo,carType);
            //Available Service
            Service[] services={
                    new Service(1,"Car Wash",400),
                    new Service(2,"Oil Change",400),
                    new Service(3,"Break Change",150),
                    new Service(4,"Coolant Change",500),
                    new Service(5,"Full Services",10000),
            };
            boolean[] selected=new boolean[services.length];
            //Services Selection
            while(true){
                System.out.println("\n Available Services");
                for(Service s : services) {
                    System.out.println(s.getId() + ". " + s.getName() + " - $" + s.getPrices());
                }
                    System.out.println("Generate Bill");
                System.out.println("Select Services ID");
                    int choice = sc.nextInt();
                    if (choice < 0 || choice > services.length) {
                        throw new Exception("Invalid Services");
                    }
                    if (choice == 0) {
                        int total=BillAmount.calculateTotal(services,selected);

                        System.out.println("-----------final Billing------");
                        System.out.println("Customer Deatils");
                        System.out.println("Customer " + customer.getName());
                        System.out.println("Customer carNo" + customer.getCarNo());
                        System.out.println("Customer carType" + customer.getCarType());

                        for (int i = 0; i < services.length; i++) {
                            if (selected[i]) {
                                System.out.println(services[i].getName() + "$"+services[i].getPrices());
                            }
                        }

                        System.out.println("------------------------------------------------");
                        System.out.println("Total Amount:"+total);
                        System.out.println("Thank you! Visit Again");
                        break;
                    }


                    System.out.println("Service added " + services[choice - 1].getName());
                    selected[choice - 1] = true;
            }
        }
        catch (Exception e){
            System.out.printf("Error :" +e.getMessage());

        }
    }

}