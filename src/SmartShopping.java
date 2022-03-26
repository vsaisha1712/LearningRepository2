import java.util.Scanner;
public class SmartShopping {
        
        void billGenerate(int code) {   //For General customers
                double total;
                System.out.println("Bill");
                System.out.println("--------------------------");
                System.out.println("Type of customer: General");        //Display type of customer
                if(code == 1) {         //For mobile
                        total = 10000;
                        System.out.println("Item puchased: Mobile" );
                        System.out.println("Your total bill amount: " + total);
                }
                else if(code == 2) {    //For laptop
                        total = 60000;
                        System.out.println("Item puchased: Laptop" );
                        System.out.println("Your total bill amount: " + total);
                }
                else if(code == 3) {    //For camera
                        total = 80000;
                        System.out.println("Item puchased: Camera" );
                        System.out.println("Your total bill amount: " + total);
                }
                
        }
        
        public static void main(String[] args) {
                //Variable declarations
                int itemCode;
                int customer;
                //Scanner object to get input
                Scanner sc = new Scanner(System.in);
                
                System.out.println("Welcome to Smart Shopping");
                System.out.println("Please Enter:");
                System.out.println("1 for General Customer");
                System.out.println("2 for Premium Customer");
                System.out.println("3 for Regular Customer");
                customer = sc.nextInt();        //Get the type of customer
                
                System.out.println("Items available");
                System.out.println("Please Enter:");
                System.out.println("1 for Mobile");
                System.out.println("2 for Laptop");
                System.out.println("3 for Camera");
                itemCode = sc.nextInt();        //Get the item to be purchased
                
                if(customer == 1) {
                        SmartShopping s = new SmartShopping();  //SmartShopping object for general customers
                        s.billGenerate(itemCode);
                }
                else if(customer == 2) {
                        SmartShopping s = new PremiumCustomers();       //PremiumCustomers object for premium customers
                        s.billGenerate(itemCode);
                }
                else if(customer == 3) {
                        SmartShopping s = new RegularCustomers();       //RegularCustomers object for regular customers
                        s.billGenerate(itemCode);
                }
        }


}

class PremiumCustomers extends SmartShopping{   //For premium customers
        
        void billGenerate(int code) {
                double total;
                System.out.println("Bill");           
                System.out.println("--------------------------");
                System.out.println("Type of customer: Premium");        //Display type of customer
                if(code == 1) {         //For mobile
                        total = 10000 - (10000*0.1);
                        System.out.println("Item puchased: Mobile" );
                        System.out.println("Your total bill amount: 10000.0");
                        System.out.println("Your total payable amount (10% discount): " + total);
                }
                else if(code == 2) {    //For laptop
                        total = 60000 - (60000*0.1);
                        System.out.println("Item puchased: Laptop" );
                        System.out.println("Your total bill amount: 60000.0");
                        System.out.println("Your total payable amount (10% discount): " + total);
                }
                else if(code == 3) {    //For camera
                        total = 80000 - (80000*0.1);
                        System.out.println("Item puchased: Camera" );
                        System.out.println("Your total bill amount: 80000.0");
                        System.out.println("Your total payable amount (10% discount): " + total);
                }
        }
}

class RegularCustomers extends SmartShopping{   //For regular customers
        
        void billGenerate(int code) {
                double total;
                System.out.println("Bill");
                System.out.println("--------------------------");
                System.out.println("Type of customer: Regular");        //Display type of customer
                if(code == 1) {         //For mobile
                        total = 10000;
                        System.out.println("Item puchased: Mobile" );
                        System.out.println("Your total bill amount: " + total);
                }
                else if(code == 2) {    //For laptop
                        total = 60000 - (60000*0.1);
                        System.out.println("Item puchased: Laptop" );
                        System.out.println("Your total bill amount: 60000.0");
                        System.out.println("Your total payable amount (10% discount): " + total);
                }
                else if(code == 3) {    //For camera
                        total = 80000 - (80000*0.1);
                        System.out.println("Item puchased: Camera" );
                        System.out.println("Your total bill amount: 80000.0");
                        System.out.println("Your total payable amount (10% discount): " + total);
                }
        }
}
