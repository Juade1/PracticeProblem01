package com.stayready;

public class PracticeProblem01 {

    // this code checks if the code is a palindrone
    // if it is return true, else return false
    public boolean isPalindrone(String input01) {

        // pointer pointing at  beggining
        //pointer pointing at end
        int i = 0, j= input01.length() -1;

        //While you can still compare the charecters
        while (i < j){

            // if the char are not equal return false
            if (input01.charAt(i) != input01.charAt(j))
                return false;

            //increment start position
            // decrement from last position
            i++;
            j--;
        }
        return true;
    }
    public String getPalindrome( String input01){
        return null;
    }
}
