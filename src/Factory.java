public class Factory implements GroceryProductFactory {

    @Override
    public Apple createApple(String type) {
        if (type.equals("1")) {
            return new Apple_1();
        }
        else {
            return new Apple_2();
        }
    }

    @Override
    public Banana createBanana(String type) {
        if(type.equals("1")){
            return new Banana_1();
        }
        else {
            return new Banana_2();
        }
    }
}
