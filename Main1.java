public class Main1 {
    public static void main(String[] args) {
        MovablePoint mp1 = new MovablePoint(10,20,20,10);
        MovablePoint mp2 = new MovablePoint(5,7,7,5);

        System.out.println("------- X position -------");
        System.out.println("X = "+mp1.getX());
        System.out.println("speed X = "+mp1.getSpeedX());

        System.out.println("------- X position after modify direction -------");
        mp1.moveRight();
        System.out.println("X go right = "+mp1.getX());
        mp1.moveLeft();
        System.out.println("X got left = "+mp1.getX());

        System.out.println("------- X position after modify values -------");
        mp1.setX(15);
        mp1.setSpeedX(10);
        System.out.println("X = "+mp1.getX());
        System.out.println("speed X = "+mp1.getSpeedX());

        System.out.println("------- X position after modify direction -------");
        mp1.moveRight();
        System.out.println("X go right = "+mp1.getX());
        mp1.moveLeft();
        System.out.println("X go left = "+mp1.getX());

        System.out.println("------- Y position -------");
        System.out.println("Y = "+mp2.getY());
        System.out.println("speed Y = "+mp2.getSpeedY());

        System.out.println("------- Y position after modify direction -------");
        mp2.moveUp();
        System.out.println("Y go Up = "+mp2.getY());
        mp2.moveDown();
        System.out.println("Y go Down = "+mp2.getY());

        System.out.println("------- Y position after modify values -------");
        mp2.setY(15);
        mp2.setSpeedY(10);
        System.out.println("Y = "+mp2.getY());
        System.out.println("speed Y = "+mp2.getSpeedY());

        System.out.println("------- Y position after modify direction -------");
        mp2.moveUp();
        System.out.println("Y go Up = "+mp2.getY());
        mp2.moveDown();
        System.out.println("Y go Down = "+mp2.getY());

    }
}