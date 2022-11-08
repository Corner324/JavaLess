package com.company.pract.pract5;

import java.util.Scanner;



public class Recursion {
    Scanner in = new Scanner(System.in);

   /*
    Дано натуральное число N. Выведите все его цифры по одной, в обратном
  порядке, разделяя их пробелами или новыми строками.
   */

    public void main() {
        System.out.println("Алгоритм 1. ");
        alg1();
        System.out.println("Алгоритм 2. ");
        alg2();
        System.out.println("Алгоритм 3. ");
        alg3();
    }

    void rec1(int n){
        if (n % 10 > 0){
            System.out.println(n%10);
            rec1(n/10);
        }
        else{
            return;
        }
    }
    public void alg1(){
        int N;
        System.out.print("Ваше число: ");
        N = in.nextInt();
        rec1(N);
    }

    /*
      Дана последовательность натуральных чисел (одно число в строке),
    завершающаяся числом 0. Определите, какое количество элементов этой
    последовательности, равны ее наибольшему элементу.
     */

    void rec2(int n, int max, int count){
        if (n == 0){
            System.out.println("Количество чисел равных максимальному(" + max + ") - " + count);
            return;
        }
        else{
            if (n > max){
                max = n;
                count=0;
            }
            if (n == max)
                count++;

            n = in.nextInt();
            rec2(n, max, count);
        }
    }
    public void alg2(){
        int N = in.nextInt();
        rec2(N,0,0);
    }

    /*
        Дана последовательность натуральных чисел (одно число в строке),
      завершающаяся числом 0. Определите наибольшее значение числа в этой
      последовательности.
     */

    void rec3(int n, int max){
        if (n == 0){
            System.out.println("Наибольшее число в этой последовательности - " + max);
            return;
        }
        else{
            if (n > max){
                max = n;
            }
            n = in.nextInt();
            rec3(n, max);
        }
    }
    public void alg3(){
        int N = in.nextInt();
        rec3(N,0);
    }

}
