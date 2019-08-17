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
    public void should_return_0_when_given_3C_8H_9D_7C_TH_and_3C_8D_9S_7D_TH(){
        Game game = new Game();
        String[] gamer1 = {"3C","8H","9D","7C","TH"};
        String[] gamer2 = {"3C","8D","9S","7D","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,0);
    }

    @Test
    public void should_return_2_when_given_3C_8H_9D_7C_TH_and_3C_3D_9S_7D_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","8H","9D","7C","TH"};
        String[] gamer2 = {"3C","3D","9S","7D","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,2);
    }

    @Test
    public void should_return_1_when_given_3C_8H_KD_KC_TH_and_3C_3D_9S_7D_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","8H","KD","KC","TH"};
        String[] gamer2 = {"3C","3D","9S","7D","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_1_when_given_3C_8H_KD_KC_QH_and_3C_8D_KS_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","8H","KD","KC","QH"};
        String[] gamer2 = {"3C","8D","KS","KD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_0_when_given_3C_8H_KD_KC_TH_and_3C_8D_KS_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","8H","KD","KC","TH"};
        String[] gamer2 = {"3C","8D","KS","KD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,0);
    }


    @Test
    public void should_return_1_when_given_3C_3H_KD_KC_TH_and_3C_8D_KS_QD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","3H","KD","KC","TH"};
        String[] gamer2 = {"3C","8D","KS","QD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_1_when_given_3C_3H_KD_KC_TH_and_3C_8D_KS_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","3H","KD","KC","TH"};
        String[] gamer2 = {"3C","8D","KS","KD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_2_when_given_3C_3H_KD_KC_TH_and_3C_3D_KS_KD_QH() {
        Game game = new Game();
        String[] gamer1 = {"3C","3H","KD","KC","TH"};
        String[] gamer2 = {"3C","3D","KS","KD","QH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,2);
    }

    @Test
    public void should_return_0_when_given_3C_3H_KD_KC_TH_and_3C_3D_KS_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","3H","KD","KC","TH"};
        String[] gamer2 = {"3C","3D","KS","KD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,0);
    }

    @Test
    public void should_return_1_when_given_3C_3H_3D_KC_TH_and_3C_3D_KS_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","3H","3D","KC","TH"};
        String[] gamer2 = {"3C","3D","KS","KD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_1_when_given_3C_3H_3D_KC_TH_and_3C_3D_QS_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","3H","3D","KC","TH"};
        String[] gamer2 = {"3C","3D","KS","KD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_2_when_given_5C_3H_7D_KC_TH_and_3C_3D_3S_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"5C","3H","7D","KC","TH"};
        String[] gamer2 = {"3C","3D","3S","KD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,2);
    }

    @Test
    public void should_return_1_when_given_3C_3H_3D_KC_QH_and_3C_3D_3S_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","3H","3D","KC","QH"};
        String[] gamer2 = {"3C","3D","3S","KD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_1_when_given_3C_4H_5D_6C_7H_and_3C_3D_3S_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","7H","4D","6C","5H"};
        String[] gamer2 = {"3C","3D","3S","KD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_1_when_given_3C_4H_5D_6C_7H_and_3C_3D_KS_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","7H","4D","6C","5H"};
        String[] gamer2 = {"3C","3D","KS","KD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_1_when_given_3C_4H_5D_6C_7H_and_3C_3D_QS_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","7H","4D","6C","5H"};
        String[] gamer2 = {"3C","3D","QS","KD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_1_when_given_3C_4H_5D_6C_7H_and_3C_2D_QS_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","7H","4D","6C","5H"};
        String[] gamer2 = {"3C","3D","QS","KD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_2_when_given_3C_4H_5D_6C_7H_and_9C_JD_QS_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","7H","4D","6C","5H"};
        String[] gamer2 = {"9C","JD","QS","KD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,2);
    }

    @Test
    public void should_return_1_when_given_3C_4H_5D_6C_7H_and_9C_JD_KS_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3C","7H","4D","6C","5H"};
        String[] gamer2 = {"9C","JD","KS","KD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_1_when_given_3H_2H_4H_9H_KH_and_9C_JD_QS_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3H","2H","4H","9H","KH"};
        String[] gamer2 = {"9C","JD","KS","QD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_1_when_given_3H_2H_4H_9H_KH_and_9C_QD_QS_TD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3H","2H","4H","9H","KH"};
        String[] gamer2 = {"9C","QD","QS","TD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_1_when_given_3H_2H_4H_9H_KH_and_9C_8D_QS_TD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3H","2H","4H","9H","KH"};
        String[] gamer2 = {"9C","8D","QS","TD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_1_when_given_3H_2H_4H_9H_KH_and_9C_8D_QS_KD_TH() {
        Game game = new Game();
        String[] gamer1 = {"3H","2H","4H","9H","KH"};
        String[] gamer2 = {"9C","8D","QS","TD","TH"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_1_when_given_3H_2H_4H_9H_KH_and_9H_8H_QH_KH_4H() {
        Game game = new Game();
        String[] gamer1 = {"3H","2H","4H","9H","KH"};
        String[] gamer2 = {"9H","8H","QH","TH","4H"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_2_when_given_3H_2H_4H_9H_KH_and_4H_8H_QH_KH_4H() {
        Game game = new Game();
        String[] gamer1 = {"3H","2H","4H","9H","KH"};
        String[] gamer2 = {"4H","8H","QH","TH","4H"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,2);
    }

    @Test
    public void should_return_1_when_given_3H_3H_9H_9H_KH_and_4H_8H_QH_KH_4H() {
        Game game = new Game();
        String[] gamer1 = {"3H","3H","9H","9H","KH"};
        String[] gamer2 = {"4H","8H","QH","TH","4H"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,1);
    }

    @Test
    public void should_return_2_when_given_3H_3H_9H_9H_KH_and_4H_4H_QH_KH_4H() {
        Game game = new Game();
        String[] gamer1 = {"3H","3H","9H","9H","KH"};
        String[] gamer2 = {"4H","4H","QH","TH","4H"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,2);
    }

    @Test
    public void should_return_0_when_given_3H_2H_4H_9H_KH_and_3D_2D_4D_9D_KD() {
        Game game = new Game();
        String[] gamer1 = {"3H","2H","4H","9H","KH"};
        String[] gamer2 = {"3D","2D","4D","9D","KD"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,0);
    }

    @Test
    public void should_return_2_when_given_3H_2H_4H_9H_KH_and_3D_3D_4D_9D_KD() {
        Game game = new Game();
        String[] gamer1 = {"3H","2H","4H","9H","KH"};
        String[] gamer2 = {"3D","3D","4D","9D","KD"};

        int result = game.startGame(gamer1,gamer2);

        assertEquals(result,2);
    }


}
