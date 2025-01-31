
public class Main {
    public static void main(String[] args) {
        Movie movie1=new Movie("Maze Runner","Wes Ball",2014,"science-fiction",6.8);
        Movie movie2=new Movie("Titanic","James Cameron",1997,"romantic",7.8);
        Movie movie3=new Movie("Caddo Lake","Logan George",2024,"thriller",6.9);

        movie1.View();
        movie2.View();
        movie3.View();

        if(movie1.isitnew()){
            System.out.println(movie1.name+" was released after 2020");
        }else{
            System.out.println(movie1.name+" is an old movie");
        }
        if(movie2.isitpopular()){
            System.out.println(movie2.name+" can be watched");
        }else{
            System.out.println(movie2.name+" can result in wasting time");
        }
    }
}