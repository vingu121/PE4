package com.stackroute.pefour;

public class StringTranspose {

    public String transpose(String str) {
        String[] strarry = str.split("\\s");
        String schar = "";
        int k = 0;
        String strarry1 = "";
        for (int i = 0; i < strarry.length; i++) {
            for (int j = strarry[i].length() - 1; j >= 0; j--) {
                schar += strarry[i].charAt(j);
            }
            strarry1 += schar + " ";
            schar = "";
        }
        return strarry1.trim();
    }
}
