public class FilmCelebrity extends Celebrity{
    private String state;

    void setState(String s){
        state  = s;
        notifyFans();
    }

    String getState(){
        return state;
    }
    
}
