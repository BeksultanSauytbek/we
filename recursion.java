import java.util.*;
import java.math.*;
public class recursion {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        String c = in.next();
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        BigInteger cc = new BigInteger(c);
        BigInteger max = aa.max(bb.max(cc));
        System.out.println(max);
    }
}