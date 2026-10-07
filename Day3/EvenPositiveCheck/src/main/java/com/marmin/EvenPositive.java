package com.marmin;

import java.util.ArrayList;

public class EvenPositive{
    public ArrayList<Boolean> CheckPositive(ArrayList<Integer> Number){
        ArrayList<Boolean> Result = new ArrayList<>();
        for(int number :Number){
        if(number > 0){
          if(number % 2 == 0) Result.add(true);
          else Result.add(false);
        }
        else{
            Result.add(false);
        }

    }
    return Result;
    
}
}
