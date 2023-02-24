public class Exercise4_3 {
    public static void main(String[] args) {
        String atlantaGeorgia = "33.748783, -84.386330";
        String orlandoFlorida = "28.538336, -81.379234";
        String savannahGeorgia = "32.076176, -81.088371";
        String charlotteNorthCarolina = "35.227085, -80.843124";

        // Final the Earth's radius
        final double RADIUS_OF_EARTH = 6371.01;

        // Extract Latitude and Longitude as single values from each String
        int k = atlantaGeorgia.indexOf(',');
        String atlantaLat = atlantaGeorgia.substring(0, k);
        String atlantaLong = atlantaGeorgia.substring(k + 1);

        k = orlandoFlorida.indexOf(',');
        String orlandoLat = orlandoFlorida.substring(0, k);
        String orlandoLong = orlandoFlorida.substring(k + 1);

        k = savannahGeorgia.indexOf(',');
        String savannahLat = savannahGeorgia.substring(0, k);
        String savannahLong = savannahGeorgia.substring(k + 1);

        k = charlotteNorthCarolina.indexOf(',');
        String charlotteLat = charlotteNorthCarolina.substring(0, k);
        String charlotteLong = charlotteNorthCarolina.substring(k + 1);

        // Parse Latitude and Longitude as double from String
        double atlantaX = Double.parseDouble(atlantaLat);
        double atlantaY = Double.parseDouble(atlantaLong);

        double orlandoX = Double.parseDouble(orlandoLat);
        double orlandoY = Double.parseDouble(orlandoLong);

        double savannahX = Double.parseDouble(savannahLat);
        double savannahY = Double.parseDouble(savannahLong);

        double charlotteX = Double.parseDouble(charlotteLat);
        double charlotteY = Double.parseDouble(charlotteLong);

        // Convert the Latitude and Longitude to Radians from Degrees
        double atlantaXRadian = Math.toRadians(atlantaX);
        double atlantaYRadian = Math.toRadians(atlantaY);

        double orlandoXRadian = Math.toRadians(orlandoX);
        double orlandoYRadian = Math.toRadians(orlandoY);

        double savannahXRadian = Math.toRadians(savannahX);
        double savannahYRadian = Math.toRadians(savannahY);

        double charlotteXRadian = Math.toRadians(charlotteX);
        double charlotteYRadian = Math.toRadians(charlotteY);

        // Find the distance between the cities in order to find the area
        // Distance from Atlanta to Orlando
        double atlantaToOrlando = RADIUS_OF_EARTH * Math.acos(Math.sin(atlantaXRadian) * Math.sin(orlandoXRadian) +
                (Math.cos(atlantaXRadian) * Math.cos(orlandoXRadian) * Math.cos(atlantaYRadian - orlandoYRadian)));

        // Distance from Atlanta to Charlotte
        double atlantaToCharlotte = RADIUS_OF_EARTH * Math.acos(Math.sin(atlantaXRadian) * Math.sin(charlotteXRadian) +
                (Math.cos(atlantaXRadian) * Math.cos(charlotteXRadian) * Math.cos(atlantaYRadian - charlotteYRadian)));

        // Distance from Atlanta to Savannah
        double atlantaToSavannah = RADIUS_OF_EARTH * Math.acos(Math.sin(atlantaXRadian) * Math.sin(savannahXRadian) +
                (Math.cos(atlantaXRadian) * Math.cos(savannahXRadian) * Math.cos(atlantaYRadian - savannahYRadian)));

        // Distance from Orlando to Savannah
        double orlandoToSavannah = RADIUS_OF_EARTH * Math.acos(Math.sin(orlandoXRadian) * Math.sin(savannahXRadian) +
                (Math.cos(orlandoXRadian) * Math.cos(savannahXRadian) * Math.cos(orlandoYRadian - savannahYRadian)));

        // Distance from Charlotte to Savannah
        double charlotteToSavannah = RADIUS_OF_EARTH * Math.acos(Math.sin(charlotteXRadian) * Math.sin(savannahXRadian) +
                (Math.cos(charlotteXRadian) * Math.cos(savannahXRadian) * Math.cos(charlotteYRadian - savannahYRadian)));

        // Split the Distances and form 2 triangles and find their area
        // Triangle 1 will consist of Atlanta to Charlotte, Atlanta to Savannah, and Charlotte to Savannah
        double triangle1 = (atlantaToCharlotte + atlantaToSavannah + charlotteToSavannah) / 2;

        // Triangle 2 will consist of Atlanta to Orlando, Atlanta to Savannah, and Orlando to Savannah
        double triangle2 = (atlantaToOrlando + atlantaToSavannah + orlandoToSavannah) / 2;

        // Calculate the area of each triangle
        double triangle1Area = Math.pow(triangle1 * (triangle1 - atlantaToCharlotte) * (triangle1 - atlantaToSavannah) *
                (triangle1 - charlotteToSavannah), 0.5);
        double triangle2Area = Math.pow(triangle2 * (triangle2 - atlantaToOrlando) * (triangle2 - atlantaToSavannah) *
                (triangle2 - orlandoToSavannah), 0.5);
        // combine both triangle area to get total area
        double totalArea = triangle1Area + triangle2Area;

        // Display Result
        System.out.printf("The estimated area enclosed by these four cities is %.5f km", totalArea);
    }
}
