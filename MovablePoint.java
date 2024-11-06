public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int speedX;
    private int speedY;
    public MovablePoint(int x, int y, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getSpeedX() {
        return speedX;
    }
    public int getSpeedY() {
        return speedY;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }
    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    @Override
    public void moveUp() {
        y = y + speedY;
    }

    @Override
    public void moveDown() {
        y = y - speedY;
    }

    @Override
    public void moveLeft() {
        x = x - speedX;
    }

    @Override
    public void moveRight() {
        x = x + speedX;
    }
}
