package practice1;

public class Rectange {
    private int weight;
    private int height;

    Rectange(int weight, int height) {
        this.weight = weight;
        this.height = height;

    }
//getters
    public int getWeight() {
        return this.weight;
    }
    public int getHeight() {
        return this.height;
    }
    //setter
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int calculateArea() {

        return this.weight*this.height;
    }

}
