import org.junit.Test;
import test.Game;

import static org.junit.Assert.assertEquals;

public class PokerTest {

    @Test
    public void should_return_2_when_given_3C_2C(){
        Game game = new Game();
        String[] gamer1 = {"3C"};
        String[] gamer2 = {"4D"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,2);
    }

    @Test
    public void should_return_1_when_given_3C_4H_8D_9C_TH_and_2C_8D_9S_7D_5H(){
        Game game = new Game();
        String[] gamer1 = {"3C","4H","8D","9C","TH"};
        String[] gamer2 = {"2C","8D","9S","7D","5H"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_2_when_given_3C_4H_8D_7C_TH_and_2C_8D_9S_7D_TH(){
        Game game = new Game();
        String[] gamer1 = {"3C","4H","8D","7C","TH"};
        String[] gamer2 = {"2C","8D","9S","7D","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,2);
    }

    @Test
    public void should_return_1_when_given_3C_8H_9D_7C_TH_and_2C_8D_9S_7D_TH(){
        Game game = new Game();
        String[] gamer1 = {"3C","8H","9D","7C","TH"};
        String[] gamer2 = {"2C","8D","9S","7D","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }
    @Test
    public void should_return_2_when_given_3C_8H_9D_7C_TH_and_3C_8D_9S_7D_TH(){
        Game game = new Game();
        String[] gamer1 = {"3C","8H","9D","7C","TH"};
        String[] gamer2 = {"3C","8D","9S","7D","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,0);
    }


}
