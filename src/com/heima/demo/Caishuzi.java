package com.heima.demo;

import java.util.Random;
import java.util.Scanner;
public class Caishuzi {
    public static void main(String[]args){
        Random r=new Random();
        int num=r.nextInt(100)+1;
       while (true){
           Scanner sr=new Scanner(System.in);
           System.out.println("请输入一个数字");
           int guessnum=sr.nextInt();
           if(guessnum>num) {
               System.out.println("猜大了");
           } else if(guessnum<num){
                   System.out.println("猜小了");
               }else{
                   System.out.println("猜对了");
                   break;
               }
           }
       }

    }


