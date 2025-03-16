package practice2;

public class Main {
    public static void main(String[] args) {
        Company employee1 = new Company(100, "Jhons");
        Company employee2 = new Company(200, "Smith");
        Company.companyName = "IBM";
        //employee2.employeeID = 120;
        Company.printCompanyName();


        double roundArea = MathConstants.roundArea(3);
        double roundLength = MathConstants.roundLenght(5);
        System.out.println("Area is: " + roundArea +", Lenght is: " + roundLength);

        Library library = new Library();
        String bookTitle = library.getBookTitle();
        System.out.println(bookTitle);

        String author = library.author;
        System.out.println(author);

        int year = library.year;
        System.out.println(year);

        String cathegory = library.cathegory;
        System.out.println(cathegory);

        University anya = new University(100, "anya");
        University vasya = new University(200, "vasya");
        University ira = new University(300, "Ira");
        System.out.println(University.universityName);
        University.changeUniversityName("GUAP");
        System.out.println(University.universityName);
        anya.printStudentInfo();
        vasya.printStudentInfo();
        ira.printStudentInfo();

        GameSettings game1  = new GameSettings("FirstGame", 2);
        GameSettings game2 = new GameSettings("SecondGame", 120);
        GameSettings.setMaxPlayers(6);
        game1.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();

        Person person1 = new Person("Ivan", "Ivanoff", "3232323");
        Person person2 = new Person("Petroff", "Petr", "1111111");
        person2.setFirstName("Anna");
        person2.setLastName("Obukhova");
        person2.printPersonInfo();
        person1.printPersonInfo();


    }
}
