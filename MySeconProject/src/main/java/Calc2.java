import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by Vladimir on 25.06.2017.
 **Я не знаю что делать с этой ошибкой, но в методе
 *
 * @see #main(String[])
 *
 * какая то лажа со вводом точки в качестве разделителя.
 * С запятой все "ОК"
 *
 * Толковую настройку локализации сделать не смог.
 * Замену точки на запятую - не успел. Прошу понять и простить.
 * Обещаю больше так не косячить.
 *
 * P.S. Тут еще с Float какая то лажа. Он обрезает значения после запятой
 * до одного знака. Поменял на Double - все работает.
 *
 * !!!Внимание!!!
 * @see <a href=http://301-1.ru/img_files/2016_04_18_12_04_53_a599bd83bce6598baaa450727aed45c9.jpg>Внимание!</>
 */

//Calc2 тоже не особо звучное название. По имени класса должно быть примерно понятно, что там может происходить
public class Calc2 {
    public static void main (String[] args){

        System.out.println("For calculator press <1>, for arraycounter press <2>");
        System.out.print("Your choice is: ");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        if (choice.equals("1")) {Calc2.calculator();}

        else if (choice.equals("2")) {Calc2.stringArray();} // а если 3 или любой другой символ?)

        scan.close();
    }

    public static void stringArray() {
        int step = 0;
        int leng1 = 0;
        int max = 0;
        String[] strArray;

        System.out.println("How many words do you have?");
        Scanner scan = new Scanner(System.in);
        String numberOfWords = scan.nextLine();

        int intNumberOfWords = Integer.parseInt(numberOfWords);

        strArray=new String[intNumberOfWords];

        while( step<intNumberOfWords){
            System.out.print("Enter word "+step+":");
            String word = scan.nextLine();

            strArray[step]=word; // присваиваем ячейке массива слово


            int leng2 = word.length(); 
            if (leng2 > leng1)    { //названия leng2 и leng1 ни о чем не говорят. нужно более содержательные придумать
                max = step;
                leng1 = leng2;
            }
            step++;
        }

        System.out.println("The longest word is: "+strArray[max]);
        System.out.println("Your Words is: "+Arrays.toString(strArray));

        scan.close();
    }

// методы обычно называют глаголом. в данном случае - calculate
    public static void calculator() {
        Scanner scan = new Scanner(System.in);

        System.out.print("First number: ");
        String firstNumStr = scan.nextLine();
        float firstFloat = Float.parseFloat(firstNumStr);

        System.out.print("Math symbol: ");
        String symbol = scan.nextLine();

        System.out.print("Second number: ");
        String secondNumStr = scan.nextLine();
        float secondFloat = Float.parseFloat(secondNumStr);

        scan.close();

    if (symbol.equals("+")) {
        float res = firstFloat + secondFloat;
        System.out.print("Result: " + res);

    }
        else if (symbol.equals("-")){
        float res = firstFloat - secondFloat;
        System.out.print("Result: " + res);
    }
        else if (symbol.equals("/")){
        float res = firstFloat / secondFloat;  //а если secondFloat = 0?
        System.out.print("Result: " + res);
    }
        else if (symbol.equals("*")){
        float res = firstFloat * secondFloat;
        System.out.print("Result: " + res);
    }
        else {System.out.print("Please enter correct value");}
}
}





