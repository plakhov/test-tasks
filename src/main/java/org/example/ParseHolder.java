package org.example;


//как можно решать такую задачу
//какой подход выбрать
//как
//типы мап
//корнер кейсы

public class ParseHolder {
    /**
     * Написать класс, который может преобразовать строку вида: "k=v;k1=v1" в словарь.
     * При это требуется реализовать три метода в этом классе
     * 0. Преобразование строки (parse)
     * 1. Получение значения по индексу за O(1) (getValue)
     * 2. Выдать исходную строку (generateRecord)
     * Пример входной строке key1=val1;key1=abc;key2=val2;key3=val3;key2=val5;key1=val6
     */
    public void parse(String str) {

    }

    public String generateRecord() {
        return null;
    }

    public String getValue(String key) {
        return null;
    }


    public class Solution {
        public static void main(String args[]) throws Exception {
            String testString = "key1=val1;key1=abc;key2=val2;key3=val3;key2=val5;key1=val6";
            ParseHolder parser = new ParseHolder();
            parser.parse(testString);
            System.out.println(parser.generateRecord());
        }
    }
}
