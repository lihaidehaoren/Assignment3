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

        int[][] string3=new int[row][col];

        if (row==2){
            string3[0][0]=string1[0][0]+string2[0][0];
            string3[0][1]=string1[0][1]*string2[0][1];
            string3[1][0]=string1[1][0]*string2[1][0];
            string3[1][1]=string1[1][1]+string2[1][1];
        }
        else if (row==4){
            string3[0][0]=string1[0][0]+string2[0][0];
            string3[0][1]=string1[0][1]+string2[0][1];
            string3[1][0]=string1[1][0]+string2[1][0];
            string3[1][1]=string1[1][1]+string2[1][1];

            string3[2][2]=string1[2][2]-string2[2][2];
            string3[2][3]=string1[2][3]-string2[2][3];
            string3[3][2]=string1[3][2]-string2[3][2];
            string3[3][3]=string1[3][3]-string2[3][3];

            string3[0][2]=string1[0][2]*string2[0][2]+string1[0][3]*string2[0][3];
            string3[1][2]=string1[1][2]*string2[0][2]+string1[1][3]*string2[0][3];
            string3[0][3]=string1[0][2]*string2[1][2]+string1[0][3]*string2[1][3];
            string3[1][3]=string1[1][2]*string2[1][2]+string1[1][3]*string2[1][3];

            string3[2][0]=string2[2][0]*string1[2][0]+string2[2][1]*string1[2][1];
            string3[3][0]=string2[3][0]*string1[2][0]+string2[3][1]*string1[2][1];
            string3[2][1]=string2[2][0]*string1[3][0]+string2[2][1]*string1[3][1];
            string3[3][1]=string2[3][0]*string1[3][0]+string2[3][1]*string1[3][1];
        }

        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(string3[i][j]+" ");
            }
            System.out.println();
        }
    }
}





