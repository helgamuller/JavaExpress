package ExceptionsPractice.exceptions.HW;
//Цепочка исключений: Создайте метод, который выбрасывает одно исключение, но перехватывает его и выбрасывает другое (Exception Chaining).
 class ExceptionChaining {
    private static int[] array = {1,2,3};

    private static int getArgument(int index) throws ArrayIndexOutOfBoundsException {
        if (index<array.length){
        int num2 = array[index];
        return num2;
        }
        else {throw new ArrayIndexOutOfBoundsException("Index"  + index +  "doesn't exists");}
    }
        private static double divedByIndex(int num2) {
        try{
            int num = getArgument(num2);
            return 100/num;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Can't get argument because of another problem", e);
        }
        }

    public static void main(String[] args) {
        try {
            divedByIndex(4);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
            System.err.println("Caused by " + e.getCause());
        }
    }
}
