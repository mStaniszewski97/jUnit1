
public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop("StanikovGames", 2000);
        Game FarCry5PC = new PC("Far Cry 5", 3, 160);
        Game FarCry5PS4 = new PS("Far Cry 5", 5, 200, "4");
        shop.addGame(FarCry5PC);
        shop.deliveryGames(FarCry5PC, 2);
        shop.addGame(FarCry5PS4);
        System.out.println(shop.getShopMoney());
        shop.showGamesInShop();

        shop.sellGame(FarCry5PC, 5);
        shop.showGamesInShop();
        System.out.println(shop.getShopMoney());
    }
}
