/* Name:Nuha Imran
 * ID:20696366
 * Date:3/11/21*/

import java.util.*;

//making a class
public class Accident
{
  //Class fields
  private String id;
  private String date;
  private String time;
  private String severity;
  private String roadName;
  private String intersectionNumber;
  private String eventNature;
  private Location location = new Location();
 

  //Constructor with Parameters
  public Accident(String pId, String pDate, String pTime, String pSeverity,String pRoadName, String pIntersectionNumber, String pEventNature, Location pLocation)
  {
    id = pId;
    date = pDate;
    time = pTime;
    severity = pSeverity;
    roadName = pRoadName;
    intersectionNumber = pIntersectionNumber;
    eventNature = pEventNature;
    location = pLocation;
  }

  //copy constructor
  public Accident(Accident pAccident)
  {
    id = pAccident.getId();
    date = pAccident.getDate();
    time = pAccident.getTime();
    severity = pAccident.getSeverity();
    roadName = pAccident.getRoadName();
    intersectionNumber = pAccident.getIntersectionNumber();
    eventNature = pAccident.getEventNature();
    location = pAccident.getLocation();
  }

  //Default Constructors
  public Accident()
  {
    id = "9797493";
    date = "28/5/18";
    time = "815";
    severity = "Medical";
    roadName = "beaufort st";
    intersectionNumber = "50626";
    eventNature = "Right Angle";
    location = new Location(-31.9385, 115.8696, "1300277");
    
  }
  
  //Following are the Accessors(getters)
  //I have not validated since I have not used I have validated in menu
  public String getId()
  {
    return id;
  }

  public String getDate()
  {
    return date;
  }

  public String getTime()
  {
    return time;
  }

  public String getSeverity()
  {
   return severity;
  }

  public String getRoadName()
  {
    return roadName;
  }

  public String getIntersectionNumber()
  {
    return intersectionNumber;
  }
  public String getEventNature()
  {
   return eventNature;
  }
  
 public Location getLocation()
 {
  return location;
 }
 
  
  //Following mutators (setters)
  public void setId(String pId)
  {
    id = pId;
  }

  public void setDate(String pDate)
  {
    date = pDate;
  }

  public void setTime(String pTime)
  {
    time = pTime;
  }
  public void setSeverity(String pSeverity)
  {
    severity = pSeverity;
  }
  public void setRoadName(String pRoadName)
  {
    roadName = pRoadName;
  }
  public void setIntersectionNumber(String pIntersectionNumber)
  {
    intersectionNumber = pIntersectionNumber;
  }
  public void setEventNature(String pEventNature)
  {
    eventNature = pEventNature;
  }
  public void setLocation(Location pLocation)
  {
    location = pLocation;
  }

 //checking whether two equals or not
 public boolean equals(Object inObject)
 {
  boolean isEqual = false;
  Accident inAccident = null;
  if(inObject instanceof Accident)
   {
    inAccident = (Accident)inObject;
    if(id.equals(inAccident.getId()))
     if(date.equals(inAccident.getDate()))
      if(time.equals(inAccident.getTime()))
       if(severity.equals(inAccident.getSeverity()))
        if(roadName.equals(inAccident.getRoadName()))
         if(intersectionNumber.equals(inAccident.getIntersectionNumber()))
          if(eventNature.equals(inAccident.getEventNature()))
           if(location.equals(inAccident.getLocation()))
            isEqual = true;
     }
    return isEqual;
  }

  //String so it doesnt store and show as computer data
  public String toString()
  {
    String accidentString;
    accidentString = "Accident id is: " + id + "\nDate is: " + date + "\nTime is: " + time + "\nSeverity was: " + severity + "\nRoad name is: " + roadName + "\nIntersection number is: " + intersectionNumber + "\nEvent nature is:" + eventNature + "\nEvent location is" + location;
    return accidentString;
  }

}


