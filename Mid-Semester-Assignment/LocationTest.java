/*Name:Nuha Imran
 *Id:20696366
  date:6/11/21*/

public class LocationTest
{
  public static void main(String[] args)
  {
    
 
    //making new objects
    Location placeOne = new Location(-31.9385, 115.8696,
        "1300277");


    //making new objects
    Location placeTwo = new Location(-32.074, 115.7531, "1180019");
     
    if(placeOne.equals(placeTwo))
    {
      System.out.println("They are the same");
    }

    else
    {
      System.out.println("They are not the same");
    }

    System.out.println("Details of placeOne: " + placeOne.toString());

    placeOne.setLatitude(-31.9385);

    System.out.println("Place One details are: " + placeOne.toString());
  }
}

