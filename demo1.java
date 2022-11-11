import java.util.Scanner;

public class demo1 {
    public static void main(String [] args){
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
        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(string1[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(string2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
