package org.example;

//типы мап
//корнер кейсы

public class ParseHolder {


    /**
     * Написать парсер строки. С функциями
     * 1. По ключу могли достать значение за О(1)
     * 2. Выдать исходную строку
     * Пример входной строке
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
