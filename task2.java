package CODESOFT;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter the number of subject:");
        int num = sc.nextInt();
        int[] marks = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + " out of 100: ");
            marks[i] = sc.nextInt();
        }
        int total = 0;
        for (int i = 0; i < num; i++) {
            total += marks[i];
        }
        double average = (double) total / num;
        String grade;
        if (average >= 90) {
             grade = "A";
        } else if (average >= 80) {
             grade = "B";
        } else if (average >= 70) {
             grade = "C";
        } else {
             grade = "D";
        }
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average percentage: " + String.format("%.2f", average) + " %");
        System.out.println("Grade: " + grade);
    }
}
