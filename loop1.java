import java.util.*;
public class loop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <=n ; j++){
                if(j >= 1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
