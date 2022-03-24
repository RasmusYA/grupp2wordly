package com.grupp2.hardly;

public class StringChecker {
    int[] Check(int len, String userString, String correctString) {
        int[] result = new int[len];
        /**
         * 1 - correct
         * 2 - exists in wrong position
         * 3 - incorrect

         */
        for (int i = 0; i < len; i++) {
            if (userString.charAt(i)==correctString.charAt(i)){
                result[i] = 1;
            }
            if (userString.charAt(i)!=correctString.charAt(i)){
                for(int k =0; k< len; k++ ){
                    if (userString.charAt(i)!=correctString.charAt(k)){
                        result[i] = 2;
                    }

                }
            }
            if (result[i] != 1 && result[i] != 2){
                result[i] = 3;
            }
        }


        return result;
    }
    int   SingleCheck(int pos, char c, String correctString) {
        if (correctString.charAt(pos) == c) {
            return 1;
        }
        if (correctString.charAt(pos) != c) {
            for (int i = 0; i < correctString.length(); i++) {
                if(correctString.charAt(i) == c) {
                    return 2;
                }
            }
        }
        return 3;
    }
}