
/*
    Example For Using to printf must have to format like:
 %d = integer
 %f = floating point (double/float)
 %s = string
 %b = boolean
 %c = char
*/
public class Primitive_Types{
    public static void main(String[] args) {
        int age = 21;
        double salary = 15000.50;
        boolean isStudent = true;
        char grade = 'A';
        String name = "Pasut";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Student? " + isStudent);
        System.out.println("Grade: " + grade);

    }
}