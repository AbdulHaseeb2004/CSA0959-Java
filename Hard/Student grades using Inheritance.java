class Student {
    String name;
    int[] marks = new int[6];
    
    void inputMarks(int[] m) {
        System.arraycopy(m, 0, marks, 0, 6);
    }
}

class Grade extends Student {
    double total = 0, aggregate;
    
    void calculateTotalAndAggregate() {
        for (int mark : marks) {
            total += mark;
        }
        aggregate = total / 6;
    }

    void displayGrade() {
        System.out.println("Total = " + total);
        System.out.println("Aggregate = " + aggregate);
        if (aggregate > 75) {
            System.out.println("Class: DISTINCTION");
        } else if (aggregate > 60) {
            System.out.println("Class: FIRST DIVISION");
        } else if (aggregate > 50) {
            System.out.println("Class: SECOND DIVISION");
        } else if (aggregate > 40) {
            System.out.println("Class: THIRD DIVISION");
        } else {
            System.out.println("Class: FAIL");
        }
    }
}

public class StudentGrades {
    public static void main(String[] args) {
        Grade student = new Grade();
        int[] marks = {90, 91, 92, 93, 92, 93};  // sample marks
        student.inputMarks(marks);
        student.calculateTotalAndAggregate();
        student.displayGrade();  // Output: Total = 551, Aggregate = 91.83, Class: DISTINCTION
    }
}
