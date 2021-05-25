package zad3_4;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class randomNumbers {

    public void randomNumbersToGenerate(int max, int n, int s) {

        ArrayList<Integer> randomNum = new ArrayList<>();

        while (true){
            int num = ThreadLocalRandom.current().nextInt(max);


            if (num == s || num == 0) {
                break;
            }
            randomNum.add(num);
            System.out.println(num);

        }

        System.out.println("------------");

        if (randomNum.size() < n){
            n = randomNum.size();
        }

        for(int i = 0; i < n; i++){

            System.out.println(randomNum.get(i) + " ");
        }

        System.out.println("------------");

        for(int i = 0; i < n ; i++) {

            System.out.println(randomNum.get(randomNum.size() - i - 1) + " ");
        }

        System.out.println("------------");
        TreeSet<Integer> treeSet = new TreeSet(randomNum);
        System.out.println(treeSet);
    }

    public static void main(String[] args) {
        randomNumbers R = new randomNumbers();
        R.randomNumbersToGenerate(10,3,5);
    }
}
