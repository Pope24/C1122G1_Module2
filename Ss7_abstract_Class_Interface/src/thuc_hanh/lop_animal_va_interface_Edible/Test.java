package thuc_hanh.lop_animal_va_interface_Edible;

import thuc_hanh.lop_animal_va_interface_Edible.animal.Animal;
import thuc_hanh.lop_animal_va_interface_Edible.animal.Chicken;
import thuc_hanh.lop_animal_va_interface_Edible.animal.Tiger;
import thuc_hanh.lop_animal_va_interface_Edible.edible.Edible;
import thuc_hanh.lop_animal_va_interface_Edible.fruit.Apple;
import thuc_hanh.lop_animal_va_interface_Edible.fruit.Fruit;
import thuc_hanh.lop_animal_va_interface_Edible.fruit.Orange;

public class Test {
    public static void main(String args[]) {
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit aFruit: fruit) {
            System.out.println(aFruit.howToEat());
        }
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal:animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
