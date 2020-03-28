package _02_Min_3;

//реализуйте метод int min(int a, int b, int c), находящий минимальный из трех аргументов
public abstract class MinHelper {

    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }
}

