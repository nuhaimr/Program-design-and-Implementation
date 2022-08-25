import java.util.*;

//making class

public class Song
{
  //Class fields
  private String name;
  private int time;
  private String genre;


  //constructor with parameters
  public Song(String pName, int pTime, String pGenre)
  {
    name  = pName;
    time = pTime;
    genre = pGenre;
  }
  
  //copy constructor
  public Song(Song pSong)
  {
   name = pSong.getName();
   time = pSong.getTime();
   genre = pSong.getGenre();
 }
  

  //default Constructor
  public Song()
  {
    name = "Nothing";
    time = 274;
    genre = "Pop Rock";
  }


  //Following accessors(getters)
  public String getName()
  {
    return name;
  }
  
  public int getTime()
  {
    return time;
  }
  public String getGenre()
  {
    return genre;
  }
  
  //Following are mutators(setters)
  public void setName(String pName)
  {
    name = pName;
  }

  public void setTime(int pTime)
  {
    time  = pTime;
  }

  public void setGenre(String pGenre)
  {
    genre = pGenre;
  }

  //a check
  public boolean equals(Object inObject)
  {
    boolean isEqual = false;
    Song inSong = null;
    if(inObject instanceof Song)
    {
      inSong = (Song)inObject;
      if(name.equals(inSong.getName()))
        if(time == getTime())
          if(genre.equals(inSong.getGenre()))
              isEqual = true;
    }
    return isEqual;
  }

  //data is shown as proper format not computer stored
  public String toString()
  {
    String songString;
    songString = "Song name is: " + name + "\nSong total seconds: " + time + "\nGenre: " + genre;
    return songString;
  }

}
