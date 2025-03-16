package ExceptionsPractice.exceptions.HW;

class NumberFormatExceptionTask {
   private static void parseString(String s) {
       try{
           int number = Integer.parseInt(s);
       } catch (NumberFormatException e) {
           System.err.println("This string can't be parsed into a number " + e.getMessage());
       }
   }

    public static void main(String[] args) {
        parseString("S");
    }
}
