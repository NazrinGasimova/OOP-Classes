public class Movie {
    String name;
    String director;
    int year;
    String type;
    double imdb;

    public Movie(String name,String director,int year,String type,double imdb){
        this.name=name;
        this.director=director;
        this.year=year;
        this.type=type;
        this.imdb=imdb;
    }
    public void View(){
        System.out.println("Movie: "+name);
        System.out.println("Director: "+director);
        System.out.println("Year: "+year);
        System.out.println("Type: "+type);
        System.out.println("IMDB: "+imdb);

    }
    public boolean isitnew(){
        return year>2020;
    }
    public boolean isitpopular(){
        return imdb>7.0;
    }
}
// ______________________
// |       Movie        |
// ----------------------
// | - name: String     |
// | - director: String |
// | - year: int        |
// | - type: String     |
// | - imdb: double     |
// ----------------------
// | + View()           |
// | + isitold()        |
// | + isitpopular()    |
// ----------------------
