package practice5.exceptions;
//Попытка преобразования строки в число: Реализуйте метод, который принимает строку и преобразует её в число, обрабатывая NumberFormatException.
public class StringConvertationException {

    private static void convertString(String s) {
        try{
            int number = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.err.println("String should contain numbers only" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        convertString("s");
    }
}
