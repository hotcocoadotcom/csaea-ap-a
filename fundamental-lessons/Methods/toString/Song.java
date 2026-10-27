public class Song {
    private String title;
    private String artist;
    private int plays;
    
    public Song(String title, String artist) {

        this.title = title;
        this.artist = artist;
        plays = 0;
    }

    public void play() {
        plays++;
    }

    public String toString() {
        if (plays == 1) {
            return title + " by " + artist + " - " + plays + " play";
        }
        else {
            return title + " by " + artist + " - " + plays + " plays";
        }
        
    }

    public String getStarPlays() {
        String str = "";

        for (int i=0; i<plays; i++) {
            str += "*";
        }

        return str;
    } 

    public int getPlays() {
        return plays;
    }
}
