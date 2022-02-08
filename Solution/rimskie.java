package Solution;

import java.util.ArrayList;
import java.util.Arrays;

public class rimskie {
    static String[] stringArray = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX","X"};
    ArrayList<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
    StringBuilder builder = new StringBuilder();

    public boolean check(String a) {
        return stringList.contains(a);
    }

    public int transform(String a) {
        if (a.equals("I")) {
            return 1;
        } else if (a.equals("II")) {
            return 2;
        } else if (a.equals("III")) {
            return 3;
        } else if (a.equals("IV")) {
            return 4;
        } else if (a.equals("V")) {
            return 5;
        } else if (a.equals("VI")) {
            return 6;
        } else if (a.equals("VII")) {
            return 7;
        } else if (a.equals("VIII")) {
            return 8;
        } else if (a.equals("IX")) {
            return 9;
        } else if (a.equals("X")){
            return 10;
        } else return 0;
    }

    public String transformRevers(int a){
        String answer="";
        if (a<=0){
            System.out.println("Ответ равен нулю или отрицательное число");
            System.exit(1);
        }

        if (a>0 && a<=10) {
             if (a == 1) {
                return "I";
            } else if (a == 2) {
                return "II";
            } else if (a == 3) {
                return "III";
            } else if (a == 4) {
                return "IV";
            } else if (a == 5) {
                return "V";
            } else if (a == 6) {
                return "VI";
            } else if (a == 7) {
                return "VII";
            } else if (a == 8) {
                return "VIII";
            } else if (a == 9) {
                return "IV";
            } else if (a==10) {
                 return "X";
             }
        }
            if (a == 100) {
                return "C";
            }



        String answer1 = Integer.toString(a);
        StringBuilder builder = new StringBuilder(answer);
        if(a>9 && a<20){
            builder.append("X");
         }else if(a>19 && a<30){
            builder.append("XX");
         }else if(a>29 && a<40){
            builder.append("XXX");
          }else if(a>39 && a<50){
            builder.append("XL");
         }else if(a>49 && a<60){
            builder.append("L");
         }else if(a>59 && a<70){
            builder.append("LX");
         }else if(a>69 && a<80){
            builder.append("LXX");
         }else if(a>79 && a<90) {
            builder.append("LXXX");
         }else if(a>89 && a<100){
            builder.append("XC");
        }

        if (answer1.charAt(1)==0){
            return answer;
        }else if (answer1.charAt(1)=='1'){
            builder.append("I");
        }else if (answer1.charAt(1)=='2'){
            builder.append("II");
        }else if (answer1.charAt(1)=='3'){
            builder.append("III");
        }else if (answer1.charAt(1)=='4'){
            builder.append("IV");
        }else if (answer1.charAt(1)=='5'){
            builder.append("V");
        }else if (answer1.charAt(1)=='6'){
            builder.append("VI");
        }else if (answer1.charAt(1)=='7'){
            builder.append("VII");
        }else if (answer1.charAt(1)=='8'){
            builder.append("VIII");
        }else if (answer1.charAt(1)=='9'){
            builder.append("IX");
        }
        String result = builder.toString();
        return result;
    }
}