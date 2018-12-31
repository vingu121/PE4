package com.stackroute.pefour;


public class StringSort {

    public String[] sortWords(String string){
        String[] strArr= string.toLowerCase().split(" ");
        String temp;

        for (int i = 0; i < strArr.length; i++)
        {
            for (int j = i + 1; j < strArr.length; j++)
            {
                if (strArr[i].compareTo(strArr[j])>0)
                {
                    temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }


        return strArr;

    }

}
