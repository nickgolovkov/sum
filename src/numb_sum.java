/**
 * Created by User on 02.08.2017.
 */
public class numb_sum {
    public static void main(String [] args) {
        int int2=0;

        for (int i = 0; i < args.length; i++) {
             int i1=Integer.parseInt(args[i]);
             int2= i1+int2 ;

        }
        System.out.print(int2);
    }
}
