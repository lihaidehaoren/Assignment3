import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String E = sc.nextLine();
        String[] arr4 = E.split(" ");
        int[] e = new int[arr4.length];
        for (int i = 0; i < e.length; i++) {
            e[i] = Integer.parseInt(arr4[i]);
        }
        int row=e[0];
        int col=e[1];

        int[][] string=new int[row+2][col+2];

        for(int i=1; i<row+1;i++){
            for(int j=1;j<col+1;j++){
                string[i][j]=-1;
            }
        }


        int n=row*col;
        int d=0;
        int x=0;
        int y=1;
        while (n>0){
            if (d==0&&string[x+1][y]==-1){
                x=x+1;
                string[x][y]=sc.nextInt();
                n=n-1;
            }
            else if (d==1&&string[x][y+1]==-1){
                y=y+1;
                string[x][y]=sc.nextInt();
                n=n-1;
            }
            else if (d==2&&string[x-1][y]==-1){
                x=x-1;
                string[x][y]=sc.nextInt();
                n=n-1;
            }
            else if (d==3&&string[x][y-1]==-1){
                y=y-1;
                string[x][y]=sc.nextInt();
                n=n-1;
            }
            else {
                d=(d+1)%4;
            }
        }


        for(int i=1; i<row+1;i++){
            for(int j=1;j<col+1;j++){
                System.out.print(string[i][j]+" ");
            }
            System.out.println();
        }

    }

}
