public interface GroceryProductFactory {
    //This abstract factory consists of other factories 
    Apple createApple(String type);
    Banana createBanana(String type);
}
