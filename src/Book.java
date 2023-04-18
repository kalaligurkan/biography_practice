public class Book {

    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
    Create a custom constructor that will take 3 args and defines the Book object
    Define Book class fields as name, genre, totalPage
     */

    //Create 3 args custom constructor here
    //YOUR CODE HERE
        public Book(String name, String genre, int totalPage){
            this.name = name;
            this.genre = genre;
            this.totalPage = totalPage;
        }

    //Define instance variables here
    //YOUR CODE HERE
        public String name;
        public String genre;
        public int totalPage;

        public static final String askReadOrNot = "Did you read any book of the author?";
        public static final String askNameOfBook = "What is the name of author's book?";
        public static final String askGenre = "What is the genre of the book?";
        public static final String askPage = "What is the number of page of the book?";

        public static int totalNumberOfBooks;

        public static void addBooks() {
            totalNumberOfBooks++;
        }
    /*
        Override toString() method that returns Book object information
     */
    //YOUR CODE HERE

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }
}
