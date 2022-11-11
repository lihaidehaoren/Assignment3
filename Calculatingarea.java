import java.util.Scanner;

public class Calculatingarea {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double s1= 1.0;
        double s2 = Math.PI /4;
        double s3 = (Math.sqrt(3))/4 + Math.PI/6;
        double area = 0;

        int[][]s=new int[202][202];
        for(int i=0; i<202;i++){
            for(int j=0;j<202;j++){
                s[i][j]=0;
            }
        }

        int n=sc.nextInt();
        int op,x,y;

        while (n>0){
            op= sc.nextInt();
            x=sc.nextInt();    //j=100+x
            y=sc.nextInt();    //i=100-y

            if (op==2){
                s[100-y][100+x]=s[100-y][100+x]|15;
                s[100-y][100+x+1]=s[100-y][100+x+1]|15;
                s[100-y+1][100+x]=s[100-y+1][100+x]|15;
                s[100-y+1][100+x+1]=s[100-y+1][100+x+1]|15;
            }
            else if (op==1){
                s[100-y][100+x]=s[100-y][100+x]|6;
                s[100-y][100+x+1]=s[100-y][100+x+1]|3;
                s[100-y+1][100+x]=s[100-y+1][100+x]|12;
                s[100-y+1][100+x+1]=s[100-y+1][100+x+1]|9;
            }
            n=n-1;
        }
        for(int i=0; i<202;i++){
            for(int j=0;j<202;j++) {
                if (s[i][j]==3||s[i][j]==6||s[i][j]==9||s[i][j]==12){
                    area=area+s2;
                }
                else if (s[i][j]==15){
                    area=area+s1;
                }
                else if (s[i][j]!=0){
                    area=area+s3;
                }
            }
        }
           System.out.printf("%.5f",area);
    }
}
