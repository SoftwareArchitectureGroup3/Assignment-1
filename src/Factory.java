public class Factory implements GroceryProductFactory {
    
    //The Factory class implements the GroceryProductFactory and overrides the methods present in the interface
    //The Factory class is responsible for creating the products i.e Apples and Banana

    @Override
    public Apple createApple(String type) {
        //The object creation depends on the input that user passes to the method
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
