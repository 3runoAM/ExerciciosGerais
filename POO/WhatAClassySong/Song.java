import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Song {
    private String title;
    private String artist;
    private Set<String> listeners = new HashSet<>();

    /*Constructor*/
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    /*Getters and Setters*/
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }

    /*Methods*/
    public int howMany(ArrayList<String> listenersOfTheDay){
        Set<String> newListeners = new HashSet<>();
        newListeners.addAll(namesToLowerCase(listenersOfTheDay));
        newListeners.removeAll(listeners);
        listeners.addAll(newListeners);
        return newListeners.size();
    }

    private ArrayList<String> namesToLowerCase(ArrayList<String> listenersOfTheDay) {
        ArrayList<String> listenersOfTheDayToLowerCase = new ArrayList<>();
        listenersOfTheDay.forEach(listener -> listenersOfTheDayToLowerCase.add(listener.toLowerCase()));
        return listenersOfTheDayToLowerCase;
    }
}
