package Ss5_access_modifier.Circle;

public class AccessModifier {
    public static void main(String args[]) {
        Circle defaultCircle = new Circle();
        Circle circleUser = new Circle(3);
        System.out.println("Dien tich hinh thu nhat: " + defaultCircle.getArea() + " co ban kinh la " + defaultCircle.getRadius());
        System.out.println("Dien tich hinh thu hai: " + circleUser.getArea() + " co ban kinh la " + circleUser.getRadius());
    }
}
