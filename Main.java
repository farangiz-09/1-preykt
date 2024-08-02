import model.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    static Scanner inText = new Scanner(System.in);
    static Scanner inNum = new Scanner(System.in);
    static List<Customer> customers = new ArrayList<>();

    public Main() {
    }

    public static void main(String[] args) {

        System.out.print("---------------mjozlarni royhatluci dasturga huzw kelibsz ");
        System.out.print(
                "1.  Mijozlarnni royhati\n" +
                        "2. Mijoz qo'shish\n" +
                        "3. Mijozni o'chirish\n" +
                        "4. Mijozni ishonchliligini tasdiqlash\n" +
                        "5. Mijozga qarzdorlik qo'shish\n" +
                        "6. Mijozdan qarzdorlik o'chirish\n" +
                        "7. Qarzdor mijozlarni topish\n" +
                        "8. Ishonchli mijozlarni topish\n" +
                        "9.Dasturdan ciqish\n" +
                "----kritw----->"
        );
        int choice = inNum.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("------------------");
                if (customers.isEmpty()){
                    System.out.print("Szda hali mjozlar mavjud emas");
                }
                for (Customer customer : customers) {
                    System.out.print(customer);
                }
                System.out.print("--------------");
            }
            case 2 -> {
                System.out.print("Yangi mjoz ism familyasini kiriting");
                String fullName = inText.nextLine();

                System.out.print("Yangi mijozni raqamini kiriting");
                String phoneNober=inText.nextLine();

                System.out.print("Yangi mjozni qarzini kriting");
                double dabt=inNum.nextDouble();

                System.out.print("Bu mjoz iwonclimi ? v/n:");
                boolean identified = false;
                char choiceCus = inText.next().charAt(0);
                if (choiceCus=='y'){
                identified=true;
                }
                Customer newCustomer= new Customer(fullName,phoneNober,dabt,identified);
                customers.add(newCustomer);
                System.out.print("Mjoz muvaffaqiyatli bazaga qowildi |");

            }
            case 3 -> {
                System.out.print("----------");
                System.out.print(" ismnii kiritiw");
                System.out.print(" familyani kiritiw" );
                System.out.print("nomber kiritiw");
                System.out.print("ID");
            }
            case 4 -> {


                System.out.print("Yangi mjoz ism familyasini kiriting");
                String fullName = inText.nextLine();
ara
                System.out.print("Yangi mijozni raqamini kiriting");
                String phoneNober=inText.nextLine();

                System.out.print("Yangi mjozni qarzini kriting");
                double dabt=inNum.nextDouble();

                System.out.print("Bu mjoz iwonclimi ? v/n:");
                boolean identified = false;
                char choiceCus = inText.next().charAt(0);
                if (choiceCus=='y'){
                    identified=true;
                }
                Customer newCustomer= new Customer(fullName,phoneNober,dabt,identified);
                customers.add(newCustomer);
                System.out.print("Mjoz muvaffaqiyatli bazaga qowildi |");


            }
            case 5 -> {

            }
            case 6 -> {

            }

            case 7 -> {

            }

            case 8 -> {

            }

            case 9 -> {

            }
            case 10 -> {

            }

            default -> {
                System.out.print("Dastyr oz ishini tugatdi");
                return;
            }

        }
    }
}
