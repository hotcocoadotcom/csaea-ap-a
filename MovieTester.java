public class MovieTester {
   public static void main(String[] args) {
      Movie one = new Movie("Inception", 9);
      Movie two = new Movie("Interstellar", 8);
      Movie three = new Movie("Tenet", 7);
      one.printInfo();
      two.printInfo();
      three.printInfo();
   }
}

class Movie {
    private String title;
    private int rating;
 
   	public Movie(String title, int rating)
    {
        this.title = title;
        this.rating = rating;
    } 
    public void printInfo() {
        System.out.println(title + " — Rating: " + rating);
    }
}
