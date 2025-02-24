package Set_1.Task2;

public class Student {
    String name;
    int[] marks;
    int total;
    double average;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        this.total = calculateTotal(marks);
        this.average = (double) total / marks.length;
    }

    private int calculateTotal(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }
}
