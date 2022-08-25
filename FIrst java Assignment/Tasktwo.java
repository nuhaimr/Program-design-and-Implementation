/**Name:Nuha Imran
 ID:20696366
 Date:10/12/2021**/

import java.util.*;
public class Tasktwo
{
  public static void main(String[] args)
  {
   System.out.println("Welcome to the fatest lap Tracker program");
   System.out.println("Your program will track fatest lap time");
   System.out.println("by 3 drivers during 5 races" + "\n");
   
   //declaring other values
   int choice;
   int sum = 0, sum1 = 0, sum2 = 0;
   int average = 0, average1 = 0, average2 = 0;

   //declaring my arrays
   int [] MaxVerstappen;
   int [] LewisHamilton;
   int [] DanielRicciardo;
   
   //Scanner to read user inputs
   Scanner sc = new Scanner(System.in);

   System.out.println("-----------------");

   //allocating memory to my arrays & getting user input
   MaxVerstappen = new int [5];
   int MaxVerstappenLength = MaxVerstappen.length;
   System.out.println("Enter time in seconds for Max Verstappen?");
   for(int i=0;i<MaxVerstappen.length;i++)
      {
        MaxVerstappen[i] = sc.nextInt();
        
         if(MaxVerstappen[i] < 0)
           {
             MaxVerstappen[i]=222;
           }
        System.out.println("Race lap time in seconds " + MaxVerstappen[i]);
        //for choice
        sum += MaxVerstappen[i];
        average += MaxVerstappen[i]/5;
       }

        
    System.out.println("-----------------");

    //allocating memory to my arrays and getting user input 
    LewisHamilton = new int [5];
    int LewisHamiltonLength =LewisHamilton.length;
    System.out.println("Enter time in seconds for  Lewis Hamilton?");
    for(int i=0;i<LewisHamiltonLength;i++)
      {
        LewisHamilton[i] = sc.nextInt();
        
        if (LewisHamilton[i] < 0)
          {
           LewisHamilton[i]=222;
          }
      
        System.out.println("Race lap time in seconds " + LewisHamilton[i]);
        //for choice 
        sum1 += LewisHamilton[i];
        average1 += LewisHamilton[i]/5;
      }
   
    System.out.println("-----------------");

    //allocating memory to my arrays and getting user input
    DanielRicciardo = new int [5];
    int DanielRicciardoLength = DanielRicciardo.length;
    System.out.println("Enter time in seconds for Daniel Ricciardo?");
    for(int i=0;i<DanielRicciardoLength;i++)
      {
       DanielRicciardo[i] = sc.nextInt();
       if ( DanielRicciardo[i] < 0)
          {
           DanielRicciardo[i]=222;
          }
       System.out.println("Race lap time in seconds " + DanielRicciardo[i]);
       //for choice 
       sum2 += DanielRicciardo[i];
       average2 += DanielRicciardo[i]/5;
      }

     System.out.println("-----------------");
     System.out.println("PHEWW THE HARD PART IS OVER");
     //Forming a menu
     System.out.println("Choose what you would like to do?");
     System.out.println("1.Display total time for the five laps of each driver?");
     System.out.println("2.Display the average lap time for each driver?");
     System.out.println("3.Display the driver with the fastest lap time?");

     //checking user input
     choice = sc.nextInt();

     //doing things according to choice
     if (choice == 1)
      {
       System.out.println("Total time taken by MaxVerstappen :" + sum);
       System.out.println("Total time taken by Lewis Hamilton :" + sum1);
       System.out.println("Total time taken by Daniel Ricciardo :" + sum2);
      } 
  
    //doing things according to choice
      if (choice == 2)
      {
       System.out.println("average time of Max Verstappen: " + average);
       System.out.println("average time of Lewis Hamilton: " + average1);
       System.out.println("average time of Daniel Ricciardo: " + average2);
      }
   
     //doing things according to choice
      if (choice == 3)
       { 
         if ((average<average2) && (average<average1))
         System.out.println("Max Verstappen had the fatest lap time.");
  
         else if
         ((average1<average) && (average1<average2))
         System.out.println("Lewis Hamilton had the fatest lap time.");
         
         else 
         System.out.println("Daniel Ricciardo had fatest lap time.");
       }
       sc.close();
  }
}

