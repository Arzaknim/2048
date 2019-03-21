package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public void gen(){

    }

    public static void main(String[] args) {
	// write your code here
        int a,b;
        int c[][] = new int[4][4];
        boolean gameLogic = true;
        boolean ctrl = true;
        while (gameLogic){
            do {
                a = (int) (Math.random() * 4);
                b = (int) (Math.random() * 4);
                if (c[a][b] != 0){
                    for (int i = 0; i < 4; i++){
                        for (int j = 0; j < 4; j++){

                        }
                    }
                    ctrl = false;
                    continue;
                }
                ctrl = true;
                c[a][b] = 2;
            }
            while(c[a][b] == 0 || !ctrl);
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 4; i++){
                for (int j = 0; j < 4; j++){
                    System.out.print("|" + c[i][j]);

                }
                System.out.println();
            }
            System.out.print("Input w,a,s or d: ");
            char control = sc.next().charAt(0);
            if (control == 'd'){
                int p = 0;
                for (int i = c.length-1; i >= 0; i--){
                    p = 3;
                    for (int j = c[i].length-1; j >= 0; j--){
                        if (c[i][j] != 0){
                            c[i][p] = c[i][j];
                            if (j != p)
                                c[i][j] = 0;
                            p--;
                                /*if (c[i][j] == c[i][j-1] && c[i][j] != 0 && c[i][j-1] != 0) {
                                    c[i][j] *= 2;
                                    c[i][j - 1] = 0;
                                    p++;
                                }*/
                        }
                    }
                    }
                for (int i = c.length-1; i >= 0; i--){
                    for (int j = c.length-1; j > 0; j--){
                        if (c[i][j] == c[i][j-1] && c[i][j] != 0 && c[i][j-1] != 0) {
                            c[i][j] *= 2;
                            c[i][j - 1] = 0;
                        }
                    }
                }
                for (int i = c.length-1; i >= 0; i--){
                    p = 3;
                    for (int j = c[i].length-1; j >= 0; j--){
                        if (c[i][j] != 0){
                            c[i][p] = c[i][j];
                            if (j != p)
                                c[i][j] = 0;
                            p--;
                                /*if (c[i][j] == c[i][j-1] && c[i][j] != 0 && c[i][j-1] != 0) {
                                    c[i][j] *= 2;
                                    c[i][j - 1] = 0;
                                    p++;
                                }*/
                        }
                    }
                }
                }
            else if (control == 'a'){
                for (int i = 0; i <= c.length-1; i++){
                    int p = 0;
                    for (int j = 0; j <= c[i].length-1; j++){
                        if (c[i][j] != 0){
                            c[i][p] = c[i][j];
                            if (j != p)
                                c[i][j] = 0;
                            p++;
                        }
                    }
                }
                for (int i = 0; i <= c.length-1; i++){
                    for (int j = 0; j < c.length-1; j++){
                        if (c[i][j] == c[i][j+1] && c[i][j] != 0 && c[i][j+1] != 0) {
                            c[i][j] *= 2;
                            c[i][j + 1] = 0;
                        }
                    }
                }
                for (int i = 0; i <= c.length-1; i++){
                    int p = 0;
                    for (int j = 0; j <= c[i].length-1; j++){
                        if (c[i][j] != 0){
                            c[i][p] = c[i][j];
                            if (j != p)
                                c[i][j] = 0;
                            p++;
                        }
                    }
                }
            }
            else if (control == 'w'){
                for (int i = 0; i <= c.length-1; i++){
                    int p = 0;
                    for (int j = 0; j <= c[i].length-1; j++){
                        if (c[j][i] != 0){
                            c[p][i] = c[j][i];
                            if (j != p)
                                c[j][i] = 0;
                            p++;
                        }
                    }
                }
                for (int j = 0; j <= c.length-1; j++){
                    for (int i = 0; i < c.length-1; i++){
                        if (c[i][j] == c[i+1][j] && c[i][j] != 0 && c[i+1][j] != 0) {
                            c[i][j] *= 2;
                            c[i+1][j] = 0;
                        }
                    }
                }
                for (int i = 0; i <= c.length-1; i++){
                    int p = 0;
                    for (int j = 0; j <= c[i].length-1; j++){
                        if (c[j][i] != 0){
                            c[p][i] = c[j][i];
                            if (j != p)
                                c[j][i] = 0;
                            p++;
                        }
                    }
                }
            }
            else if (control == 's'){
                for (int i = c.length-1; i >= 0; i--){
                    int p = 3;
                    for (int j = c[i].length-1; j >= 0; j--){
                        if (c[j][i] != 0){
                            c[p][i] = c[j][i];
                            if (j != p)
                                c[j][i] = 0;
                            p--;
                        }
                    }
                }
                for (int j = c.length-1; j >= 0; j--){
                    for (int i = c.length-1; i >= 1; i--){
                        if (c[i][j] == c[i-1][j] && c[i][j] != 0 && c[i-1][j] != 0) {
                            c[i][j] *= 2;
                            c[i-1][j] = 0;
                        }
                    }
                }
                for (int i = c.length-1; i >= 0; i--){
                    int p = 3;
                    for (int j = c[i].length-1; j >= 0; j--){
                        if (c[j][i] != 0){
                            c[p][i] = c[j][i];
                            if (j != p)
                                c[j][i] = 0;
                            p--;
                        }
                    }
                }
            }
            }
        }
    }

    // moving them aside to the chosen direction
    /*for (int k = 3-j ; k > 0; k--){
                                if (c[i][j+k] == 0) {
                                    c[i][j] = c[i][j+k];
                                    c[i][j] = 0;

                                }/*
      //controling of the fucking blocks
                          /*if (c[i][j] == c[i][j-1] && c[i][j] != 0 && c[i][j-1] != 0) {
                            c[i][j] *= 2;
                            c[i][j - 1] = 0;
                            }*/

