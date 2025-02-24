package Set_1.Task2;
//: Write a java program to accept the students name and marks in subjects and
// find the total and average of the marks and sort the list accordingly
import java.util.*;
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.next();
            System.out.print("Enter number of subjects: ");
            int subjects = scanner.nextInt();
            int[] marks = new int[subjects];

            System.out.println("Enter marks: ");
            for (int j = 0; j < subjects; j++) {
                marks[j] = scanner.nextInt();
            }

            students.add(new Student(name, marks));
        }
        //Bubble Sort
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).total < students.get(j + 1).total) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
        System.out.println("\nSorted List of Students by Total Marks:");
        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Total: " + student.total + ", Average: " + student.average);
        }

        scanner.close();
    }
}
