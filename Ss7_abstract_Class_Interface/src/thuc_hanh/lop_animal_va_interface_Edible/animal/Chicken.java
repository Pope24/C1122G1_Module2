package thuc_hanh.lop_animal_va_interface_Edible.animal;

import thuc_hanh.lop_animal_va_interface_Edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound() {
        return "O O O";
    }
    public String howToEat() {
        return "Cock cock";
    }
}
