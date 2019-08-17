package test;

import java.util.HashMap;
import java.util.Map;

public class Game {
    Map<Character,Integer> gameMap = new HashMap<Character, Integer>(){{
        put('2', 1);
        put('3', 2);
        put('4', 4);
        put('5', 8);
        put('6', 16);
        put('7', 32);
        put('8', 64);
        put('9', 128);
        put('T', 256);
        put('J', 512);
        put('Q', 1024);
        put('K', 2048);
        put('A', 4096);
    }};


    public int startGame(String[] gamer1, String[] gamer2) {
        Poker poker1 = new Poker(gamer1);
        Poker poker2 = new Poker(gamer2);
        for(int i=poker1.getResultList().size()-1;i>=0;i--){
            if(poker1.getResultList().get(i)>poker2.getResultList().get(i)){
                return 1;
            }else if(poker1.getResultList().get(i)<poker2.getResultList().get(i)){
                return 2;
            }
        }
        if(poker1.getResult()>poker2.getResult()){
            return 1;
        }else if(poker2.getResult()>poker1.getResult()){
            return 2;
        }else {
            return 0;
        }
    }
}
