package com.example.cse14.myalarm;

import java.util.Random;

/**
 * Created by 11 on 4/16/2016.
 */
public class Game {

    public void generateRandomNumber(int[] arr){
        int randomNumber;
        boolean check;
        Random random = new Random();

        for(int i = 0; i < arr.length; i++){
            randomNumber = random.nextInt(8)+1;
            check = true;
            for(int j = 0; j < i; j++){
                if(arr[j] == randomNumber){
                    i--;
                    check=false;
                }
            }
            if(check){
                arr[i] = randomNumber;
            }
        }
    }


}
