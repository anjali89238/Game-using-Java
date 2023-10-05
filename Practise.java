import java.util.Scanner;
import java.util.Random;
class Practise{
        public static void main(String args[]){
                   //Rock=0
                   //Paper=1
                   //Scissors=2
           Scanner sc=new Scanner(System.in);
           System.out.println("Welcome to our Game :) ");
           System.out.println("Enter 0 for Rock ,1 for Paper and 2 for Scissors ");
           //User input
           System.out.println("Enter your choice: ");
           int userchoice=sc.nextInt();

           Random computerinput= new Random();

           //Computer input
           int computerchoice= computerinput.nextInt(3);

           //COMPUTER CHOICE
           if(computerchoice==0){
              System.out.println("computer choose Rock.");
            }
            else if(computerchoice==1){
              System.out.println("computer choose Paper .");
            }
            else if(computerchoice==2){
              System.out.println("computer choose Scissors .");
            }


           if(userchoice==computerchoice){
            System.out.println("Game Draw :|");
           }
           else if((userchoice==0 && computerchoice==2)||(userchoice==2 && computerchoice==1)||(userchoice==1 && computerchoice==0)){
              System.out.println("Congratulations! you win :)");            
           }
           else{
            System.out.println("Computer win :|\n Better Luck next time :) ");
           }
            

}}