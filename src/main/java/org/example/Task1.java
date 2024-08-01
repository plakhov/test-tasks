package org.example;


//1 4 5
// нет исключения при делении на ноль вещественных числе
// иерархия исключений


public class Task1 {
    public static void main(String[] args) {
        try {
            double i = 1/0.0;
            System.out.println("1");
        } catch (ArithmeticException e) {
            System.out.println("2");
            throw new RuntimeException();
        } catch (Throwable e) {
            System.out.println("3");
        } finally {
            System.out.println("4");
        }
        System.out.println("5");
    }
}
