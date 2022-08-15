import java.util.Scanner;

public class PartManip {

   private PARTICIPANT participant1;
   private PARTICIPANT participant2;
   private PARTICIPANT participant3;

    PartManip(){

        this.participant1 = new PARTICIPANT();
        this.participant2 = new PARTICIPANT();
        this.participant3 = new PARTICIPANT();

    }



    //Static share the getInput() in to every object
    static public Scanner getInput(){

        return new Scanner(System.in);

    }
    public void enterParticipantDetails(PARTICIPANT P1, PARTICIPANT P2, PARTICIPANT P3){

        //Participant Number 1:
        System.out.println("Enter part Number:");
         int partNumber1 = getInput().nextInt();

        System.out.println("Enter part Fname:");
        String partFName1 = getInput().nextLine();

        String[] jAlias1 = new String[5];
        double[] jScore1 = new double[5];

        for (int i = 0 ; i < jAlias1.length; i++){

            System.out.println("Enter Judge Alia:");
            jAlias1[i] = getInput().nextLine();

            System.out.println("Enter Juudge Score:");
            jScore1[i] = getInput().nextDouble();

        }

        System.out.println("Enter Sms Count");
        int smsCount = getInput().nextInt();

        P1.getAverageJudgeScore();

        P1.setParticipantDetails(partNumber1, partFName1, smsCount, jAlias1, jScore1);

        this.participant1 = P1;

        //Please initialize the remaining participants value






    }



}
