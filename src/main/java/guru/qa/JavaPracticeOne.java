package guru.qa;

import com.sun.source.util.SourcePositions;

public class JavaPracticeOne {

    public static void main(String[] args) {
        int a = 50;
        int b = 25;
        int c = 30;
        double double1 = 11.1;
        byte byte1 = 100;
        byte byte2 = 127;
        // Операторы математические + - * / %
        System.out.println("a+b=" + (a+b));
        System.out.println("a-b=" + (a-b));
        System.out.println("a/b=" + (a/b));
        System.out.println("a%b=" + (a%b));
        System.out.println("a*b=" + (a*b));
        // Операторы условные > < >= <= == != !
        int number = 8;
        if (number < 10) {
            System.out.println("Число меньше 10");
        } else if (number > 10) {
            System.out.println("Число больше 10");
        } else {
            System.out.println("Число равно 10");
        }
        // Операторы логические && ||
        System.out.println(a>b && c>b);
        System.out.println(a>double1 || a>c);
        //Переполненение переменной при вычислении
        System.out.println(byte1*byte2);
        //Вычисление комбинаций типов данных
        System.out.println(a * double1);
    }
}


