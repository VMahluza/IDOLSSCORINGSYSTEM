public class Main {

    public static void main(String[] args) {


        PARTICIPANT[] p = new PARTICIPANT[3];//Becuase we are dealing with 3 participants

        p[0] = new PARTICIPANT();
        //Initialize the p[1] and p[2]

        PartManip _METHODS = new PartManip();

        System.out.println( "====================\n" +
                            "IDOLS SCORING SYSTEM\n" +
                            "====================\n");

        _METHODS.enterParticipantDetails(p[0] , p[1] , p[2]);



    }


}
