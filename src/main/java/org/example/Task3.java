package org.example;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

// Дан массив чисел.
// Вывести число, которое повторяется чаще всего.
// Если таких несколько - вывести наименьшее из них.

public class Task3 {

    public int mostRepeatableNumber(List<Integer> numbers) {

    }

    public static void main(String[] args) {
        int quantityOfNumber = 10;
        List<Integer> numbers = Stream.iterate(0, n -> new Random().nextInt(0, 10))
                .limit(quantityOfNumber).toList();
        System.out.println(new Task3().mostRepeatableNumber(
                numbers
        ));
    }
}
