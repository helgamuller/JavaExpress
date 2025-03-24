package practice6.functionalInterfaces;
//check if a number satisfy a  condition
@FunctionalInterface
 interface Checker {
    //check if the number satidfy a condition
    //default method print out the number if it passed a check
    //remember that functional intefaces supports static methods and default methods
     boolean check(int number);
     default void printIfValid(int number) {
         if(check(number)) {
             System.out.println(number);

         }
     }

}
