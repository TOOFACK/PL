package Codder;
import java.util.Scanner;

public class Codder {


    public static void main(String[] args) {
        System.out.println("Hi");
        Scanner scanner = new Scanner(System.in);
       long num1 = scanner.nextLong();
        String c="";
        long i ;
        if (num1<127&num1>-128){
            System.out.println("byte");
        }
        else if(num1<32767&num1>-32768){
            System.out.println("short");
        }
        else if(num1<2147483647&num1>-2147483647){
            System.out.println("integer");
        }
        else {
            System.out.println("Long");
        }
        while(num1!=0) {
            if (num1 % 2 == 0) {
                num1 /= 2;
                c += "0";
            } else {
                i=num1/2+num1%2;
                 num1 %= 2;
                num1-=i;
                c += "1";
            }
            if(num1==1){
                c+="1";
                num1-=num1;
                break;

            }

        }

        String reverse = new StringBuffer(c).reverse().toString();
        System.out.println(reverse);
        }



    }


