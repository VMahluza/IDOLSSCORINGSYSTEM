import java.util.Arrays;

public class PARTICIPANT {

    //Encapsulated data memebers
    //exist within this class only

    private int partNumber;//This data member stores the first name of a participant.
    private String partFName;
    private int smsCount;
    private String[] jAlias;
    private double[] jScore;
    private double avgJscore;

    //Unencapsulated data members programiz.com

    //accessModifier returnType nameOfmethod(para, para)
    public PARTICIPANT() {

        this.partNumber = 0;
        this.partFName = null;
        this.smsCount = 0;

        //PARALLEL
        this.jAlias = new String[5];
        this.jScore = new double[5];

        //gOOD  BAD
        // 0.2  0.9


        int index = 0;
        while (index < jAlias.length) {

            this.jAlias[index] = null;
            this.jScore[index] = 0.0;

            index++;

        }
        this.avgJscore = 0;

    }

    public void setParticipantDetails(int partNumber, String partFName, int smsCount, String[] jAlias, double[] jScore){

        this.partNumber = partNumber;
        this.partFName = partFName;
        this.smsCount = smsCount;

        int index = 0;//Starting from element 1

        double sum = 0;
        int L = this.jScore.length;

        while (index < jAlias.length) {

            this.jAlias[index] = jAlias[index];
            this.jScore[index] = jScore[index];

            index++;

            sum = sum + this.jScore[index];//Option 2

        }

        sum = this.jScore[0] + this.jScore[1] + this.jScore[2] + this.jScore[3] + this.jScore[4];//Option 1

        this.avgJscore = sum / L;



    }

    public double determineMinScore(){

        //Task: Find a sorting algo

        return this.jScore[0];

    }

    public void display(){

        //Task: implement the display Method
        /**
         * Participant Name: Precious Maseko
         * Participant Number: 26145
         * Average Score: 5.62
         * SMS Count: 420
         * */

    }

    public String getParticipantFirstName(){

        return  this.partFName;

    }

    /**public double getAverageJudgeScore()
     * This get method returns the value of data
     member participantSurname.


     public Int getSmsCount()
     This get member method returns the value of
     data member smsCount.
     */

}
