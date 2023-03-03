package HW.hw1;

import HW.hw1.product.Drink;
import HW.hw1.product.HotDrink;
import HW.hw1.product.Product;
import HW.hw1.vendingMachine.DrinkVendingMachine;
import HW.hw1.vendingMachine.HotDrinkVendingMachine;
import HW.hw1.vendingMachine.VendingMachine;

public class Main {
    /*
     * Создать наследника реализованного класса HotDrink с дополнительным полем int
     * температура
     * Создать класс HotDrinkVendingMachine наследника VendingMachine и реализовать
     * перегруженный метод getProduct(String name, double volume, double
     * temperature), выдающий продукт соответствующего имени, объема и температуры.
     * Используйте при итерации конструкцию if (product instance of HotDrink){
     * HotDrink ht = (HotDrink) product; }
     * В main проинициализировать несколько экземпляров HotDrink и один
     * HotDrinkVendingMachine и воспроизвести логику заложенную в программе
     * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
     * 
     */
    public static <T> void main(String[] args) {
        VendingMachine<Product> machineOne = new VendingMachine<>("Product machine 1");
        DrinkVendingMachine<Drink> machineTwo = new DrinkVendingMachine<>("Drink machine 1");
        HotDrinkVendingMachine<HotDrink> machinethree = new HotDrinkVendingMachine<>("Hot Drink machine 1");
        Product first = new Product("Снеки", 100);
        Drink second = new Drink("Лимонад", 150, 500);
        HotDrink third = new HotDrink("Гринфилд", 150, 500, 500);
        HotDrink fourth = new HotDrink("Мокко", 150, 500, 50);
        HotDrink fifth = new HotDrink("Гринфилд", 100, 500, 50);

        machineOne.add(first);
        machineTwo.add(second);
        machinethree.add(third);
        machinethree.add(fourth);
        machinethree.add(fifth);

        System.out.println(machineOne.getProduct("Снеки"));
        System.out.println(machineTwo.getProduct("Лимонад"));
        System.out.println(machinethree.getProduct("Гринфилд", 500, 50));

    }
}