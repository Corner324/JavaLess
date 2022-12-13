package com.company.pract.pract7;
import java.util.*;

public class Game {

    ArrayDeque<Integer> deck1 = new ArrayDeque<>();
    ArrayDeque<Integer> deck2 = new ArrayDeque<>();
    Scanner in = new Scanner(System.in);
    int gameCount = 0;

    // 1 3 5 7 9
    // 2 4 6 8 0



    public void main(){

        System.out.println("\n -------- Карточная игра \"Пьяница\" -------- ");


        // Компановка карт в колоды
        System.out.print("Карты первого игрока: ");
        for (int i = 0 ; i < 5 ; i++)
            deck1.addLast(in.nextInt());

        System.out.print("Карты второго игрока: ");
        for (int i = 0 ; i < 5 ; i++)
            deck2.addLast(in.nextInt());


        // Начало игры
        //System.out.println("      ------ Игра началась ------ \n");
        while (true) {

            if (gameCount > 106){
                System.out.println("botva");
                //System.out.println("      ------ Игра завершена ------ ");
                return;
            }
            if (deck1.size() == 10 || deck2.size() == 10){
                //System.out.println("      ------ Игра завершена ------ ");
                if (deck1.size() == 10)
                    System.out.println("first" + gameCount );
                if (deck2.size() == 10)
                    System.out.println("second " + gameCount );
                return;
            }

            int card1 = deck1.pollFirst();
            //System.out.println("  Игрок 1 вытаскивает карту - " + card1);
            int card2 = deck2.pollFirst();
            //System.out.println("  Игрок 2 вытаскивает карту - " + card2);


            if(card1 == 0){
                //System.out.println("Игрок 1 побеждает, в его колоде теперь " + (deck2.size() + 2) + " карт\n");
                deck1.addLast(card1);
                deck1.addLast(card2);
            }
            else if(card2 == 0){
                //System.out.println("Игрок 2 побеждает, в его колоде теперь " + (deck2.size() + 2) + " карт\n");
                deck2.addLast(card1);
                deck2.addLast(card2);
            }
            else if (card1 > card2){
                //System.out.println("Игрок 1 побеждает, в его колоде теперь " + (deck1.size() + 2) + " карт\n");
                deck1.addLast(card1);
                deck1.addLast(card2);
            }
            else if(card1 < card2){
                //System.out.println("Игрок 2 побеждает, в его колоде теперь " + (deck2.size() + 2) + " карт\n");
                deck2.addLast(card1);
                deck2.addLast(card2);
            }
            else
            {
                //System.out.println("Выпали одинаковые карты, ход повторяется");
                deck1.addLast(card1);
                deck2.addLast(card2);
            }
            gameCount++;
        }
    }


}
