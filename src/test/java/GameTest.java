import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class GameTest {
    private static Game testObj;

    @BeforeAll
    static void setUp(){
        testObj = new Game("GTA",20,200);
    }

    @Test
    @DisplayName("Testing game constructor with bad game price")
    void shouldChceckGamePrice(){
        try{
            new Game("test game", 20, -200 );
            fail("Exception wasn't thrown!");
        }
        catch (IllegalArgumentException exception){
            assertEquals("Game price is smaller than 0", exception.getMessage());
        }
    }

    @Test
    @DisplayName("Testing game constructor with bad game number")
    void shouldCheckGameNumber(){
        try{
            new Game("test game", -10, 100 );
            fail("Exception wasn't thrown!");
        }
        catch (IllegalArgumentException exception){
            assertEquals("Game number is smaller than 0 or equals", exception.getMessage());
        }
    }

    @Test
    @DisplayName("Testing game price method")
    void checkGamePriceMethod() {
        assertEquals("Price for one game: 200$", testObj.getPrice());
    }

    @Test
    @DisplayName("Testing adding games method")
    void checkAddingGamesToActualCounter(){
        testObj.addGame(50);
        assertEquals(70, testObj.getCounter());
    }

    @Test
    @DisplayName("Testing removing game method")
    void checkRemovingGamesToActualCounter(){
        try{
            testObj.removeGame(50);
            assertEquals(20, testObj.getCounter());
        }
        catch (IllegalArgumentException exception){
            assertEquals("We dont have some many games", exception.getMessage());
        }
    }
}