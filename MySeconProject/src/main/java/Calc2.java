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
public class Calc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the first number:");
        double first = scan.nextDouble();
        //System.out.printf("%.4f", first); - заккоментил проверку


        System.out.println("Enter the second number:");
        double second = scan.nextDouble();
        //System.out.printf("%.4f", second); - заккоментил проверку


        double sum = first+second;

        System.out.printf("Sum is: %.4f", sum);

        scan.close();






    }
}
