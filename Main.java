
public class BuggyProgram {

    // Task 1: Nested conditionals
    public static String getGrade(int score) {
        if (score >= 90) {
            return "Exceeds";
        } else if (score >= 80) {
            return "Meets";
        } else {
            return "Does Not Meet";
        }
    }

    // Task 2: Loop with array
    public static int sumEvenNumbers(int[] values) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                sum += values[i];
            }
        }

        return sum;
    }

    // Task 3: Loop with bounds
    public static int sumRange(int start, int end) {
        int sum = 0;

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Test the program using the JUnit tests");
    }
}

