import java.util.LinkedList;
import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            Song newSong = new Song(title, duration);
            songs.add(newSong);
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber > 0 && trackNumber <= songs.size()) {
            Song songToAdd = songs.get(trackNumber - 1);
            playlist.add(songToAdd);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song songToAdd = findSong(title);
        if (songToAdd != null) {
            playlist.add(songToAdd);
            return true;
        }
        return false;
    }
}

// --------------------------------------------------------------------------------------------------------------------------
// song.java


import java.util.ArrayList;
public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }
}




