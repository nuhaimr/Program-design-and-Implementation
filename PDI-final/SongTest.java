import java.util.*;
public class SongTest
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Song song1 = new Song("Nothing", 276, "Pop rock");
    System.out.println("Song 1's name: " + song1.getName());

    Song song2 = new Song("FirstTime", 456, "Pop rock");
    System.out.println("Song 2's time: " + song2.getTime());

    Song song3 = new Song(song1);
    System.out.println("Song3's name: " + song3.getName());

    Song song4 = new Song();
    System.out.println("song 4's name: " + song4.getName());

    if(song1.equals(song2))
    {
      System.out.println("They are the same");
    }
    else
    {
      System.out.println("They are not the same");
    }

    System.out.println("Song 3 details: " + song3.toString());
    song3.setName("Caskets");

    System.out.println("Details of song3: " + song3.toString());
  }
}



