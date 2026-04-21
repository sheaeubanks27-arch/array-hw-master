import java.sql.SQLOutput;

public class Library {

    public String owner = "Shea Eubanks";
    public Book[] allBooks;
    public static void main(String[] args) {
        //TODO: Make an instance of the main class
        new Library();

    }

    public Library(){
        System.out.println("Welcome to "+ owner + "'s library!!!!!");
        //TODO: Give the array allBooks a size of 10
        allBooks = new Book[10];

        for(int x = 0; x <11; x++){
            allBooks[x].rating = (int)(Math.random()*11);
        }

        averageRating();

        //TODO: Fill the array allBooks with reviews with random ratings from 0 to 10 inclusive

        //TODO: print all the ratings in the array allBooks

        //TODO: Call the method averageRating

    }

    public void averageRating(){
            int average = 0;
            for(int a = 0; a < allBooks.length; a++){
                average = (allBooks.length);
                System.out.println(a);

            }
        //TODO: calculate the average rating from the array allBooks and print it

    }


}
