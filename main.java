package empty;
import java.util.Scanner;
class Student {
    double grade;
    int income;
    Scanner s = new Scanner(System.in);

    void input() {
        System.out.println("Enter your grade:");
        grade = s.nextDouble();
        System.out.println("Enter your income:");
        income = s.nextInt();
        if (grade >= 3.5 && income <= 50000) {
            System.out.println("You are eligible for school items.");
        } else {
            System.out.println("You are not eligible for school items.");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Student p = new Student();
        p.input();
    }
}