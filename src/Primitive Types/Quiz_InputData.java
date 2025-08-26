import java.util.Scanner;
public class Quiz_InputData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Surname: ");
        String surname = sc.nextLine();


        String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        String formattedSurname = surname.toUpperCase();

        System.out.println("Name: " + formattedName);
        System.out.println("Surname: " + formattedSurname);
        System.out.println("Length Name: " +formattedName.length());
        System.out.println("Length Surname: " +formattedSurname.length());


        sc.close();
    }
}
