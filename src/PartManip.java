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
        int smsCount1 = getInput().nextInt();

        P1.getAverageJudgeScore();

        P1.setParticipantDetails(partNumber1, partFName1, smsCount1, jAlias1, jScore1);

        this.participant1 = P1;

        //Please initialize the remaining participants value

        //Participant Number 2:
        System.out.println("Enter part Number:");
        int partNumber2 = getInput().nextInt();

        System.out.println("Enter part Fname:");
        String partFName2 = getInput().nextLine();

        String[] jAlias2 = new String[5];
        double[] jScore2 = new double[5];

        for (int i = 0 ; i < jAlias1.length; i++){

            System.out.println("Enter Judge Alia:");
            jAlias2[i] = getInput().nextLine();

            System.out.println("Enter Juudge Score:");
            jScore2[i] = getInput().nextDouble();

        }

        System.out.println("Enter Sms Count");
        int smsCount2 = getInput().nextInt();

        P2.getAverageJudgeScore();

        P2.setParticipantDetails(partNumber2, partFName2, smsCount2, jAlias2, jScore2);

        this.participant2 = P2;

        //Participant Number 3:
        System.out.println("Enter part Number:");
        int partNumber3 = getInput().nextInt();

        System.out.println("Enter part Fname:");
        String partFName3 = getInput().nextLine();

        String[] jAlias3 = new String[5];
        double[] jScore3 = new double[5];

        for (int i = 0 ; i < jAlias1.length; i++){

            System.out.println("Enter Judge Alia:");
            jAlias3[i] = getInput().nextLine();

            System.out.println("Enter Juudge Score:");
            jScore3[i] = getInput().nextDouble();

        }

        System.out.println("Enter Sms Count");
        int smsCount3 = getInput().nextInt();

        P3.getAverageJudgeScore();

        P3.setParticipantDetails(partNumber3, partFName3, smsCount3, jAlias3, jScore3);

        this.participant3 = P3;


    }

    //Sorts the array elements for scores and Judge Alias
    public void sortArrayScores(PARTICIPANT[] P){

        int index = 1;

        while (index < P.length){
            double temp = P[index].getAverageJudgeScore();
            PARTICIPANT tempP = P[index];
            int shifter = index - 1;

            while (shifter >= 0 && P[shifter].getAverageJudgeScore() > temp){

                P[shifter + 1] = P[shifter];
                shifter--;

            }

            P[shifter + 1] = tempP;

            //The error was Fixed 😅😅😅😅😎
            index++;
        }

    }
    public double determineMaxAvgScor(PARTICIPANT[] P, int MXP){

        sortArrayScores(P);
        return P[P.length - 1].getAverageJudgeScore();

    }

    public void sortParticipantsByFirstName(PARTICIPANT [ ] P){

        //logic for sorting
        for(int i = 0; i < P.length-1; i++)
        {
            for (int j = i + 1; j < P.length; j++)
            {
                //compares each elements of the array to all the remaining elements

                if(P[i].getParticipantFirstName().compareTo(P[j].getParticipantFirstName()) > 0)
                {
                    //swapping array elements
                    PARTICIPANT temp = P[i];
                    P[i] = P[j];
                    P[j] = temp;

                }
            }
        }

    }




}
