import java.util.Scanner;

public class GiaTriCuaMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số hàng: ");
        int row=scanner.nextInt();
        System.out.println("Nhập vào số cột: ");
        int col=scanner.nextInt();
        int[][] arr=new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println("Nhập phần tử arr["+i+","+j+"= ]");
                arr[i][j]=scanner.nextInt();
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
        int max=arr[0][0];
        int indexRow=0;
        int indexCol=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (arr[i][j]>max){
                    max=arr[i][j];
                    indexRow=i;
                    indexCol=j;
                }
            }
        }
        System.out.println("Gia tri lớn nhất là "+max+" ở hàng "+indexRow+" ở cột "+indexCol);
    }
}
