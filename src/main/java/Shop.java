import java.util.HashSet;
import java.util.Set;

public class Shop {
    private String shopName;
    private int shopMoney;
    private Set<Game> gameList = new HashSet<Game>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getShopMoney() {
        return shopMoney;
    }

    public void setShopMoney(int shopMoney) {
        this.shopMoney = shopMoney;
    }

    public Shop(){
        shopMoney = 0;
        shopName = "";
    }
    public Shop(String shopName, int shopMoney){
        this.shopName = shopName;
        this.shopMoney = shopMoney;
    }
    public void addGame(Game game){
        for(Game g : gameList)
        {
            if(g.isTheSame(game)){
                System.out.println("This game is already in shop");
                return;
            }
        }
        if(shopMoney>=game.getPriceForAll()){
            gameList.add(game);
            shopMoney = shopMoney - game.getPriceForAll();
        }
        else{
            System.out.println("Not enough money :/");
        }
    }
    public void removeGame(Game game){
        gameList.remove(game);
    }
    public void sellGame(Game game, int howMuch){
        for(Game g : gameList)
        {
            if(g.equals(game) && g.getCounter()>=howMuch){
                g.setCounter(g.getCounter()-howMuch);
                shopMoney += g.getGamePrice()*howMuch;
            }
        }
    }
    public void deliveryGames(Game game, int howMuch){
        for(Game g : gameList)
        {
            if(g.equals(game) && shopMoney>=g.getGamePrice()*howMuch){
                g.addGame(howMuch);
                shopMoney -= g.getGamePrice()*howMuch;
            }
        }
    }
    public Game getGame(Game game){
        for(Game g : gameList)
        {
            if(g.equals(game)){
                return  g;
            }
        }
        return null;
    }
    public void showGamesInShop(){
        for(Game g : gameList)
        {
            g.showGame();
            System.out.println();
        }
    }
}
