package movies;

public class Movie {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String category;
    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

}
