package Car;

public class Calculator {

    public static int addSum(){
        int x = 30;
        int y = 40;

        return x + y;
    }

    public static int subtractSum(){
        int a = 50;
        int b = 30;

        return a - b;
    }


    public static int divideSum(){
        int c = 150;
        int d = 3;

        return c / d;

    }

    public static int multiplySum(){
        int e = 30;
        int f = 10;

        return e * f;
    }

    public static void main(String[] args) {
        System.out.println(multiplySum());
    }
}
