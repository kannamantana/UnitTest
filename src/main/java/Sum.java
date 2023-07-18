import java.util.Scanner;

class Sum {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print();
        int value1 = scanner.nextInt();
        print();
        int value2 = scanner.nextInt();
        print();
        int value3 = scanner.nextInt();
        int result  = sum(value1, value2, value3);
        System.out.println("Сумма чисел = " + result);
        System.out.println( comparing(result) );
    }
    public static void print() {
        System.out.println("Введите число : " );
    }

    public static int sum(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }

    static boolean comparing(int a){
        return (a > 100);
    }


}