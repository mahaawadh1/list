
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    
    List<String> fav = new ArrayList<>();
    fav.add("Harry botter");
    fav.add("titanic");
    fav.add("baby shark");
    fav.add("the lion king");
    fav.add("hello world");
    fav.add("black book");
    fav.add("the lord of the rings");
    fav.add("the godfather");

    
    fav.remove(2);

    
    for (String favs : fav) {
        System.out.println(favs);
    }



    
    }


  }


