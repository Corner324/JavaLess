package com.company.lab1;

public class TestCycle {
    public static void main(){

        int array[] = {0,1,2,3,4,5,6,7,8,9};
        Cycle cycle = new Cycle(array.length,array);
        cycle.CFor();
        cycle.CWhile();
        cycle.CDoWhile();

    }

}
