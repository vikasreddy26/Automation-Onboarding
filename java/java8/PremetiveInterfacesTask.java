package java8;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class PremetiveInterfacesTask {
    public static void main(String[] args) {
        System.out.println( isPrime().test(7));
        squareOf().accept(5);

    }

    public static IntPredicate isPrime(){
        IntPredicate isPrime = number -> {
            int count =0;
            for(int i = 1;i<=number;i++){
                if(number % i == 0){
                    count++;
                }
            }
            if(count == 2){
              return true;
            }else
                return false;
        };
        return isPrime;
    }

    public static IntConsumer squareOf(){
        IntConsumer square = (arg)->{
            arg = arg *arg;
            System.out.println(arg);
        };
        return square;
    }

}
