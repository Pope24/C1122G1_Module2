package Ss4_class_and_object_java.exercise.equation_2;

import java.util.Scanner;

public class QuadracticEquationTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A = ");
        double x1 = sc.nextDouble();
        System.out.println("B = ");
        double x2 = sc.nextDouble();
        System.out.println("C = ");
        double x3 = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(x1, x2, x3);
        double denta = quadraticEquation.getDiscriminant();
        if (denta < 0) {
            System.out.println("The equation has no roots");
        }
        else if (denta == 0) {
            System.out.println("The equation has one root = " + quadraticEquation.getRoot1());
        }
        else {
            System.out.println("The equation has two root "+quadraticEquation.getRoot1()+" and "+quadraticEquation.getRoot2());
        }
    }
}
