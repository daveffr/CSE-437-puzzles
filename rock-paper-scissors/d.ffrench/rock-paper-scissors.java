import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class RockPaperScissors {

    static void Strategy(File file) {

    }

     public static void main(String[] args) {
    //     boolean player1 = true;
    //     int player1_score = 0;
    //     int player2_score = 0;

        try {
            File testing = new File("./rock-paper-scissors/d.ffrench/input.txt");
            Scanner readIn = new Scanner(testing);
            while(readIn.hasNextLine()){
                String data = readIn.nextLine();
                System.out.println(data);
            }
            readIn.close();
        }
        catch (FileNotFoundException e){
            System.out.println("error");
        }


        
    }
}
