class Student {
    String name;
    int registerNumber;
    int[] marks = new int[5];

    public Student(String name, int registerNumber, int[] marks) {
        this.name = name;
        this.registerNumber = registerNumber;
        System.arraycopy(marks, 0, this.marks, 0, marks.length);
    }

    public void calculateAndDisplay() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = total / 5.0;
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};  // Example marks
        Student student = new Student("John Doe", 101, marks);
        student.calculateAndDisplay();
    }
}
