package com.company.lab.lab1;

// Вариант 1

public class Cycle {
    int size;
    int sum;
    int[] array;
    public Cycle(int n, int[] array) {
        this.size = n;
        this.array = array;
    }

    public void CFor(){

        for (int i = 0 ; i < this.size ; i++){
            sum += this.array[i];
        }
        System.out.println("Цикл for, ответ: " + sum);
    }

    public void CWhile(){
        int i = 0, sum = 0;
        while (i < this.size){
            sum += this.array[i];
            i++;
        }

        System.out.println("Цикл while, ответ: " + sum);
    }

    public void CDoWhile(){
        int i = 0, sum = 0;
        do {
            sum += this.array[i];
            i++;
        } while (i < this.size);


        System.out.println("Цикл do while, ответ: " + sum);
    }






}
