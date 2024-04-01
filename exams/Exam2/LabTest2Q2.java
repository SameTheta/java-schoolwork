public class LabTest2Q2 {
    public static int[] sumMatrix(int[][] m) {
        int[] sumRows = {0, 0, 0, 0, 0};
        int[] sumCols = {0, 0, 0, 0, 0};

        int[] greatestSums = {sumRows[0], sumCols[0]};

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sumRows[i] += m[i][j];
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sumCols[i] += m[j][i];
            }
        }

        int curGreatestRow = sumRows[0];
        int curGreatestCol = sumCols[0];

        for (int i = 0; i < sumRows.length; i++) {
            if (sumRows[i] > curGreatestRow) {
                curGreatestRow = sumRows[i];
                greatestSums[0] = i;
            }

            if (sumCols[i] > curGreatestCol) {
                curGreatestCol = sumCols[i];
                greatestSums[1] = i;
            }
        }

        return greatestSums;
    }
    public static void main(String[] args) {
        int[][] randomMatrix = new int[5][5];

        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix.length; j++) {
                randomMatrix[i][j] = (int) Math.round(Math.random());
            }
        }

        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix.length; j++) {
                System.out.print(randomMatrix[i][j]);
            }
            System.out.println();
        }

        int[] greatestSums = sumMatrix(randomMatrix);

        System.out.println("The largest row index is " + greatestSums[0]);
        System.out.println("The largest column index is " + greatestSums[1]);
    }
}