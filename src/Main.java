import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Soda[]> vendingMachine = new HashMap<>();

        HashMap<String, Soda[]> newVendingMachineWithArizonaTea = addArizonaTea(vendingMachine);
        HashMap<String, Soda[]> newVendingMachineWithCocaCola = addCocaCola(newVendingMachineWithArizonaTea);
        HashMap<String, Soda[]> newVendingMachineWithDasani = addDasaniWater(newVendingMachineWithCocaCola);
        HashMap<String, Soda[]> newVendingMachineWithAllSodas = addMonster(newVendingMachineWithDasani);



        for (Map.Entry<String, Soda[]> row : newVendingMachineWithAllSodas.entrySet()) {
            for (Soda soda : row.getValue()) {
                System.out.println("Type: " + soda.name + " - size: " + soda.size + " - price: $" + soda.price + "\n");
            }
        }
    }

    public static HashMap<String, Soda[]> addCocaCola(HashMap<String, Soda[]> vendingMachine){

        HashMap<String, Soda[]> newVendingMachine = new HashMap<>();
        newVendingMachine.putAll(vendingMachine);

        String labelCocaCola = "Coca Cola";

        Soda cocaCola1 = new Soda("Cherry Coca Cola", 12, 1.99);
        Soda cocaCola2 = new Soda("Coke Zero", 12, 1.99);
        Soda cocaCola3 = new Soda("Coca Cola Original", 16, 2.75);

        Soda[] cocaColaRow = {cocaCola1, cocaCola2, cocaCola3};

        newVendingMachine.put(labelCocaCola, cocaColaRow);

        return newVendingMachine;
    }

    public static HashMap<String, Soda[]> addArizonaTea(HashMap<String, Soda[]> vendingMachine){

        HashMap<String, Soda[]> newVendingMachine = new HashMap<>();
        newVendingMachine.putAll(vendingMachine);

        String labelArizonaTea = "Arizona Ice Tea";

        Soda arizonaTea1 = new Soda("Arizone Lemon Tea", 10, 0.99);
        Soda arizonaTea2 = new Soda("Arizona Peach Ice Tea", 10, 0.99);
        Soda arizonaTea3 = new Soda("Arizona Mango", 15, 1.25);
        Soda arizonaTea4 = new Soda("Arizona Fruit Punch", 15, 1.25);

        Soda[] arizonaTeaRow = {arizonaTea1, arizonaTea2, arizonaTea3, arizonaTea4};

        newVendingMachine.put(labelArizonaTea, arizonaTeaRow);

        return newVendingMachine;
    }

    public static HashMap<String, Soda[]> addDasaniWater(HashMap<String, Soda[]> vendingMachine){

        HashMap<String, Soda[]> newVendingMachine = new HashMap<>();
        newVendingMachine.putAll(vendingMachine);

        String labelWater = "Dasani Water";

        Soda dasaniWater1 = new Soda("Dasani Carbonated Water", 12, 1.50);
        Soda dasaniWater2 = new Soda("Natural Dasani Water", 16, 1.99);
        Soda dasaniWater3 = new Soda();

        Soda[] dasaniWaterRow = {dasaniWater1, dasaniWater2, dasaniWater3};

        newVendingMachine.put(labelWater, dasaniWaterRow);

        return newVendingMachine;
    }

    public static HashMap<String, Soda[]> addMonster(HashMap<String, Soda[]> vendingMachine){

        HashMap<String, Soda[]> newVendingMachine = new HashMap<>();
        newVendingMachine.putAll(vendingMachine);

        String labelMonster = "Monster Energy Drink";

        Soda monsterDrink1 = new Soda("Monster Original", 16, 3.50);
        Soda monsterDrink2 = new Soda("Monster Coconut", 16, 3.50);
        Soda monsterDrink3 = new Soda("Monster Citrus", 22, 4.50);


        Soda[] monsterDrinkRow = {monsterDrink1, monsterDrink2, monsterDrink3};

        newVendingMachine.put(labelMonster, monsterDrinkRow);

        return newVendingMachine;
    }

}
