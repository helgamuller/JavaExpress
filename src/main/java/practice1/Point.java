package practice1;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return  this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void print() {
        System.out.println("Coordinates: x="+ this.x +", y ="+ this.y);
    }
}
