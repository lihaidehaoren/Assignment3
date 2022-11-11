import java.util.Scanner;

public class PerimeterofBlackGridCells {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row= sc.nextInt();
        int col=row;
        int perimeter=0;


        int[][] string1=new int[row+2][col+2];

        for(int i=0; i<row+2;i++){
            for(int j=0;j<col+2;j++){
                string1[i][j]=0;
            }
        }


        for(int i=1; i<=row;i++){
            for(int j=1;j<=col;j++){
                string1[i][j]=sc.nextInt();
            }
        }

        for(int i=1; i<=row;i++){
            for(int j=1;j<=col;j++){
                if (string1[i][j]==1){
                    int m=0;
                    if (string1[i-1][j]==0){
                        m=m+1;
                    }
                    if (string1[i+1][j]==0){
                        m=m+1;
                    }
                    if (string1[i][j-1]==0){
                        m=m+1;
                    }
                    if (string1[i][j+1]==0){
                        m=m+1;
                    }
                    perimeter=perimeter+m;
                }
            }
        }
        System.out.print(perimeter);

    }
}
