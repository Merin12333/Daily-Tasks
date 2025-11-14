package Encapsulation;
//This program uses encapsulation to store movie details such as title, genre, and rating, 
//and allows setting these values through setter methods, with rating allowed only between 0 and 10
//, and displays the movie information using displayInfo().

class Movie {
    private String title;
    private String genre;
    private double rating;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 10.0) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating");
        }
    }

    public void displayInfo() {
        
        System.out.println("Title : " + title);
        System.out.println("Genre : " + genre);
        System.out.println("Rating: " + rating + "/10");
    }
}

public class MovieRatingSystem{
    public static void main(String[] args) {

        Movie m1 = new Movie();
        Movie m2 = new Movie();
        Movie m3 = new Movie();

        m1.setTitle("Inception");
        m1.setGenre("Science Fiction");
        m1.setRating(8.8);

        m2.setTitle("The Lion King");
        m2.setGenre("Animation");
        m2.setRating(9.1);

        m3.setTitle("Random Movie");
        m3.setGenre("Drama");
        m3.setRating(12.5);

        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();
    }
}
