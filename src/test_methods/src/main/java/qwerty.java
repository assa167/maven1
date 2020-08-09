import java.sql.SQLOutput;

public class qwerty {
    public static void main(String[] args) {


//        for (char i = 97; i <= 121; i++) {
//            //int f = i;
//            System.out.print(i);
//        }

        //пример бесконечного цикла
        //1
        while (true) {
            System.out.println("Hioiiiiii");
        }
        //2
        for (; ; ) {
        }
        ;

        int a = 5;
        int b = 8;
        int minVal = (a < b) ? a : b;
        int absValue = (a < 0) ? -a : a;
        System.out.println("Min va = " + minVal);

        for(int i =0; i<=10; i++){
            if (i%3 == 0) {
                continue;
                break;
            }
            System.out.println(i);
        }
    }
