
import java.util.ArrayList;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
        This will be our actual program that we define author and his books
        In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

        Full name = Stefan Zweig
        County = Austria
        Is still alive: No (28 November 1881 – 22 February 1942)
        Some of his books as listed below:

        BookName                            Genre           TotalPage
        Amok                                tale            189
        The Royal Game                      novella         53
        24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE

        Scanner input = new Scanner(System.in);
        ArrayList<Author> biographyOfAuthor = new ArrayList<>();


        System.out.println(Author.askName);
        String name = input.nextLine();

        System.out.println(Author.askLastName);
        String lastName = input.nextLine();

        System.out.println(Author.askCountry);
        String country = input.nextLine();

        System.out.println(Author.isAuthorAlive);
        boolean isAlive1 = input.nextLine().equalsIgnoreCase("y");

        System.out.println(Author.authorAge);
        int age = input.nextInt();

        input.nextLine();



        Author a = new Author(name, lastName, country, isAlive1, age);
        biographyOfAuthor.add(a);




        ArrayList<Book> bookInfo = new ArrayList<>();

        do {
            System.out.println(Book.askReadOrNot);
            String readOrNot = input.nextLine();

            if(readOrNot.toLowerCase().startsWith("y")) {
                Book.addBooks();

                System.out.println(Book.askNameOfBook);
                String nameOfBook = input.nextLine();

                System.out.println(Book.askGenre);
                String genreOfBook = input.nextLine();

                System.out.println(Book.askPage);
                int pageOfBook = input.nextInt();

                input.nextLine();

                Book b1 = new Book(nameOfBook, genreOfBook, pageOfBook);
                bookInfo.add(b1);
            }
        }while (Book.totalNumberOfBooks < 3);



                System.out.println(a);


        System.out.println("Author's books are as listed below:");

        for (Book book : bookInfo) {
            System.out.println(book);

        }




    }
}
