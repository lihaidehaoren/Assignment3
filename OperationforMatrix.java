import java.util.Scanner;

public class OperationforMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row= sc.nextInt();
        int col=row;
        int[][] string1=new int[row][col];
        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                string1[i][j]=sc.nextInt();
            }
        }
        int[][] string2=new int[row][col];
        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                string2[i][j]=sc.nextInt();
            }
        }

        int[][] a1=new int[row/2][col/2];
        int[][] a2=new int[row/2][col/2];
        int[][] a3=new int[row/2][col/2];
        int[][] a4=new int[row/2][col/2];

        int[][] b1=new int[row/2][col/2];
        int[][] b2=new int[row/2][col/2];
        int[][] b3=new int[row/2][col/2];
        int[][] b4=new int[row/2][col/2];

        for (int i=0;i<row/2;i++){
            for (int j=0;j<row/2;j++){
                a1[i][j]=string1[i][j];
                a2[i][j]=string1[i][j+row/2];
                a3[i][j]=string1[i+row/2][j];
                a4[i][j]=string1[i+row/2][j+row/2];
                b1[i][j]=string2[i][j];
                b2[i][j]=string2[i][j+row/2];
                b3[i][j]=string2[i+row/2][j];
                b4[i][j]=string2[i+row/2][j+row/2];
            }
        }

        int[][] b2t=new int[row/2][col/2];
        int[][] a3t=new int[row/2][col/2];
        for (int i=0;i<row/2;i++){
            for (int j=0;j<row/2;j++){
                b2t[i][j]=b2[j][i];
                a3t[i][j]=a3[j][i];
            }
        }


        int[][] c1=new int[row/2][col/2];
        int[][] c2=new int[row/2][col/2];
        int[][] c3=new int[row/2][col/2];
        int[][] c4=new int[row/2][col/2];

        for (int i=0;i<row/2;i++){
            for (int j=0;j<row/2;j++){
                c1[i][j]=a1[i][j]+b1[i][j];
                c4[i][j]=a4[i][j]-b4[i][j];
            }
        }

        for (int i = 0; i < row/2; i++) {
            for (int j = 0; j < row/2; j++) {
                for (int k = 0; k < row/2; k++) {
                    c2[i][k] += a2[i][j] * b2t[j][k];
                    c3[i][k] += b3[i][j] * a3t[j][k];
                }
            }
        }






        int[][] string3=new int[row][col];

        for (int i=0;i<row/2;i++){
            for (int j=0;j<row/2;j++){
                string3[i][j]=c1[i][j];
                string3[i][j+row/2]=c2[i][j];
                string3[i+row/2][j]=c3[i][j];
                string3[i+row/2][j+row/2]=c4[i][j];
            }
        }




        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(string3[i][j]+" ");
            }
            System.out.println();
        }
    }
}





