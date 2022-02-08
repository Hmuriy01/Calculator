package Solution;


import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {


        public static void main(String[] args) {

            int x1=0;
            int x2=0;
            int answer=0;
            char action;
            arabskie arabskie = new arabskie();
            rimskie rimskie = new rimskie();
            String firstPart;
            String secondPart;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();



            int index=0;
            if (input.contains("+")){
                index = input.indexOf("+");
                }
            if (input.contains("-")){
                index = input.indexOf("-");
            }
            if (input.contains("*")){
                index = input.indexOf("*");
            }
            if (input.contains("/")){
                index = input.indexOf("/");
            }

            firstPart = input.substring(0, index);
            action = input.charAt(index);
            secondPart = input.substring(index+1, input.length());


            boolean isRimskie = false;

            if (arabskie.check(firstPart) && arabskie.check(secondPart)) {
                 x1 = Integer.parseInt(firstPart);
                 x2 = Integer.parseInt(secondPart);
            } else if (rimskie.check(firstPart) && rimskie.check(secondPart)){
                 x1 = rimskie.transform(firstPart);
                 x2 = rimskie.transform(secondPart);
                 isRimskie = true;

            } else {
                System.out.println("Введен неверный формат данных");
                System.exit(1);
            }

            if (action=='+'){
                answer = x1+x2;
            } else if (action =='-'){
                answer = x1-x2;
            } else if (action =='/'){
                answer = x1/x2;
            } else if (action =='*'){
                answer = x1*x2;
            }

            if (isRimskie){ System.out.println(rimskie.transformRevers(answer));

            } else System.out.println(answer);
        }
        }
