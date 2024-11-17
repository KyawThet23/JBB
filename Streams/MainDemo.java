package Streams;

import java.util.List;

public class MainDemo {

    public static void main(String[] args) {

    }

    public static void show() {
        List<Movie> movies = List.of(
                new Movie(10,"a"),
                new Movie(10,"b"),
                new Movie(10,"c")
        );

        //Imperative programming
        int count = 0;
        for (var movie : movies)
            if (movie.getLikes() > 10)
                count++;

        // Declarative (Functional) Programming
        var count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();
    }
}


