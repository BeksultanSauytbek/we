import java.sql.SQLOutput;
import java.util.*;
public class massiv1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[3];
        for(int i = 0; i < 3; i++){
            arr[i] = in.next();
        }
        String s = "SDU";
        for(int i = 0; i < 3; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i = 0; i < 3; i++){
            if(s.equals(arr[i])){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
