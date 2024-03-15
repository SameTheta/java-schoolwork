import java.util.Scanner;

public class AssignGrades {
    public static void printGrades(int[] grades, int max) {
        //counters for each grade
        int[] letterGrade = {0, 0, 0, 0, 0};

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= max - 10) {
                letterGrade[0]++;
            } else if (grades[i] >= max - 20) {
                letterGrade[1]++;
            } else if (grades[i] >= max - 30) {
                letterGrade[2]++;
            } else if (grades[i] >= max - 40) {
                letterGrade[3]++;
            } else {
                letterGrade[4]++;
            }
        }

        System.out.println("The grades for this class:\nA: " + letterGrade[0] +"\nB: " + letterGrade[1] + "\nC: " + letterGrade[2]
        + "\nD: " + letterGrade[3] + "\nF: " + letterGrade[4]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students are in this class? ");
        int numStudents = input.nextInt();

        int max = 0; 
        int curInput = 0;
        int[] grades = new int[numStudents];

        System.out.println("What the grades for each of these students?");
        for (int i = 0; i < grades.length; i++) {
            curInput = input.nextInt();
            grades[i] = curInput;

            if (grades[i] > max) {
                max = grades[i];
            }
        }

        printGrades(grades, max);

        input.close();
    }
}
