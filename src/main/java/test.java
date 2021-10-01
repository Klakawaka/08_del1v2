import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Dices die1, die2;
        die1 = new Dices();
        die2 = new Dices();
        int x = 0;
        int t = 0;
        while (x <= 1000) {
            x = x+1;
            int die1Facevalue = die1.roll();
            int die2Facevalue = die2.roll();
            System.out.println("Die One: " + die1 + ", Die Two: " + die2);

            if ( die1Facevalue == die2Facevalue){
                t = t+1;

            }
        }
        System.out.println(" der er så mange kast med samme værdi: " +t);



    }
}

