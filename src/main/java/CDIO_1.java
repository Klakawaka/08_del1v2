import java.util.Scanner;
import gui_main.GUI;
public class CDIO_1 {
    public static void main(String[] args) {
        GUI gui = new GUI();
        Scanner scan = new Scanner(System.in);
        Dices p1die1, p1die2;
        int p1sum;
        int p2sum;
        int totalsum1 = 0;
        int totalsum2 = 0;
        p1die1 = new Dices();
        p1die2 = new Dices();


        String player1;
        String player2;
        int choice;
        System.out.println("Wellcome to CDIO game part 1 :)"); // Menu
        System.out.println("Press 1) to start the game");
        System.out.println("Press 2) to exit the game");
        choice = scan.nextInt();
        if (choice == 1){
            scan.nextLine();
            System.out.println("Enter the name for player 1"); // choice = 1: creating the players
            player1 = scan.nextLine();
            System.out.println("Player 1 = " + player1);
            System.out.println("Enter the name for player 2");
            player2 = scan.nextLine();
            System.out.println("Player 2 = " + player2);
            while(true){ // while loop and the game starts :)
                int die1Facevalue = p1die1.roll();
                int die2Facevalue = p1die2.roll();
            System.out.println(player1 + "  Please press enter to roll the dices"); // player 1 turn
            scan.nextLine();
            p1die1.roll();
            p1die2.roll();
            //p1sum = p1die1.getFaceValue() + p1die2.getFaceValue();
            int p1sum1 = die1Facevalue + die2Facevalue;
            System.out.println(player1 + "  Got " + die1Facevalue + " and " + die2Facevalue +" which gave " + p1sum1);
            gui.setDice(die1Facevalue,die2Facevalue);
            totalsum1 = totalsum1 + p1sum1;
            System.out.println(player1 + " totalsum " + totalsum1);
             if (die1Facevalue == 6 && die2Facevalue == 6){
                    System.out.println(player1 + " WON!");
                    break;
                }
             else if (die1Facevalue == 1 && die2Facevalue == 1){
                 totalsum1 = 0;
             }



            else if (die1Facevalue == die2Facevalue) { // player 1 extra turn
                 if (totalsum1 >= 40){ //  Player1 after 40 points
                     System.out.println(player1 + " WON!");
                     break;
                      }
                 else{
                     die1Facevalue = p1die1.roll();
                     die2Facevalue = p1die2.roll();
                System.out.println(player1 + "  Please press enter to roll the dices");
                scan.nextLine();
                p1die1.roll();
                p1die2.roll();
                //p1sum = p1die1.getFaceValue() + p1die2.getFaceValue();
                System.out.println(player1 + "  Got " + die1Facevalue + " and " + die2Facevalue +" which gave " + p1sum1);
                     gui.setDice(die1Facevalue,die2Facevalue);
                 totalsum1 = totalsum1 + p1sum1;
                 System.out.println(player1 + " totalsum " + totalsum1);
                    }}



            else{ // player 2 turn
                die1Facevalue = p1die1.roll();
                die2Facevalue = p1die2.roll();
                System.out.println( player2 + "  Please press enter to roll the dices");
                scan.nextLine();
                 p1die1.roll();
                 p1die2.roll();
                //p2sum = p1die1.getFaceValue() + p1die2.getFaceValue();
                int p2sum1 = die1Facevalue + die2Facevalue;
                System.out.println(player2 + "  Got " + die1Facevalue + " and " + die2Facevalue +" which gave " + p2sum1);
                 gui.setDice(die1Facevalue,die2Facevalue);
                 totalsum2 = totalsum2 + p2sum1;
                 System.out.println(player2 + " totalsum " + totalsum2);
            }
            if (die1Facevalue == 6 && die2Facevalue == 6){
                    System.out.println(player2 + " WON!");
                    break;
                }
            else if (die1Facevalue == 1 && die2Facevalue == 1){
                    totalsum2 = 0;
                }

            else if (die1Facevalue == die2Facevalue){// player 2 extra turn
                        if (totalsum2 >= 40){ //  Player1 after 40 points
                            System.out.println(player2 + " WON!");
                            break;
                        }
                        else{
                            die1Facevalue = p1die1.roll();
                            die2Facevalue = p1die2.roll();
                        System.out.println(player2 + "  Please press enter to roll the dices");
                        scan.nextLine();
                        p1die1.roll();
                        p1die2.roll();
                        //p2sum = p1die1.getFaceValue() + p1die2.getFaceValue();
                            int p2sum1 = die1Facevalue + die2Facevalue;
                        System.out.println(player2 + "  Got " + die1Facevalue + " and " + die2Facevalue +" which gave " + p2sum1);
                            gui.setDice(die1Facevalue,die2Facevalue);
                        totalsum2 = totalsum2 + p2sum1;
                        System.out.println(player2 + " totalsum " + totalsum2);
                         }
            }






            }
        }
        if (choice == 2){
            System.out.println("GOODBYE :)");

        }




    }
}


//p1die1.getFaceValue()