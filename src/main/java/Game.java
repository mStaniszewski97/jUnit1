public class Game {

    private String gameTitle;
    private int gamePrice;
    private int counter;
    private int priceForAll;

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public int getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getPriceForAll(){
        return priceForAll;
    }

    public Game(){
        setCounter(0);
        setGamePrice(0);
        setGameTitle("");
        priceForAll = 0;
    }

    public Game(String gameTitle, int gameNumber , int gamePrice){
        if(gamePrice < 0){
            throw new IllegalArgumentException("Game price is smaller than 0");
        }
        if(gameNumber <= 0){
            throw new IllegalArgumentException("Game number is smaller than 0 or equals");
        }
        this.gameTitle = gameTitle;
        this.counter = gameNumber;
        this.gamePrice = gamePrice;
        priceForAll = gamePrice * gameNumber;
    }
    public String getPrice(){
        return "Price for one game: " + getGamePrice() +"$";
    }

    public void addGame(int howMuch){
        setCounter(getCounter() + howMuch);
    }

    public void removeGame(int howMuch){
        if(howMuch<=getCounter()){
            setCounter(getCounter() - howMuch);
        }
        else{
            throw new IllegalArgumentException("We dont have some many games");
        }
    }
    public void showGame(){
        System.out.println("Title: " +gameTitle + "\nPrice for one: " + gamePrice + "\nCounter: " + counter);
    }
    public boolean isTheSame(Game obj){
        if(obj.getGameTitle().equals(gameTitle) && obj.getClass().getName().equals(this.getClass().getName())){
            return true;
        }
        else{
            return false;
        }
    }
}
