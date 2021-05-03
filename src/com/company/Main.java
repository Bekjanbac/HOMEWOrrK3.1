package com.company;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
//  обший результат поделить
    public static void main(String[] args) {
double[]arr = {2.3,-8,7.3,-4,-8,4.4,6.9,-9.5,5.2,5,-6,2.1,9,5.-3,2.2};
double num =0;
double num2 = 0;
int NUM3=0;
        for (double f:arr         ) {
            if (f>0 && NUM3>0){
                num +=f;
                num2++;
            }else if (f<0){NUM3++;


            }
        }
        System.out.println("сренднее афирматическое "  + num/ num2);


  }


}
