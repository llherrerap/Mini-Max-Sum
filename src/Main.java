//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        long[] arr = new long[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextLong();
        }

        scanner.close();

        System.out.print(maxMinSuma(suma(arr))[0] + " " + maxMinSuma(suma(arr))[1]);
    }
    //Estudiar
    public static long[] suma(long[] arr){
        long suma =0;
        long[] arrSuma = new long[5];
        for (int i = 0; i < arr.length; i++) {
            suma=0;
            for (int j = 0; j < arr.length; j++) {
                if (j != i){
                    suma = arr[j]+suma;
                } else {
                    continue;
                }
            }
            arrSuma[i]=suma;

        }
        return arrSuma;
    }

    public static long[] maxMinSuma(long[] arr){

        long max = arr[0];
        long min = arr[0];
        for( var num : arr){
            if(max < num){
                max = num;
            } else if (min > num){
                min = num;
            }
        }
        long[] arrMaxMin = {min, max};
        return arrMaxMin;
    }
}