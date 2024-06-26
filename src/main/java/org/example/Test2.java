package org.example;


//да
//заменить run на new Thread(test).start()
//Будет ли выведен 0
public class Test2 implements Runnable {
    private int counter;

    public void inc(){
        counter++;
    }

    public void dec(){
        counter--;
    }

    public int get(){
        return counter;
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            inc();
        }
    }

    public static void main(String[] args) {
        Test2 test = new Test2();
        test.run();
        for (int i = 0; i < 4; i++){
            test.dec();
        }
        System.out.println(test.get());
    }
}
