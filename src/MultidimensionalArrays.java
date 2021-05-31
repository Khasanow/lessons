public class MultidimensionalArrays {
    public static void main(String[] args){
        int[] number= {1,2,3};
        System.out.println(number[1]);

        int[][] matrix=     {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][2]);
        System.out.println(matrix[0][1]);

        int[][] matrix1=        {{1,2,3,4,5,6},
                                {7,8},
                                {9,10,11}};
        System.out.println(matrix1[0][4]);
        System.out.println(matrix1[2][0]);

        int[] number1=new int[4];

        String[][] strings= new String[1][3];
        strings[0][2]="hello";
        System.out.println(strings[0][2]);

        System.out.println();

        int[][] matrix2=   {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        for (int i =0; i<matrix2.length; i++){
            for (int j=0; j<matrix2[i].length; j++ ){
                System.out.print(matrix2[i][j]+"");
            }
            System.out.println();
        }

    }
}
