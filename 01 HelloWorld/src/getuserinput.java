import java.util.Scanner;

public class getuserinput {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        String name = x.nextLine();
        System.out.println("Your name is " + name);

        int age = x.nextInt();
        System.out.println("Your age is " + age);

        double salary = x.nextDouble();
        System.out.println("Your salary is " + salary);

        char gender = x.next().charAt(0);
        System.out.println("Your gender is          " + gender );

    }
}