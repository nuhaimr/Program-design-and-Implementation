//*Name:Nuha Imran
//ID 20696366
//Date:4/11/21*//

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.*;



public class CrashData {
    //making a class for the furthest accident from a certain one
    public static double furthest(double latitude, double longitude) {
        //putting in my file path and telling its coma seperated through delimeter
        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";
        //creating Array List
        List<Double> distances = new ArrayList<Double>();
        try {
            //objects for file reading
            File file = new File(csvFile);
            //file reader reads characters mostly
            FileReader fr = new FileReader(file);
            //buffered reader reads any input stream
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] Array;

            //read till there is a next line
            while ((line = br.readLine()) != null) {
                //storage of array with coma split factors
                Array = line.split(delimiter);
                //to access formulas
                HaversineDistanceCalculator haversineDistanceCalculator = new HaversineDistanceCalculator();
                //Do not want to consider the first row
                if (!Array[0].contains("X")) {
                    //using the formula given I declared array string need to typecast also getting access to columns with contain latitude & longitude apart from user input
                    double distance = haversineDistanceCalculator.haverSineDistance(latitude, longitude, Double.parseDouble(Array[1]), Double.parseDouble(Array[0]));
                    //so it doesnt start comparing with what the user entered
                    if (distance != 0.0) {
                        //using Array lists to add all distances calculated to arraylists
                        distances.add(distance);
                    }
                }
            }
            br.close();
            //ignore ugly note
        } catch (IOException ioe) 
        {
            ioe.printStackTrace();
        }
        //getting index 0 from my Arraylist
        double furthest = distances.get(0);

