package Streams;

public class Movie {

    private String title;
    private int likes;

    public Movie(int likes, String title) {
        this.likes = likes;
        this.title = title;
    }

    public int getLikes() {
        return likes;
    }

}
