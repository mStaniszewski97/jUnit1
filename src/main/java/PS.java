public class PS extends Game {
    private String platform = "PS ";

    public String getPlatform() {
        return platform;
    }
    public PS(){
        super();
    }
    public PS(String gameTitle, int gameNumber , int gamePrice , String generation){
        super(gameTitle, gameNumber , gamePrice);
        platform += generation;
    }

    public void showGame(){
        System.out.println("Title: " + getGameTitle() + "\nPrice for one: " + getGamePrice() + "\nPlatform: " + platform + "\nCounter: " + getCounter());
    }
}
