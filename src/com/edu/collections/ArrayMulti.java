package com.edu.collections;

public class ArrayMulti {
    public static void main(String[] args) {
        char chars[][] = new char[2][];
        char vowel[] = new char[5];
        vowel[0]='a';
        vowel[1]='e';
        vowel[2]='i';
        vowel[3]='o';
        vowel[4]='u';
        char cons[] = new char[3];
        cons[0]='b';
        cons[1]='c';
        cons[2]='d';

        chars[0]=vowel;
        chars[1]=cons;

        for(int i=0;i<chars.length;i++){
            for (int j=0;j<chars[i].length;j++) {
                System.out.println(chars[i][j]);
            }
        }

    }
}
