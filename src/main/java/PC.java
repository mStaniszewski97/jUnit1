public class PC extends Game{
    private final String platform = "PC";

    public String getPlatform() {
        return platform;
    }
    public PC(){
        super();
    }
    public PC(String gameTitle, int gameNumber , int gamePrice){
        super(gameTitle, gameNumber , gamePrice);
    }

    public void showGame(){
        System.out.println("Title: " + getGameTitle() + "\nPrice for one: " + getGamePrice() + "\nPlatform: " + platform + "\nCounter: " + getCounter());
    }
}
