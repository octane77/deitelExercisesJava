package chapterThree;

import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Movie movie1 = new Movie(null, null, null, null, null, 0);

        System.out.print("Please enter the name of the movie: ");
        String theMovieTitle = input.nextLine();
        movie1.setTitle(theMovieTitle);

        System.out.print("Please enter the name of the director: ");
        String theDirectorName = input.nextLine();
        movie1.setDirector(theDirectorName);

        System.out.print("Please enter the movie rating: ");
        String theMovieRating = input.nextLine();
        movie1.setRating(theMovieRating);

        System.out.print("Please enter the movie genre: ");
        String theMovieGenre = input.nextLine();
        movie1.setGenre(theMovieGenre);

        System.out.print("Please enter the length of the movie: ");
        String theMovieLength = input.nextLine();
        movie1.setLength(theMovieLength);

        System.out.print("Please enter the movie box office rating: ");
        long theBoxOfficeRating = input.nextLong();
        movie1.setBoxOfficeRating(theBoxOfficeRating);

        System.out.println(movie1.getTitle());
        System.out.println(movie1.getDirector());
        System.out.println(movie1.getRating());
        System.out.println(movie1.getGenre());
        System.out.println(movie1.getLength());
        System.out.println(movie1.getBoxOfficeRating());
    }
}
