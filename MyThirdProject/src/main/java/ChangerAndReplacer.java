import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Vladimir on 03.07.2017.
 */
public class ChangerAndReplacer {
    public static void main(String[] args) {

        int i= 20; // number of digits in the array
        int tmp = 0;
        int[] myArray = new int[i];
        int step = 0;
        int positiveMin=10;
        int negativeMax=-10;
        int positiveMinIndex=0;
        int negativeMaxIndex=0;


        Scanner scan = new Scanner(System.in);

        while (step<i) {
            System.out.print("Enter your number:");
            int number = scan.nextInt();
            myArray[step]=number;

            if ((number <0) && (negativeMax < number)){
                negativeMax=number;
                negativeMaxIndex=step;
            }
            else if ((number>0)&&(positiveMin > number)){
                positiveMin=number;
                positiveMinIndex=step;
            }
            step++;
        }

        System.out.println("Your ENTERED Array: "+Arrays.toString(myArray));
        System.out.println("negativeMax= "+negativeMax+" ("+(negativeMaxIndex+1)+")");
        System.out.println("positiveMin= "+positiveMin+" ("+(positiveMinIndex+1)+")");

         tmp = myArray[negativeMaxIndex];
         myArray[negativeMaxIndex] = myArray[positiveMinIndex];
         myArray[positiveMinIndex] = tmp;

         System.out.println("Your CHANGED Array: "+Arrays.toString(myArray));

    }
}


