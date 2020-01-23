package com.lambton;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringExamples
{
    public static void main(String[] args)
    {

        char c = 'a' +2 ;
        String c1 = "a" + 2;
        int ch= c;
        System.out.println(ch);
        System.out.println(c);
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello";
        String s4 = s1;
        String s5 = new String(s2);
        String s6 = new String();
        s6 =  "world";
        String s7 = new String(" Hello");
        System.out.println("S1 "+ s1);
        System.out.println("S2 "+ s2);
        System.out.println("S3 "+ s3);
        System.out.println("S4 "+ s4);
        System.out.println("S5 "+ s5);
        System.out.println("S6 "+ s6);
        // String Camparison
        if(s1 == s3)
            System.out.println("s1("+ s1 + ")= s3(" + s3 + ")");
        else
            System.out.println("s1("+ s1 + ")<> s3(" + s3 + ")");
        if(s1.equals(s3))
            System.out.println("s1("+ s1 + ")equals s3(" + s3 + ")");
        else
            System.out.println("s1("+ s1 + ")not equals s3(" + s3 + ")");
        if(s1 == s7)
            System.out.println("s1("+ s1 + ")= s7(" + s7 + ")");
        else
            System.out.println("s1("+ s1 + ")<> s7(" + s7 + ")");
        if(s1.equals(s7))
            System.out.println("s1("+ s1 + ")equals s7(" + s7 + ")");
        else
            System.out.println("s1("+ s1 + ")not equals s7(" + s7 + ")");
        if(s2 == s6)
        System.out.println("s2("+ s2 + ")= s6(" + s6 + ")");
        else
        System.out.println("s2("+ s2 + ")<> s6(" + s6 + ")");
        if(s2.equals(s6))
            System.out.println("s2("+ s2 + ")equals s6(" + s6 + ")");
        else
            System.out.println("s2("+ s2 + ")not equals s6(" + s6 + ")");
        s1 = s1.concat("World");
        System.out.println(s1);

        int length = s1.length();
        System.out.println(length);

        s7.intern();
        System.out.println(s7);

        int a = 100;
        int b = 200;
        int c2 = a+b;

        String str = String.format("%d +%d + %d ",a,b,c2);
        System.out.println(str);

        String happyString = String.join("","Welcome"," t0 "," Lambton,","Toronto"," CA");
        System.out.println(happyString);
        String s8 = "Welcome t0  Lambton Toronto";
        System.out.println(s8);
        int i,j;
        char ch1 = 0;
        for(i=0;i<=6;i++)
            for(j=0;j<=5;j++)
            {
                ch1 = s8.charAt(i);
            }
        System.out.println( ch1 +"\n");


    }
}
