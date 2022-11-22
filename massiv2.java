import java.sql.SQLOutput;
import java.util.*;
public class massiv2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr = new char[4];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextLine().charAt(0);

        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
