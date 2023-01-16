// Online Java Compiler
// Use this editor to write, compile and run your Java code online

interface Food {
    boolean isExpired();
}

interface FoodFactory {
    Food createFood();
}

class Burger implements Food {
    
    @Override
    public boolean isExpired() {
        return false;
    }
}

class BurgerFoodFactory implements FoodFactory {
    
    @Override
    public Burger createFood() {
        return new Burger();
    }
}

class Main {
    public static void main(String[] args) {
        BurgerFoodFactory burgerFactory = new BurgerFoodFactory();
        Food burger = burgerFactory.createFood();
        System.out.println("Is Expired: " + burger.isExpired());
    }
}
