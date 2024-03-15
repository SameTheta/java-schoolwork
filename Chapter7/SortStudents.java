import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students are there?");
        int numStudents = input.nextInt(); // get amount of students

        String[] names = new String[numStudents];
        double[] grades = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter a student's name.");
            names[i] = input.next(); // get a student name

            System.out.println("Enter that student's grade");
            grades[i] = input.nextDouble(); // get that student's grade
        }

        // sorting algorithm    
        for (int i = 0; i < numStudents - 1; i++) {
            // sets current min to current index and index value
            double curMin = grades[i];
            String curName = names[i];
            int curMinIdx = i;
            
            
            // checks if the current minimum is lower than the next index value
            for (int j = i + 1; j < numStudents; j++) {
                if (curMin > grades[j]) { // if the current minimum is lower, update current minimum
                    curMin = grades[j];
                    curName = names[j];
                    curMinIdx = j;
                }
            }
            
            // one final check to set the current minimum to the current index
            if (curMinIdx != i) {
                grades[curMinIdx] = grades[i];
                names[curMinIdx] = names[i];
                grades[i] = curMin;
                names[i] = curName;
            }
        }

        for (int i = numStudents - 1; i >= 0; i--) {
            System.out.printf("%s %.1f\n", names[i], grades[i]); // print out the grades
        }
    }
}