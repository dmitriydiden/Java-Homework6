// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//  отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
package Homework6;

import java.util.Arrays;
import java.util.HashSet;

public class Exemple_notebook {
    public static void main(String[] args) {
        Notebook w1 = new Notebook();
        w1.id = 1001;
        w1.price = 46990;
        w1.RAM = 8;
        w1.HDD = 256;
        w1.brand = "Huawei";
        w1.OS = "Windows";
        w1.color = "Silver";

        Notebook w2 = new Notebook();
        w2.id = 1002;
        w2.price = 109990;
        w2.RAM = 8;
        w2.HDD = 256;
        w2.brand = "Apple";
        w2.OS = "Mac";
        w2.color = "Grey";

        Notebook w3 = new Notebook();
        w3.id = 1003;
        w3.price = 93990;
        w3.RAM = 16;
        w3.HDD = 512;
        w3.brand = "Huawei";
        w3.OS = "Windows";
        w3.color = "Silver";

        Notebook w4 = new Notebook();
        w4.id = 1004;
        w4.price = 85990;
        w4.RAM = 8;
        w4.HDD = 512;
        w4.brand = "Asus";
        w4.OS = "Windows";
        w4.color = "Grey";

        Notebook w5 = new Notebook();
        w5.id = 1005;
        w5.price = 20990;
        w5.RAM = 4;
        w5.HDD = 128;
        w5.brand = "Acer";
        w5.OS = "None";
        w5.color = "Black";

        Notebook w6 = new Notebook();
        w6.id = 1006;
        w6.price = 25990;
        w6.RAM = 4;
        w6.HDD = 256;
        w6.brand = "Lenovo";
        w6.OS = "None";
        w6.color = "Silver";

        Notebook w7 = new Notebook();
        w7.id = 1007;
        w7.price = 36990;
        w7.RAM = 8;
        w7.HDD = 256;
        w7.brand = "Acer";
        w7.OS = "Eshell";
        w7.color = "Black";

        var Notebook = new HashSet<Notebook>(Arrays.asList(w1, w2, w3, w4, w5, w6, w7));
        //System.out.println(Notebook);
        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w3.toString());
        System.out.println(w4.toString());
        System.out.println(w5.toString());
        System.out.println(w6.toString());
        System.out.println(w7.toString());

        // System.out.println(w1.equals(w4));
    }

}
