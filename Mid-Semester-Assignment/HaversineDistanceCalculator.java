public class HaversineDistanceCalculator
{
    public static void main(String[] args)
    {
        //London: 51.5085, -0.1257
        //Paris: 48.8534, 2.3488
        System.out.println("The distance between two lat and long is: " + haverSineDistance(51.5085, -0.1257, 48.8534, 2.3488) + "kms.");
    }

    public static double haverSineDistance(double lat1, double lon1, double lat2, double lon2)
    {
        final int EARTHRADIUS = 6371; // Radious of the earth
        double latDistance = convertToRadians(lat2 - lat1);
        double lonDistance = convertToRadians(lon2 - lon1);
        double a = (Math.sin(latDistance / 2) * Math.sin(latDistance / 2)) + (Math.cos(convertToRadians(lat1)) * Math.cos(convertToRadians(lat2)) * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2));
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double distance = EARTHRADIUS * c;
        return distance;
    }
 
    private static double convertToRadians(double value)
    {
        return value * Math.PI / 180;
    }
}