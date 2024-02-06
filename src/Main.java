import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

Scanner scanner;
int age;
String firstName;
String favFood;
scanner = new Scanner(System.in);
System.out.println("Enter your age");
age = scanner.nextInt();
System.out.println("Enter your first name");
firstName = scanner.next();
System.out.println("Enter your favorite food");
favFood = scanner.next();
System.out.println("Name: " + firstName + "\n\nAge: " + age + "\n\nFavorite food: " + favFood);


    }

}