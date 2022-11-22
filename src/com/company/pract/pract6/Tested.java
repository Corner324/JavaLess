package com.company.pract.pract6;

public class Tested {
    public static void main(){
        Student[] iDNumber = {new Student("Mark", 19),new Student("Anton", 20),new Student("Alex", 18)};

        System.out.println("Исходный массив:");
        for (int i = 0; i < iDNumber.length; i++) {
            System.out.println("   " + iDNumber[i] + " ");
        }

        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < iDNumber.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            Student swap = iDNumber[i];
            for (j = i; j > 0 && swap.age > iDNumber[j - 1].age; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                iDNumber[j] = iDNumber[j - 1];
            }
            iDNumber[j] = swap;
        }

        System.out.println("Отсортированный массив:");
        for (int i = 0; i < iDNumber.length; i++) {
            System.out.println("   " + iDNumber[i] + " ");
        }
    }
}
