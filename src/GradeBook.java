public class GradeBook {

    // Task 2 The GradeBook

    // Task 2.1: Class Variables (State)

    String studentName;
    int assignmentScore;
    int examScore;
    double finalGrade;

    // Task 2.2: The Constructor (Initialization)

    public GradeBook(String name, int aScore, int eScore) {
        studentName = name;
        assignmentScore = aScore;
        examScore = eScore;
    }

    // Task 2.3: The Methods (Behavior)

    // Calculate final grade

    public void calculateResult() {
        finalGrade = (double) assignmentScore * 0.4
                + (double) examScore * 0.6;
    }

    // Display student information

    public void displaySummary() {
        System.out.println("Name: " + studentName);
        System.out.println("Raw Scores: ["
                + assignmentScore + "] ["
                + examScore + "]");
        System.out.println("Final Weighted Grade: "
                + finalGrade + "%");
    }

    // Task 2.4: The Main Method (Entry Point)

    public static void main(String[] args) {
        GradeBook student = new GradeBook("Alex", 80, 90);

        student.calculateResult();
        student.displaySummary();
    }

}