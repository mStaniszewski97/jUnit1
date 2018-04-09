public class XBOX extends Game {
    private String platform = "XBOX ";

    public String getPlatform() {
        return platform;
    }
    public XBOX(){
        super();
    }
    public XBOX(String gameTitle, int gameNumber , int gamePrice , String generation){
        super(gameTitle, gameNumber , gamePrice);
        platform += generation;
    }

    public void showGame(){
        System.out.println("Title: " + getGameTitle() + "\nPrice for one: " + getGamePrice() + "\nPlatform: " + platform + "\nCounter: " + getCounter());
    }
}
