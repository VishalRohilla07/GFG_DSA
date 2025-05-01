// Count digit (x>0)

// Ip : x = 9235
// Op : 4

// Ip : x = 38
// Op : 3

// Ip : x = 7
// Op : 1

// Solution: removing the last digit as removing the last digit is very easy, it will do integer division and ignore the remainder and it will give us remaining n-1 digit

package Mathematics;

public class countDigit {

    static int CountDigits(int x){
        int res = 0;
        while(x>0){
            x = x/10;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
       int ans= CountDigits(9235);
       System.err.println(ans);

    }
}





