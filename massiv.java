import java.sql.SQLOutput;
import java.util.*;
public class massiv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++) {

        }
        int min = Integer.MAX_VALUE;
            arr[1] = in.nextInt();
            for (int i = 0; i < arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
        System.out.println(min);


    }
}
