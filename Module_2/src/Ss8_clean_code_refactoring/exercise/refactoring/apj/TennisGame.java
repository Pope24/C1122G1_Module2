package Ss8_clean_code_refactoring.exercise.refactoring.apj;

public class TennisGame {

    public static String getScore(String nameOfFirstPlayer, String nameOfSecondPlayer, int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        String finalResult = "";
        int tempScore=0;
        if (scoreOfFirstPlayer == scoreOfSecondPlayer)
        {
            switch (scoreOfFirstPlayer)
            {
                case 0:
                    finalResult = "Love-All";
                    break;
                case 1:
                    finalResult = "Fifteen-All";
                    break;
                case 2:
                    finalResult = "Thirty-All";
                    break;
                case 3:
                    finalResult = "Forty-All";
                    break;
                default:
                    finalResult = "Deuce";
                    break;

            }
        }
        else if (scoreOfFirstPlayer >=4 || scoreOfSecondPlayer >=4)
        {
            int minusResult = scoreOfFirstPlayer - scoreOfSecondPlayer;
            if (minusResult==1) finalResult ="Advantage player1";
            else if (minusResult ==-1) finalResult ="Advantage player2";
            else if (minusResult>=2) finalResult = "Win for player1";
            else finalResult ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = scoreOfFirstPlayer;
                else { finalResult +="-"; tempScore = scoreOfSecondPlayer;}
                switch(tempScore)
                {
                    case 0:
                        finalResult +="Love";
                        break;
                    case 1:
                        finalResult +="Fifteen";
                        break;
                    case 2:
                        finalResult +="Thirty";
                        break;
                    case 3:
                        finalResult +="Forty";
                        break;
                }
            }
        }
        return finalResult;
    }
}