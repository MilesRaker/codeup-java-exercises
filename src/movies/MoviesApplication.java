package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("**************************** MoviesApplication has begun ****************************");
        boolean loop = true;
        Input in = new Input();
        Movie[] movieList = MoviesArray.findAll();
        while(loop){
            System.out.println("What would you like to do? ");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");

            String userInput = in.getString();
            switch(userInput){
                case "0": return;
                case "1":
                    System.out.println("Listing all movies: ");
                    for (Movie movie : movieList) {
                        System.out.println(movie.getName());
                    }
                    System.out.println("-- End movie list --");
                    break;
                case "2":
                    System.out.println("Listing animated movies: ");
                    for (Movie movie : movieList) {
                        if(movie.getCategory().equalsIgnoreCase("animated")) {
                            System.out.println(movie.getName());
                        }
                    }
                    System.out.println("-- End movie list --");
                    break;
                case "3":
                    System.out.println("Listing drama movies: ");
                    for (Movie movie : movieList) {
                        if(movie.getCategory().equalsIgnoreCase("drama")) {
                            System.out.println(movie.getName());
                        }
                    }
                    System.out.println("-- End movie list --");
                    break;
                case "4":
                    System.out.println("Listing horror movies: ");
                    for (Movie movie : movieList) {
                        if(movie.getCategory().equalsIgnoreCase("horror")) {
                            System.out.println(movie.getName());
                        }
                    }
                    System.out.println("-- End movie list --");
                    break;
                case "5":
                    System.out.println("Listing SciFi movies: ");
                    for (Movie movie : movieList) {
                        if(movie.getCategory().equalsIgnoreCase("scifi")) {
                            System.out.println(movie.getName());
                        }
                    }
                    System.out.println("-- End movie list --");
                    break;
            }
        }
    }
}
