/*Name:Nuha Imran
 * date:5/11/21
 * ID:20696366*/

import java.util.*;

//making class

public class Location
{
  //Class fields
  private double latitude;
  private double longitude;
  private String roadNumber;


  //constructor with parameters
  public Location(double pLatitude, double pLongitude, String pRoadNumber)
  {
    latitude = pLatitude;
    longitude = pLongitude;
    roadNumber = pRoadNumber;
  }
  
  //copy constructor
  public Location(Location pLocation)
  {
   latitude = pLocation.getLatitude();
  longitude = pLocation.getLongitude();
  roadNumber = pLocation.getRoadNumber();
 }
  

  //default Constructor
  public Location()
  {
    latitude = -31.9385;
    longitude = 115.8696;
    roadNumber = "1300277";
  }


  //Following accessors(getters)
  //not validated because I havent used
  public double getLatitude()
  {
    return latitude;
  }
  
  public double getLongitude()
  {
    return longitude;
  }
  public String getRoadNumber()
  {
    return roadNumber;
  }
  
  //Following are mutators(setters)
  public void setLatitude(double pLatitude)
  {
    latitude = pLatitude;
  }

  public void setLongitude(double pLongitude)
  {
    longitude = pLongitude;
  }

  public void setRoadNumber(String pRoadNumber)
  {
    roadNumber = pRoadNumber;
  }

  //a check
  public boolean equals(Object inObject)
  {
    boolean isEqual = false;
    Location inLocation = null;
    if(inObject instanceof Location)
    {
      inLocation = (Location)inObject;
      if(latitude == getLatitude())
        if(longitude == getLongitude())
          if(roadNumber.equals(inLocation.getRoadNumber()))
              isEqual = true;
    }
    return isEqual;
  }

  //data is shown as proper format not computer stored
  public String toString()
  {
    String locationString;
    locationString = "Latitude is: " + latitude + "\nLongitude is: " + longitude + "\nRoad Number is: " + roadNumber;
    return locationString;
  }

}
