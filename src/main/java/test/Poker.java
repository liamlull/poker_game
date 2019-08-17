package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Poker {
    Map<Character, Integer> gameMap = new HashMap<Character, Integer>() {{
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

    private final int PAIR = 0;
    private final int TWO_PAIR = 1;
    private final int THIRD_OF_A_KING = 2;
    List<Integer> resultList = new ArrayList<>();
    private int result = 0;

    public Poker(String[] gamerPoker) {
        Map<Character, Integer> countMap = new HashMap<Character, Integer>() {
        };
        for (int i = 0; i < 3; i++) {
            resultList.add(0);
        }
        for (int i = 0; i < gamerPoker.length; i++) {
            if (gameMap.containsKey(gamerPoker[i].charAt(0))) {
                this.result += gameMap.get(gamerPoker[i].charAt(0));
            }
            if (countMap.containsKey(gamerPoker[i].charAt(0))) {
                countMap.put(gamerPoker[i].charAt(0), countMap.get(gamerPoker[i].charAt(0)) + 1);
            } else {
                countMap.put(gamerPoker[i].charAt(0), 1);
            }

            if (countMap.size() == 4) {
                resultList.set(PAIR, getPariValue(countMap));
            }
            if (countMap.size() == 3 && countMap.containsValue(2)) {
                resultList.set(TWO_PAIR, getTwoPariValue(countMap));
            }
            if (countMap.size() == 3 && countMap.containsValue(3)) {
                resultList.set(THIRD_OF_A_KING, getThirdOfAKingValue(countMap));
            }
        }
    }

    private Integer getPariValue(Map<Character, Integer> countMap) {
        for (Character key : countMap.keySet()) {
            if (countMap.get(key) == 2) {
                return gameMap.get(key);
            }
        }
        return 0;
    }

    private Integer getThirdOfAKingValue(Map<Character, Integer> countMap) {
        for (Character key : countMap.keySet()) {
            if (countMap.get(key) == 3) {
                return gameMap.get(key);
            }
        }
        return 0;
    }

    private Integer getTwoPariValue(Map<Character, Integer> countMap) {
        int sum = 0;
        for (Character key : countMap.keySet()) {
            if (countMap.get(key) == 2) {
                sum += gameMap.get(key);
            }
        }
        return sum;
    }



    public int getResult() {
        return result;
    }

    public List<Integer> getResultList() {
        return resultList;
    }
}
