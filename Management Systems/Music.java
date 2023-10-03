import java.util.*;

class Song {
    private int songId;
    private String songTitle;
    private String artistName;
    private String albumTitle;
    private String genre;
    private int durationInSeconds;
    private static int playCount;

    Song() {
        songId = 0;
        songTitle = "";
        artistName = "";
        albumTitle = "";
        genre = "";
        durationInSeconds = 0;
        playCount = 0;
    }

    void setDetails(int id, String title, String artist, String album, String genre, int duration) {
        songId = id;
        songTitle = title;
        artistName = artist;
        albumTitle = album;
        this.genre = genre;
        durationInSeconds = duration;
    }

    void getDetails() {
        System.out.println("Song ID: " + songId);
        System.out.println("Song title: " + songTitle);
        System.out.println("Artist name: " + artistName);
        System.out.println("Album title: " + albumTitle);
        System.out.println("Genre: " + genre);
        System.out.println("Duration in seconds: " + durationInSeconds);
    }

    int play(int id) {
        playCount++;
        return playCount;
    }

    static ArrayList<String> playList = new ArrayList<>();

    void addToPlaylist(int id) {
        playList.add(songTitle);

        System.out.println("\nPlaylist: ");
        for (String song : playList) {
            System.out.println(song);
        }
    }

    void removeFromPlaylist(int id) {
        playList.remove(songTitle);

        System.out.println("Playlist: ");
        for (String song : playList) {
            System.out.print(song);
        }
    }

    int getSongID() {
        return songId;
    }
}

public class Music {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter initial number of songs: ");
        n = sc.nextInt();

        int id, duration;
        String title, artist, album, genre;

        ArrayList<Song> songList = new ArrayList<Song>();
        for (int i = 0; i < n; i++) {
            Song obj = new Song();
            System.out.println("\nSong " + i + 1);
            System.out.print("Enter the song id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the song title: ");
            title = sc.nextLine();
            System.out.print("Enter the artist name: ");
            artist = sc.nextLine();
            System.out.print("Enter the album name: ");
            album = sc.nextLine();
            System.out.print("Enter the genre: ");
            genre = sc.nextLine();
            System.out.print("Enter the duration in seconds: ");
            duration = sc.nextInt();

            obj.setDetails(id, title, artist, album, genre, duration);
            songList.add(obj);
        }

        int ch;
        char ans = 'y';

        while (ans == 'y' || ans == 'Y') {
            System.out.println("\n1.Set details");
            System.out.println("2.Get details");
            System.out.println("3.Total number of plays");
            System.out.println("4.Add to playlist");
            System.out.println("5.Remove from playlist");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            int input_id = 0;
            boolean flag = false;
            switch (ch) {
                case 1:
                    Song object = new Song();
                    System.out.print("\nEnter the song id: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the song title: ");
                    title = sc.nextLine();
                    System.out.print("Enter the artist name: ");
                    artist = sc.nextLine();
                    System.out.print("Enter the album name: ");
                    album = sc.nextLine();
                    System.out.print("Enter the genre: ");
                    genre = sc.nextLine();
                    System.out.print("Enter the duration in seconds: ");
                    duration = sc.nextInt();

                    object.setDetails(id, title, artist, album, genre, duration);
                    songList.add(object);
                    break;

                case 2:
                    System.out.print("Enter the id: ");
                    input_id = sc.nextInt();

                    for (int i = 0; i < songList.size(); i++) {
                        if (songList.get(i).getSongID() == input_id) {
                            songList.get(i).getDetails();
                            flag = true;
                        }
                    }
                    if (!flag)
                        System.out.println("ID not found");
                    break;

                case 3:
                    System.out.print("Enter the id: ");
                    input_id = sc.nextInt();
                    int playC = 0;

                    for (int i = 0; i < songList.size(); i++) {
                        if (songList.get(i).getSongID() == input_id) {
                            playC = songList.get(i).play(input_id);
                            System.out.println("Song played " + playC + " times");
                            flag = true;
                        }
                    }
                    if (!flag)
                        System.out.println("ID not found");
                    break;

                case 4:
                    System.out.print("Enter the id: ");
                    input_id = sc.nextInt();

                    for (int i = 0; i < songList.size(); i++) {
                        if (songList.get(i).getSongID() == input_id) {
                            songList.get(i).addToPlaylist(input_id);
                            flag = true;
                        }
                    }
                    if (!flag)
                        System.out.println("ID not found");
                    break;

                case 5:
                    System.out.print("Enter the id: ");
                    input_id = sc.nextInt();

                    for (int i = 0; i < songList.size(); i++) {
                        if (songList.get(i).getSongID() == input_id) {
                            songList.get(i).removeFromPlaylist(input_id);
                            flag = true;
                        }
                    }
                    if (!flag)
                        System.out.println("ID not found");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
            System.out.print("\nDo you want to continue? ");
            ans = sc.next().charAt(0);
        }

        sc.close();

    }
}
