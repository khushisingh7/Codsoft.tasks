import java.util.Scanner;

public class NumberGame {

    public static void gusseingNumberGame()
    {
        //scanner class
        Scanner sc = new Scanner(System.in);

        //generate the number
        int number = 1+(int)(100 * Math.random());

        //given X trials
        int X = 5;

        int i, guess;

        System.out.println(
            "A number is choosen"
            + "between 1 to 100. "
            + "Guess the number"
            + "within 5 trials. ");

            //iterate over X trials
            for (i = 0; i<X; i++) {

                System.out.println("Guess the number:");

                //take input for guessing 
                guess = sc.nextInt();

                //if the number is guessed 
                if (number == guess){
                    System.out.println("Congratulations!" + "You guessed the number.");
                    break;
                }
                else if (number > guess && i != X-1)
                {
                    System.out.println("The number is " +"greater than " + guess);
                }
                else if (number < guess && i != X-1)
                {
                    System.out.println("The number is " + "less than " + guess);
                }
            }
            
            if (i == X )
            {
                System.out.println("You have exhausted" + "X trials.");

                System.out.println("the number was" + number);
            }
    }

    //driver class
    public static void main(String[] args) {
          
        //function class
        gusseingNumberGame();
    }
}