// No import and no third party library(standard library)

class JavaMath
{
    public static final double PI = 22 / 7d; // The `PI` constant number

    public static long max(long ... array) // default value is -> {}
    {
        long init = 0;
        boolean started = false;
        for (long arr: array){
            if (!started){
                init = arr;
                started = true;
            }
            else if (init < arr) init = arr;
        }
        return init;
    }

    public static int abs(int val){
        return val >= 0? val : -val;
    }


    public static int floor(double val){
        int nw;
        if (val < 0){
            double df1 = val - ((int)val - 1);
            double df2 = (int)val-val;
            nw = df2 > df1? (int)val - 1 : (int)val ;
        }
        else{
            double df1 = val - (int)val;
            double df2 = ((int)val+1) - val;
            if (df2 > df1) nw = (int)val-1;
            else if (df2==df1) nw = (int)val+1;
            else nw = (int)val;
        }
        return nw;
    }


    public static long min(long ... array)
    {
     long b = 0;
     boolean started = false;
     for(long arr: array){
         if (!started) {b = arr;
             started = true;
         }
         else if (b > arr) b = arr;

     }
     return b;
    }

    public static double pow(long base, int exp){
        long new_base = base;
        int new_exp = abs(exp);
        if (exp == 0) return 1;
        else{
            for(int i = 1; i < new_exp; i++){
                new_base*=base;
            }
        }
        return exp > 1? (int)new_base : 1d / new_base ;
    }


}


public class MainJavaMath {
    public static void main(String[] args){
        System.out.println(JavaMath.max(1, 2, 3, 4, 6));
        System.out.println(JavaMath.abs(-1));
        System.out.println(JavaMath.floor(11.5));
        System.out.println(JavaMath.min(1, 2, 3, 4, 6));
        System.out.println(JavaMath.pow(2, 10));
        System.out.println(JavaMath.PI);
    }
}
