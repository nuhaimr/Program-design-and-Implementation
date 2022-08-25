import java.util.*;

public class Album
{
  private String artist;
  private String title;
  private int releaseYr;
  private Song[] Songs = new Song[10]

  //Constructor with parameters
  public Album(String pArtist, String pTitle, int pReleaseYr, Song[] pSong)
  {
    artist = pArtist;
    title = pTitle;
    releaseYr = pReleaseYr;
    

  }
  //copy constructor
  public Album(Album pAlbum)
  {
    artist = pAlbum.getArtist();
    title = pAlbum.getTitle();
    releaseYr = pAlbum.getReleaseYr();
    obj = pSong
  }
  //Default Constructors
  public Album()
  { 
  artist = "TheScript";
  title = "Science&Faith";
  releaseYr = 2010;
  obj = pSong["Nothing", 276, "Pop Rock"];
  }
  //accessors
  public String getArtist()
  {
    return artist;
  }
  public String getTitle()
  {
    return title
  }
  public int getReleaseYr()
  {
    return releaseYr;
  }
  //setters
  public void setArtist(String pArtist)
  {
    artist = pArtist;
  }
  public void setTile(String pTitle)
  {
    title = pTitle;
  }
  public void int setReleaseYr(int pReleaseYr)
  {
    releaseYr = pReleaseYr;
  }
  //equals
  boolean isEqual = false;
  Album inAlbum = null;
  if(inAlbum instanceof Album)
  {
    inAlbum = (Album)inObject;
    if(artist.equals(inAlbum.getArtist()))
     if(title.equals(inAlbum.getTitle()))
      if(releaseYr == inAlbum.getReleaseYr())
        isEqual = true;
  }
  return isEqual;
}
  public String toString()
{
  String albumString;
  albumString = "Artist is: " + artist + "\nTitle is " + title + "\n Release year is: " + releaseYr;
  return albumString;
}
}


