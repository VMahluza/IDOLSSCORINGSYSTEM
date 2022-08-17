import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Initializing the array size
        PARTICIPANT[] p = new PARTICIPANT[3];//Becuase we are dealing with 3 participants

        p[0] = new PARTICIPANT();
        p[1] = new PARTICIPANT();
        p[2] = new PARTICIPANT();

        PartManip _METHODS = new PartManip();

        System.out.println( "====================\n" +
                            "IDOLS SCORING SYSTEM\n" +
                            "====================\n");

        _METHODS.enterParticipantDetails(p[0] , p[1] , p[2]);

        System.out.println("Participants entered\n" +
                            "--------------------\n");

        p[0].display();

        System.out.println();

        p[1].display();

        System.out.println();

        p[2].display();

        System.out.println("\n\n");

        System.out.println("Participants sorted by first name\n" +
                            "---------------------------------");
        _METHODS.sortParticipantsByFirstName(p);

        p[0].display();

        System.out.println();

        p[1].display();

        System.out.println();

        p[2].display();


        System.out.println("Participant with highest average score\n" +
                            "--------------------------------------");


        _METHODS.sortArrayScores(p);

        System.out.println();

        p[2].display();


        System.out.println("Minimum score received was: " + p[2].determineMinScore());
        System.out.println("This minimum score was allocated by judge:" + p[2].getMinJudgeAlias());

        System.out.println("\n");



    }


}
