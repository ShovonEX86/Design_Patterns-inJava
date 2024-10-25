import java.util.ArrayList;
import java.util.List;

public class FlimFan extends Fan{
     
     private List<FilmCelebrity> flimceleb = new ArrayList<FilmCelebrity>();
    
    void update(FilmCelebrity fc){
     if(flimceleb.contains(fc)){
          fc.getState();
     }
    }
    void addCelebrity(FilmCelebrity fc){
          flimceleb.add(fc);
          fc.attach(this);
     }
     void removeCelebrity(FilmCelebrity fc){
          flimceleb.remove(fc);
          fc.remove(this);
     }
    
}
