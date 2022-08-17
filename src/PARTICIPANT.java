import java.util.Arrays;

public class PARTICIPANT {

    //====PART ONE=============================================================

    //Encapsulated data memebers
    //exist within this class only, to access them we need the getters and the setters
    private int partNumber;//This data member stores the first name of a participant.
    private String partFName;
    private int smsCount;
    private String[] jAlias;
    private double[] jScore;
    private double avgJscore;

    //Unencapsulated data members programiz.com

    //====PART TWO=============================================================

    public PARTICIPANT() {

        //The constructor here is used to initialize the data members from part One
        //numeric default values are 0 and Object default values such as Strings are null
        this.partNumber = 0;
        this.partFName = null;
        this.smsCount = 0;

        //PARALLEL
        this.jAlias = new String[5];
        this.jScore = new double[5];

        int index = 0;
        while (index < jAlias.length) {

            this.jAlias[index] = null;
            this.jScore[index] = 0.0;

            index++;

        }
        this.avgJscore = 0;

    }

    ////====PART THREE=============================================================
    //Receiving parameters from externals classes PartManip and Main and storing them in the members from part One
    public void setParticipantDetails(int partNumber, String partFName, int smsCount, String[] jAlias, double[] jScore){

        //!!!!!!There are many options to calculate the avarage Score, if you decide to remove the comments Consult first

        this.partNumber = partNumber;
        this.partFName = partFName;
        this.smsCount = smsCount;

        int index = 0;//Starting from element 1

//        double sum = 0;
//        int L = this.jScore.length;

        while (index < jAlias.length) {

            this.jAlias[index] = jAlias[index];
            this.jScore[index] = jScore[index];
            index++;
            //sum = sum + this.jScore[index];//Option 2
        }

       //sum = this.jScore[0] + this.jScore[1] + this.jScore[2] + this.jScore[3] + this.jScore[4];//Option 1

        //this.avgJscore = sum / L;

        getAverageJudgeScore();// comment thiss method call if you have ouut commented the above code forr calculating avg


    }
    public double determineMinScore(){

        //Task: Find a sorting algo

        for (int i = 1; i < this.jScore.length ; i ++){

            double JscoreTemp = this.jScore[i];
            String JAliasTemp = this.jAlias[i];
            int j = i - 1;

            // Move elements of arr[0..i-1],
            // that are greater than key, to one
            // position ahead of their
            // current position
            while (j >= 0 && this.jScore[j] > JscoreTemp)
            {
                this.jScore[j + 1] = this.jScore[j];
                this.jAlias[j + 1] = this.jAlias[j];
                j = j - 1;
            }
            this.jScore[j + 1] = JscoreTemp;
            this.jAlias[j + 1] = JAliasTemp;


        }

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

        System.out.println("Participant Name: " + this.partFName);//
        System.out.println("Participant Number: " + this.partNumber);//
        System.out.println("Average Score: " + this.avgJscore);
        System.out.println("SMS Count: " + this.smsCount);

    }
    //Example
    public String getParticipantFirstName(){

        return  this.partFName;

    }

    /**public double getAverageJudgeScore()
     * This get method returns the value of data
     member participantSurname.*/
    public double getAverageJudgeScore(){

        //Calculating the avg withing the get method Opt. 3
        double Total = this.jScore[0] + this.jScore[1] + this.jScore[2] + this.jScore[3] + this.jScore[4];//Option 1

        int L = this.jScore.length; //Stores the length of an array

        this.avgJscore = Total / L;

        return this.avgJscore;

    }

     /**
     public Int getSmsCount()
     This get member method returns the value of
     data member smsCount.
     */
     public int getSmsCount(){

         return this.smsCount;

     }

     public String getMinJudgeAlias(){

         return this.jAlias[0];

     }

}
