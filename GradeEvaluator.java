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
