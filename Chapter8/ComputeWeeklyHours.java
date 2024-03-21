public class ComputeWeeklyHours {
    public static void main(String[] args) {
        // matrix represents each employees work hours
        // the rows are employees, the columns are days of the week
        int[][] employeeHours = {
            {2, 4, 3, 4, 5, 8, 8}, // Employee 0
            {7, 3, 4, 3, 3, 4, 4}, // Employee 1
            {3, 3, 4, 3, 3, 2, 2}, // Employee 2
            {9, 3, 4, 7, 3, 4, 1}, // Employee 3
            {3, 5, 4, 3, 6, 3, 8}, // Employee 4
            {3, 4, 4, 6, 3, 4, 4}, // Employee 5
            {3, 7, 4, 8, 3, 8, 4}, // Employee 6
            {6, 3, 5, 9, 2, 7, 9}  // Employee 7
        };

        int[] employeeNumbers = {0, 1, 2, 3, 4, 5, 6, 7};

        int[] sumHours = new int[8];

        for (int i = 0; i < employeeHours.length; i++) { // changes employee
            for (int j = 0; j < employeeHours[i].length; j++) { // changes day
                sumHours[i] += employeeHours[i][j];
            }
        }

        // sorting algorithm
        for (int i = 0; i < sumHours.length - 1; i++) {
            int curMin = sumHours[i];
            int curName = employeeNumbers[i];
            int curMinIdx = i;

            // checks if current minimum is lower than next value
            for (int j = i + 1; j < sumHours.length; j++) {
                if (curMin > sumHours[j]) {
                    curMin = sumHours[j];
                    curName = employeeNumbers[j];
                    curMinIdx = j;
                }
            }

            // final check to set current min to current index
            if (curMinIdx != i) {
                sumHours[curMinIdx] = sumHours[i];
                employeeNumbers[curMinIdx] = employeeNumbers[i];
                sumHours[i] = curMin;
                employeeNumbers[i] = curName;
            }
        }

        for (int i = sumHours.length - 1; i >= 0; i--) {
            System.out.println("Employee " + employeeNumbers[i] + " hours are " + sumHours[i]);
        }
    }
}