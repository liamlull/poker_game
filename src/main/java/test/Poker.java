package test;

import java.util.*;
import java.util.jar.JarOutputStream;

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
    private final int STRAIGHT = 3;
    private final int FLUSH = 4;
    private final int FULL_HOUSE = 5;
    private final int FOUR_OF_A_KING = 6;
    private final int STRAIGHT_FLUSH = 7;
    List<Integer> resultList = new ArrayList<>();
    private int result = 0;


    public Poker(String[] gamerPoker) {
        Map<Character, Integer> countMap = new HashMap<Character, Integer>() {
        };
        Map<Character,Integer> flushMap = new HashMap<>();
        for (int i = 0; i < 8; i++) {
            resultList.add(0);
        }
        for (int i = 0; i < gamerPoker.length; i++) {
            if (gameMap.containsKey(gamerPoker[i].charAt(0))) {
                this.result += gameMap.get(gamerPoker[i].charAt(0));
            }
            countMap = getCount(countMap,gamerPoker[i],0);
            flushMap = getCount(flushMap,gamerPoker[i],1);
        }

        calculatePokerType(countMap,flushMap);
    }


    private void calculatePokerType(Map<Character, Integer> countMap, Map<Character, Integer> flushMap) {
        if(countMap.size() == 5){
            if(isStraight(countMap)){
                resultList.set(STRAIGHT, 1);
            }
        }
        if (countMap.size() == 4) {
            resultList.set(PAIR, getKeyValue(countMap,2));
        }
        if (countMap.size() == 3 && countMap.containsValue(2)) {
            resultList.set(TWO_PAIR, getKeyValue(countMap,2));
        }
        if (countMap.size() == 3 && countMap.containsValue(3)) {
            resultList.set(THIRD_OF_A_KING, getKeyValue(countMap,3));
        }
        if(flushMap.size() == 1){
            if(resultList.get(STRAIGHT)!=0){
                resultList.set(STRAIGHT_FLUSH,1);
            }
            resultList.set(FLUSH,1);
        }
        if(countMap.size()==2&&countMap.containsValue(3)){
            resultList.set(FULL_HOUSE,getFullHouseValue(countMap));
        }
        if(countMap.size()==2&&countMap.containsValue(4)){
            resultList.set(FOUR_OF_A_KING,getKeyValue(countMap,4));
        }
    }

    private Map<Character, Integer> getCount(Map<Character, Integer> countMap, String pokerMessage, int i) {
        if (countMap.containsKey(pokerMessage.charAt(i))) {
            countMap.put(pokerMessage.charAt(i), countMap.get(pokerMessage.charAt(i)) + 1);
        } else {
            countMap.put(pokerMessage.charAt(i), 1);
        }
        return countMap;
    }

    private int getFullHouseValue(Map<Character, Integer> countMap) {
        int sum = 0;
        sum += getKeyValue(countMap,3);
        sum += getKeyValue(countMap,2);
        return sum;
    }

    private boolean isStraight(Map<Character, Integer> countMap) {
        List<Integer> numList = new ArrayList<>();
        int min = 10000;
        for (Character key : countMap.keySet()) {
            if(gameMap.get(key)<min){
                min = gameMap.get(key);
            }
            numList.add(gameMap.get(key));
        }
        for(int i=0;i<5;i++){
            if(numList.contains(new Integer(min))){
                min = min*2;
            }else{
                return false;
            }
        }
        return true;
    }

    private int getKeyValue(Map<Character, Integer> countMap,int keyValue){
        int sum = 0;
        for (Character key : countMap.keySet()) {
            if (countMap.get(key) == keyValue) {
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
