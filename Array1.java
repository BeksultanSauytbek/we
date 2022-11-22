import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int[n][m];
        int min = 10000000;

        for(int i = 0; i < n; i++){
            int max = 0;
            for(int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
                if(max < arr[i][j])
                    max = arr[i][j];
            }
            min = Math.min(min, max);
        }
        System.out.println(min);


    }
}