        //comparing to find furtherest
        for (int s = 0; s < distances.size(); s++) {
            if (distances.get(s) > furthest)
                furthest = distances.get(s);
        }
        //method returns export so I can access it later
        return furthest;
    }

    //doing same thing for closest distance
    public static double closest(double latitude, double longitude) {
        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";
        List<Double> distances = new ArrayList<Double>();
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] Array1;

            while ((line = br.readLine()) != null) {
                Array1 = line.split(delimiter);
                HaversineDistanceCalculator haversineDistanceCalculator = new HaversineDistanceCalculator();
                if (!Array1[0].contains("X")) {
                    double distance = haversineDistanceCalculator.haverSineDistance(latitude, longitude, Double.parseDouble(Array1[1]), Double.parseDouble(Array1[0]));
                    if (distance != 0.0) {
                        distances.add(distance);
                    }
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        double closest = distances.get(0);

        for (int s = 0; s < distances.size(); s++) {

            if (distances.get(s) < closest)
                closest = distances.get(s);
        }

        return closest;
    }

    //same thing for furtherest fatal just changing columns to the ones we need access of
    public static double furthestFatal(double latitude, double longitude) {
        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";
        List<Double> distances = new ArrayList<Double>();
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] Array2;

            while ((line = br.readLine()) != null) {
                Array2 = line.split(delimiter);
                HaversineDistanceCalculator haversineDistanceCalculator = new HaversineDistanceCalculator();
                if (!Array2[0].contains("X")) {
                    if (Array2[15].equals("Fatal")) {
                        double distance = haversineDistanceCalculator.haverSineDistance(latitude, longitude, Double.parseDouble(Array2[1]), Double.parseDouble(Array2[0]));
                        if (distance != 0.0) {
                            distances.add(distance);
                        }
                    }
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        double furthest = distances.get(0);

        for (int s = 0; s < distances.size(); s++) {
            if (distances.get(s) > furthest)
                furthest = distances.get(s);
        }

        return furthest;
    }

    //doing the same thing
    public static double closestFatal(double latitude, double longitude) {
        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";
        List<Double> distances = new ArrayList<Double>();
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] Array3;

            while ((line = br.readLine()) != null) {
                Array3 = line.split(delimiter);
                HaversineDistanceCalculator haversineDistanceCalculator = new HaversineDistanceCalculator();
                if (!Array3[0].contains("X")) {
                    if (Array3[15].equals("Fatal")) {
                        double distance = haversineDistanceCalculator.haverSineDistance(latitude, longitude, Double.parseDouble(Array3[1]), Double.parseDouble(Array3[0]));
                        if (distance != 0.0) {
                            distances.add(distance);
                        }
                    }
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        double closest = distances.get(0);

        for (int s = 0; s < distances.size(); s++) {
            if (distances.get(s) < closest)
                closest = distances.get(s);
        }

        return closest;
    }

    //doing the same thing
    public static double furthestHospitalFatal(double latitude, double longitude) {
        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";
        List<Double> distances = new ArrayList<Double>();
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] Array4;

            while ((line = br.readLine()) != null) {
                Array4 = line.split(delimiter);
                HaversineDistanceCalculator haversineDistanceCalculator = new HaversineDistanceCalculator();
                if (!Array4[0].contains("X")) {
                    if (Array4[15].equals("Hospital")) {
                        double distance = haversineDistanceCalculator.haverSineDistance(latitude, longitude, Double.parseDouble(Array4[1]), Double.parseDouble(Array4[0]));
                        if (distance != 0.0) {
                            distances.add(distance);
                        }
                    }
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        double furthest = distances.get(0);

        for (int s = 0; s < distances.size(); s++) {
            if (distances.get(s) > furthest)
                furthest = distances.get(s);
        }

        return furthest;
    }

    //doing the same thing
    public static double closestHospitalFatal(double latitude, double longitude) {
        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";
        List<Double> distances = new ArrayList<Double>();
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] Array5;

            while ((line = br.readLine()) != null) {
                Array5 = line.split(delimiter);
                HaversineDistanceCalculator haversineDistanceCalculator = new HaversineDistanceCalculator();
                if (!Array5[0].contains("X")) {
                    if (Array5[15].equals("Hospital")) {
                        double distance = haversineDistanceCalculator.haverSineDistance(latitude, longitude, Double.parseDouble(Array5[1]), Double.parseDouble(Array5[0]));
                        if (distance != 0.0) {
                            distances.add(distance);
                        }
                    }
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        double closest = distances.get(0);

        for (int s = 0; s < distances.size(); s++) {
            if (distances.get(s) < closest)
                closest = distances.get(s);
        }

        return closest;
    }

    //doing the same thing
    public static double TenKm(double latitude, double longitude) {
        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";
        List<Double> distances = new ArrayList<Double>();
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] Array6;

            while ((line = br.readLine()) != null) {
                Array6 = line.split(delimiter);
                HaversineDistanceCalculator haversineDistanceCalculator = new HaversineDistanceCalculator();
                if (!Array6[0].contains("X")) {
                    double distance = haversineDistanceCalculator.haverSineDistance(latitude, longitude, Double.parseDouble(Array6[1]), Double.parseDouble(Array6[0]));
                    if (distance != 0.0) {
                    //just checking if they are in range
                        if (distance <= 10.0) {
                            distances.add(distance);
                        }
                    }
                }
            }
            br.close();
        } catch (IOException ioe) 
        {
            ioe.printStackTrace();
        }
        //I want the size so using size instead of get like i want total accidents within 10km
        double totalAccidentsTenkm = distances.size();

        return totalAccidentsTenkm;
    }

    //using the 10km method dividing by total multiplying by 100 to find percentage
    public static double PercentTenKm(double latitude, double longitude) 
    {

        double percent = (TenKm(latitude, longitude) / Total()) * 100;
        //this is to convert to .2 decimal place
        double percentage = Math.round(percent * 100.0) / 100.0;

        return percentage;
    }

    //this is for total data in file
    public static double Total() {
        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";
        List<Double> distances = new ArrayList<Double>();
        double total = 0.0;
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) 
            {
                //while there are lines it keeps reading to calculate total
                while ((line = br.readLine()) != null) 
                {
                    total++;
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return total;
    }

    //for fiding fatal accidents(doing same thing :()
    public static double Fatal() 
    {

        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";

        double total = 0.0;

        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] Array8;

            while ((line = br.readLine()) != null) 
            {
                Array8 = line.split(delimiter);
                if (!line.contains("Latitude")) 
                {
                    //I want only fatal total
                    if (Array8[15].equals("Fatal")) 
                    {
                        total++;
                    }
                }
            }
            br.close();
        } catch (IOException ioe) 
        {
            ioe.printStackTrace();
        }

        return total;
    }

    //using fatal to find percentage
    public static double FatalPerecent() {

        double total = (Fatal() / Total()) * 100;

        //converting two decimal place will do for all percenrages
        double percentage = Math.round(total * 100.0) / 100.0;

        return percentage;
    }

    //finding hospital accidents(same thing) Ill just change equals 
    public static double Hospital() {

        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";

        double total = 0.0;

        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] Array9;

            while ((line = br.readLine()) != null) 
            {
                Array9 = line.split(delimiter);
                if (!line.contains("Latitude")) 
                {
                    if (Array9[15].equals("Hospital")) 
                    {
                        total++;
                    }
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return total;
    }


    //using total hospital accidents to find percentage
    public static double HospitalPerecent() {

        double total = (Hospital() / Total()) * 100;

        double percentage = Math.round(total * 100.0) / 100.0;

        return percentage;
    }

    //finding rear end accidents
    public static double RearEnd() {

        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";

        double rearend = 0.0;

        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] Array10;

            while ((line = br.readLine()) != null) {
                Array10 = line.split(delimiter);
                if (!line.contains("Latitude")) {
                    if (Array10[16].equals("Rear End")) {
                        rearend++;
                    }
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return rearend;
    }

    //finding rear end percentage using rear end method
    public static double RearEndPerecent() {

        double total = (RearEnd() / Total()) * 100;

        double percentage = Math.round(total * 100.0) / 100.0;

        return percentage;
    }

    //finding right angle
    public static double RightAngle() {

        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";

        double total = 0.0;

        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] Array11;

            while ((line = br.readLine()) != null) {
                Array11 = line.split(delimiter);
                if (!Array11[1].equals("Latitude")) {
                    if (Array11[16].equals("Right Angle")) {
                        total++;
                    }
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return total;
    }

    //using percentage method to find percentage
    public static double RightAnglePerecent() {

        double total = (RightAngle() / Total()) * 100;
        double percentage = Math.round(total * 100.0) / 100.0;

        return percentage;
    }

    //this part is for validation so bascially i have added the column i want access to so later I can iterate through it storing it basically
    //arraylist is in method name so i can access it later
    public static List<Double> Latitudes() {
        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";
        List<Double> latitudes = new ArrayList<>();
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] Array6;

            while ((line = br.readLine()) != null) {
                Array6 = line.split(delimiter);
                if (!Array6[0].contains("X")) {
                    latitudes.add(Double.parseDouble(Array6[1]));
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return latitudes;
    }

    //Im doing same thing for longitude
    //Im delcaring list here so it can be returned I need to use it later
    public static List<Double> Longitudes() {
        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";
        List<Double> longitudes = new ArrayList<>();
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] Array6;

            while ((line = br.readLine()) != null) {
                Array6 = line.split(delimiter);
                if (!Array6[0].contains("X")) {
                    longitudes.add(Double.parseDouble(Array6[0]));
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return longitudes;
    }
    
    //same thing for strings storing to use later
    public static List<String> Names() {
        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";
        List<String> names = new ArrayList<>();
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] Array6;

            while ((line = br.readLine()) != null) {
                Array6 = line.split(delimiter);
                if (!Array6[0].contains("X")) {
                    names.add(Array6[5]);
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return names;
    }

    public static void main(String[] args) {
        //to read user input scanner exist
        Scanner sc = new Scanner(System.in);


        String csvFile = "/home/nuhaimr/mywork/CrashData-500.csv";
        String delimiter = ",";


        //declaring values
        int choice;
        int select;
        double latitude;
        double longitude;

        do {

            //printing values & adding methods
            System.out.println("Welcome to the main road WA Crash program.There are a total of " + Total() + " accidents within this dataset");
            System.out.println("Please make a selection from the menu below");
            System.out.println(">1.Examine data in relationship to a specified location");
            System.out.println(">2.Examine data generally?");
            System.out.println(">3.Exit program");

            //reading users choice
            choice = sc.nextInt();

            if (choice == 1) {


                System.out.println("Enter latitude please?");
                latitude = sc.nextDouble();
                
                //now Im accessing the latitude validation method I made so itll check if its there in file
                for (int counter = 0; counter < Latitudes().size(); counter++) {
                   if (!Latitudes().contains(latitude)) {
                       System.out.println("Enter the correct latitude: ");
                       latitude = sc.nextDouble();
                   }
                }

                System.out.println("Enter longitude please?");
                longitude = sc.nextDouble();
                //doing same validating for longitude
                for (int counter = 0; counter < Longitudes().size(); counter++) {
                    if (!Longitudes().contains(longitude)) {
                        System.out.println("Enter the correct longitude: ");
                        longitude = sc.nextDouble();
                    } 
                }

                System.out.println("Enter location name please?");
                String RoadName = " ";
                //for two words not just one
                RoadName = sc.nextLine();
                RoadName += sc.nextLine();
                
                //same thing accessing that method i made to validate
                for (int counter = 0; counter < Names().size(); counter++) {
                    if (!Names().contains(RoadName)) {
                        System.out.println("Enter the correct name: ");
                        RoadName = sc.nextLine();
                    }
                }
                
                //calling to methods and printing
                System.out.println("Furthest accident from " + RoadName + " is " + furthest(latitude, longitude) + " away.");
                System.out.println("Closest accident from " + RoadName + " is " + closest(latitude, longitude) + " away.");
                System.out.println("Furthest fatal accident from " + RoadName + " is " + furthestFatal(latitude, longitude) + " away.");
                System.out.println("Closest fatal accident from " + RoadName + " is " + closestFatal(latitude, longitude) + " away.");
                System.out.println("Furthest hospital accident from " + RoadName + " is " + furthestHospitalFatal(latitude, longitude) + " away.");
                System.out.println("Closest hospital accident from " + RoadName + " is " + closestHospitalFatal(latitude, longitude) + " away.");
                System.out.println("Total number of accidents within 10km of " + RoadName + " is " + TenKm(latitude, longitude));
                System.out.println("Percentage of all accidents within 10km of " + RoadName + " is " + PercentTenKm(latitude, longitude) + "%");
                }


            else if (choice == 2) {
                //making a menu for option 2
                System.out.println("How would you like to see the summary of the data? Please make a selection from the menu below?");
                System.out.println(">1.Data displayed on the screen?");
                System.out.println(">2.Data displayed on the screen and written to file?");
                System.out.println(">3.Data written to file?");

                //reading users choice
                select = sc.nextInt();

                if (select == 1) {

                    //printing outcome adding methods
                    System.out.println("The total number of accidents: " + Total());
                    System.out.println("The total number of fatal accidents: " + Fatal());
                    System.out.println("The total number of fatal accidents as a percentage of all accidents: " + FatalPerecent() + "%");
                    System.out.println("The total number of hospital accidents: " + Hospital());
                    System.out.println("The total number of hospital accidents as a percentage of all accidents: " + HospitalPerecent() + "%");
                    System.out.println("The total number of Rear End accidents: " + RearEnd());
                    System.out.println("The total number of Rear End accidents as a percentage of all accidents: " + RearEndPerecent() + "%");
                    System.out.println("The total number of Right Angle accidents: " + RightAngle());
                    System.out.println("The total number of Right Angle accidents as a percentage of all accidents: " + RightAnglePerecent() + "%");

                } else if (select == 2) {
                    //priting same outcomes to be added to file
                    System.out.println("The total number of accidents: " + Total());
                    System.out.println("The total number of fatal accidents: " + Fatal());
                    System.out.println("The total number of fatal accidents as a percentage of all accidents: " + FatalPerecent() + "%");
                    System.out.println("The total number of hospital accidents: " + Hospital());
                    System.out.println("The total number of hospital accidents as a percentage of all accidents: " + HospitalPerecent() + "%");
                    System.out.println("The total number of Rear End accidents: " + RearEnd());
                    System.out.println("The total number of Rear End accidents as a percentage of all accidents: " + RearEndPerecent() + "%");
                    System.out.println("The total number of Right Angle accidents: " + RightAngle());
                    System.out.println("The total number of Right Angle accidents as a percentage of all accidents: " + RightAnglePerecent() + "%");

                    System.out.println("Enter the name of the file: ");
                    String name1 = sc.next();
                    //want the file to be a text file
                    name1 += ".txt";

                    //so that it can be added to file
                    FileOutputStream fileStrm = null;
                    PrintWriter pw;
  
                    //same thing 
                    try {
                        fileStrm = new FileOutputStream(name1);
                        pw = new PrintWriter(fileStrm);
                        pw.println("The total number of accidents: " + Total());
                        pw.println("The total number of fatal accidents: " + Fatal());
                        pw.println("The total number of fatal accidents as a percentage of all accidents: " + FatalPerecent() + "%");
                        pw.println("The total number of hospital accidents: " + Hospital());
                        pw.println("The total number of hospital accidents as a percentage of all accidents: " + HospitalPerecent() + "%");
                        pw.println("The total number of Rear End accidents: " + RearEnd());
                        pw.println("The total number of Rear End accidents as a percentage of all accidents: " + RearEndPerecent() + "%");
                        pw.println("The total number of Right Angle accidents: " + RightAngle());
                        pw.println("The total number of Right Angle accidents as a percentage of all accidents: " + RightAnglePerecent() + "%");
                        pw.close();
                    } catch (IOException e) {
                        if (fileStrm != null) {
                            try {
                                fileStrm.close();
                            } catch (IOException ex2) {
                            }
                        }
                        System.out.println("Error in writing to file:_");
                    }
                } else if (select == 3) {
                    //same way

                    System.out.println("Enter the name of the file: ");
                    String name1 = sc.next();
                    name1 += ".txt";

                    FileOutputStream fileStrm = null;
                    PrintWriter pw;

                    try {
                        fileStrm = new FileOutputStream(name1);
                        pw = new PrintWriter(fileStrm);
                        pw.println("The total number of accidents: " + Total());
                        pw.println("The total number of fatal accidents: " + Fatal());
                        pw.println("The total number of fatal accidents as a percentage of all accidents: " + FatalPerecent() + "%");
                        pw.println("The total number of hospital accidents: " + Hospital());
                        pw.println("The total number of hospital accidents as a percentage of all accidents: " + HospitalPerecent() + "%");
                        pw.println("The total number of Rear End accidents: " + RearEnd());
                        pw.println("The total number of Rear End accidents as a percentage of all accidents: " + RearEndPerecent() + "%");
                        pw.println("The total number of Right Angle accidents: " + RightAngle());
                        pw.println("The total number of Right Angle accidents as a percentage of all accidents: " + RightAnglePerecent() + "%");
                        pw.close();
                    } catch (IOException e) {
                        if (fileStrm != null) {
                            try {
                                fileStrm.close();
                            } catch (IOException ex2) {
                            }
                        }
                        System.out.println("Error in writing to file:_");
                    }
                }

            } else if (choice == 3) {
                System.out.println("Bye byeee it was nice knowing you");
            } else {
                System.out.println("Please enter a number between 1-3?");
            }
            //making sure user does not enter a int not part of menu option
        } while (choice != 3);

    }
}




     
     

