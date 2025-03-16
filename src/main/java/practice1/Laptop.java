package practice1;

public class Laptop {
    String brand;
    double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    public String getBrand() {
        return  this.brand;
    }

    public double getPrice() {
        return  this.price;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public  void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void printInfo() {
        System.out.println("Laptop: "+ this.brand + ", Price: "+ this.price);
    }

    public static class MathOperations {
        public static void main (String [] args) {
            int sum = add(1, 5);
            System.out.println(sum);
            int sub = sub(1, 5);
            System.out.println(sub);
            System.out.println(mult(1,5));
            System.out.println(divide(1,5));
            System.out.println(findMax(1,5));
            System.out.println(diff(1,5));
            System.out.println("The squareArea is: " + squareArea(5));
            System.out.println( 75 + "gives us: " + convertSecondsToMinutes(75) + " mins");
            System.out.println("Average speed " + averageSpeed(5, 20));
            System.out.println("Hypotenuse is: " + findHypotenuse(3, 3));
            System.out.println("Circlelenght is: " + circleLenght(10));
            System.out.println("Percent is: " + calculatePercentage(100.5, 2));
            System.out.println(55 + " in Celcius gives  us " + celciusToFahrenheit(55));
            System.out.println(131 + " in Fahrenheit gives us " + fahrenhetToCelcisus(131));
        }
        public static int add(int x, int y) {
            int sum = 0;
            sum = x+y;
            return sum;
        }
        public static int sub(int x, int y) {
            int sub = 0;
            sub = x-y;
            return sub;
        }
        public  static int mult(int x, int y) {
            return x*y;
        }
        public static double divide(int x,int y) {
            double z;
            z = (double)x/y;
            return z;
        }
        public static int findMax(int a, int b) {
            int max = Math.max(a, b);
            return max;
        }
        public static int diff (int x, int y) {
            int diff = Math.abs(x-y);
            return diff;
        }
        public static int squareArea (int side) {
            return side*side;

        }
        public static int squarePerimeter(int side) {
            return side*4;
        }
        public static double convertSecondsToMinutes(int seconds) {
            double minutes = (double) seconds/60;
            return minutes;
        }
        public static double averageSpeed (double distance, double time) {
            double speed = distance/time;
            return speed;
        }
        public static double findHypotenuse(double a, double b) {
            double hype = Math.sqrt(a*a +b*b);
            return hype;
        }
        public static double circleLenght(double radius) {
            double length = 2*Math.PI*radius;
            return length;

        }
        public static double calculatePercentage(double total, double part) {
            double percent = (part/total)*100;
            return  percent;
        }
        public static double celciusToFahrenheit(double c) {
            double f = (c*9/5) + 32;
            return f;
        }
        public static double fahrenhetToCelcisus(double f) {
            double c = (f-32)*5/9;
            return c;
        }
    }

    public static class MathOperations2 {
        public static void main(String[] args) {
            //System.out.println( add(3,5));
            //System.out.println( sub(3,5));
            //System.out.println( mult(3,5));
            //System.out.println( divide(3,5));
            //System.out.println( findMax(3,5));
            System.out.println( diff(-5,10));
            //System.out.println( squareArea(3));
            //System.out.println( squarePerimeter(3));
            //System.out.println( convertSecondsToMinutes(30));
            //System.out.println( averageSpeed(3, 4));
            //System.out.println( findHypotenuse(3, 3));
            //System.out.println( circleCircumference(0));
            //System.out.println( calculatePercentage(111.444, 6.77));
            //System.out.println( celsiusToFahrenheit(3));
            System.out.println( fahrenheitToCelsius(100));







        }
        public static int add(int x, int y) {
            return x+y;
        }
        public static int sub(int x, int y) {
            return x-y;
        }
        public static int mult(int x, int y) {
            return x*y;
        }
        public static double divide(int x, int y) {
            return (double)x/y;
        }
        public static int findMax(int x, int y) {
            return Math.max(x, y);
        }
        public static int diff(int x, int y) {
            return Math.abs(x-y);
        }
        public static int squareArea(int x) {
            return x*x;
        }
        public static int squarePerimeter(int x) {
            return x*4;
        }
        public static double convertSecondsToMinutes(int seconds) {
            return (double)seconds/60;
        }
        public static double averageSpeed(double distance, double time){
            return distance/time;
        }
        public static double findHypotenuse(double a, double b) {
            return Math.sqrt(a*a + b*b);
        }
        public static double circleCircumference(double radius) {
            return Math.PI*2*radius;
        }
        public static double calculatePercentage(double total, double part) {
            return part*100/total;
        }
        public static double celsiusToFahrenheit(double celsius) {
            return (celsius*9/5)+32;
        }
        public static double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit-32)*5/9;
        }
    }
}
