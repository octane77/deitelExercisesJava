package chapterThree;

public class Movie {
    private String title;
    private String director;
    private String rating;
    private String genre;
    private String length;
    private long boxOfficeRating;

    public Movie(String title, String director, String rating, String genre, String length, long boxOfficeRating){
        this.title = title;
        this.director = director;
        this.rating = rating;
        this.genre = genre;
        this.length = length;
        this.boxOfficeRating = boxOfficeRating;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getTitle(){
        return title;
    }

    public void setDirector(String director){
        this.director=director;
    }

    public String getDirector(){
        return director;
    }

    public void setRating(String rating){
        if (rating.equals("G")|| rating.equals("PG")||rating.equals("PG-13")||rating.equals("R")||rating.equals("NR")){
            this.rating = rating;
        } else {
                System.out.println("Invalid Rating");
//                this.rating = "NR";
        }

    }

    public String getRating(){
        return rating;
    }

    public void setGenre(String genre) {
        this.genre=genre;
    }

    public String getGenre(){
        return genre;
    }

    public void setLength(String length) {
        this.length=length;
    }

    public String getLength(){
        return length;
    }

    public void setBoxOfficeRating(long boxOfficeRating) {
        this.boxOfficeRating = boxOfficeRating;
    }

    public long getBoxOfficeRating(){
        return boxOfficeRating;
    }
}
