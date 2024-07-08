
/*
In this project, the 'main' method initializes an array of marks and calls the 'evaluateGrade' method.
The 'evaluateGrade' method calculates the average mark, determines the grade, and prints the result.
The 'calculateAverage' method calculates the average of the marks in the array.
I wrote the code in Notepad and saved it as 'GradeEvaluator' and ran it using Command Prompt as follows:
1. Compiled using: javac GradeEvaluator.java
2. Ran the code using: java GradeEvaluator
3. Which printed this result: Average Mark: 88.75, Grade: B, Result: Passed exam.
You can modify the marks array with your own data to test the program.
Thank you.
*/

public class GradeEvaluator {

    public static void main(String[] args) {
        int[] marks = {90, 85, 88, 92}; // Example marks
        evaluateGrade(marks);
    }

    public static void evaluateGrade(int[] marks) {
        double averageMark = calculateAverage(marks);
        String grade;
        String result;

        if (averageMark >= 93) {
            grade = "A";
            result = "Passed exam";
        } else if (averageMark >= 85) {
            grade = "B";
            result = "Passed exam";
        } else if (averageMark >= 80) {
            grade = "C";
            result = "Passed exam";
        } else if (averageMark >= 75) {
            grade = "D";
            result = "Passed exam";
        } else {
            grade = "E";
            result = "Fail exam";
        }

        System.out.printf("Average Mark: %.2f, Grade: %s, Result: %s%n", averageMark, grade, result);
    }

    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}
