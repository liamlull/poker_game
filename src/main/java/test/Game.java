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
        int result1 = getResult(gamer1);
        int result2 = getResult(gamer2);
        if(result1>result2){
            return 1;
        }else if(result2>result1){
            return 2;
        }else {
            return 0;
        }
    }

    private int getResult(String[] gamer1) {
        Map<Character,Integer> countMap = new HashMap<Character, Integer>(){};

        int pair = 0;
        int result = 0;
        for (int i = 0; i < gamer1.length; i++) {
            if (gameMap.containsKey(gamer1[i].charAt(0))) {
                result += gameMap.get(gamer1[i].charAt(0));
            }
            if (countMap.containsKey(gamer1[i].charAt(0))) {
                pair = gamer1[i].charAt(0);
                countMap.put(gamer1[i].charAt(0), countMap.get(gamer1[i].charAt(0))+1);
            }else {
                countMap.put(gamer1[i].charAt(0), 1);
            }
        }
        if(countMap.size()==4){
            countMap.clear();
            return 10000*pair+result;
        }
        return result;
    }
}
