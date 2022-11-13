import java.util.Scanner;

public class FiveWins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row= sc.nextInt();
        int col=row;


        int[][] s=new int[row+8][col+8];

        for(int i=0; i<row+8;i++){
            for(int j=0;j<col+8;j++){
                s[i][j]=0;
            }
        }

        for(int i=4; i<row+4;i++){
            for(int j=4;j<col+4;j++){
                s[i][j]=sc.nextInt();
            }
        }

        boolean flag=false;

        for(int i=4; i<row+4;i++){
            for(int j=4;j<col+4;j++){
                if (s[i-1][j-1]==1&&s[i-2][j-2]==1&&s[i-3][j-3]==1&&s[i-4][j-4]==1){
                    flag=true;
                }
                else if (s[i][j-1]==1&&s[i][j-2]==1&&s[i][j-3]==1&&s[i][j-4]==1){
                    flag=true;
                }
                else if (s[i+1][j-1]==1&&s[i+2][j-2]==1&&s[i+3][j-3]==1&&s[i+4][j-4]==1){
                    flag=true;
                }
                else if (s[i+1][j]==1&&s[i+2][j]==1&&s[i+3][j]==1&&s[i+4][j]==1){
                    flag=true;
                }
                else if (s[i+1][j+1]==1&&s[i+2][j+2]==1&&s[i+3][j+3]==1&&s[i+4][j+4]==1){
                    flag=true;
                }
                else if (s[i][j+1]==1&&s[i][j+2]==1&&s[i][j+3]==1&&s[i][j+4]==1){
                    flag=true;
                }
                else if (s[i-1][j+1]==1&&s[i-2][j+2]==1&&s[i-3][j+3]==1&&s[i-4][j+4]==1){
                    flag=true;
                }
                else if (s[i-1][j]==1&&s[i-2][j]==1&&s[i-3][j]==1&&s[i-4][j]==1){
                    flag=true;
                }

                else if (s[i-1][j-1]==1&&s[i-2][j-2]==1&&s[i-3][j-3]==1&&s[i+1][j+1]==1){
                    flag=true;
                }
                else if (s[i-1][j-1]==1&&s[i-2][j-2]==1&&s[i+2][j+2]==1&&s[i+1][j+1]==1){
                    flag=true;
                }
                else if (s[i-1][j-1]==1&&s[i+3][j+3]==1&&s[i+2][j+2]==1&&s[i+1][j+1]==1){
                    flag=true;
                }

                else if (s[i][j-1]==1&&s[i][j-2]==1&&s[i][j-3]==1&&s[i][j+1]==1){
                    flag=true;
                }
                else if (s[i][j-1]==1&&s[i][j-2]==1&&s[i][j+2]==1&&s[i][j+1]==1){
                    flag=true;
                }
                else if (s[i][j-1]==1&&s[i][j+3]==1&&s[i][j+2]==1&&s[i][j+1]==1){
                    flag=true;
                }

                else if (s[i+1][j-1]==1&&s[i+2][j-2]==1&&s[i+3][j-3]==1&&s[i-1][j+1]==1){
                    flag=true;
                }
                else if (s[i+1][j-1]==1&&s[i+2][j-2]==1&&s[i-2][j+2]==1&&s[i-1][j+1]==1){
                    flag=true;
                }
                else if (s[i+1][j-1]==1&&s[i-3][j+3]==1&&s[i-2][j+2]==1&&s[i-1][j+1]==1){
                    flag=true;
                }

                else if (s[i+1][j]==1&&s[i+2][j]==1&&s[i+3][j]==1&&s[i-1][j]==1){
                    flag=true;
                }
                else if (s[i+1][j]==1&&s[i+2][j]==1&&s[i-2][j]==1&&s[i-1][j]==1){
                    flag=true;
                }
                else if (s[i+1][j]==1&&s[i-3][j]==1&&s[i-2][j]==1&&s[i-1][j]==1){
                    flag=true;
                }

                if (flag){
                    System.out.print(i-3);
                    System.out.print(" ");
                    System.out.println(j-3);
                    flag=false;
                }
            }
        }




    }
}
