import java.util.Scanner;

class StudentGrades {
    private String studentName;
    private int numberOfSubjects;
    private double[] grades;
    private String[] subjects;

    public StudentGrades(String studentName, int numberOfSubjects){
        this.studentName = studentName;
        this.numberOfSubjects = numberOfSubjects;
        this.grades = new double[numberOfSubjects];
        this.subjects = new String[numberOfSubjects];
    }

    public void inputGrades() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter subject name: ");
            subjects[i] = scanner.nextLine();
            System.out.print("Enter grade for " + subjects[i] + ": ");
            grades[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
        }
    }

    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / numberOfSubjects;
    }

    public char getLetterGrade(double average) {
        if (average >= 90) return 'A';
        if (average >= 80) return 'B';
        if (average >= 70) return 'C';
        if (average >= 60) return 'D';
        return 'F';
    }

    public double calculateGPA(double average) {
        return (average / 100) * 4.0;
    }

    public void displayGrades() {
        System.out.println("Grades for " + studentName + ":");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println(subjects[i] + ": " + grades[i]);
        }
    }

    public void displaySummary() {
        double average = calculateAverage();
        char letterGrade = getLetterGrade(average);
        double gpa = calculateGPA(average);

        System.out.println("\nSummary for " + studentName + ":");
        System.out.println("Average Grade: " + average);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        StudentGrades studentGrades = new StudentGrades(studentName, numberOfSubjects);
        studentGrades.inputGrades();
        studentGrades.displayGrades();
        studentGrades.displaySummary();
    }
}
