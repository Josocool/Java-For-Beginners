import java.util.Scanner;

public class string_01 {
    public static void main(String[] args) {
        String name = "Phasouk";
        System.out.println(name.toUpperCase()); // Convert data to Uppercase
        System.out.println(name.length()); // it's see to length of name
        System.out.println(name.charAt(0)); // access infor of name in index 0
        System.out.println(name.substring(1)); // delete index at 1[0] get out from name
        Scanner myobj = new Scanner(System.in); // Create object jark Class ma phuea using
        System.out.print("Enter username: ");
        String userName = myobj.nextLine();
        System.out.println("Username is: "+userName.toUpperCase());
        System.out.println("Username is: "+userName.length());
    }

}