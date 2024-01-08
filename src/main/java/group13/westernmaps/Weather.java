/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package group13.westernmaps;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
/**
 *
 * @author Robert Ghita
 */
public class Weather {

    /**
     * Fetches JSON via GET request with the API URL
     * @param apiUrl
     * @return String
     * @throws IOException
     */
    public static String getJsonFromApi(String apiUrl) throws IOException {

        URL url = new URL(apiUrl);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");

        BufferedReader in;

        in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String inputLine;

        StringBuilder content = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close();

        con.disconnect();

        return content.toString();
    }

    /**
     * Returns the Temperature from the JSON object
     * @param json
     * @return double
     */
    public static double getTemperature(String json) {
        JSONObject obj = new JSONObject(json);
        return obj.getJSONObject("main").getDouble("temp");
    }

    /**
     * Returns the "Feels like" temperature from the JSON object
     * @param json
     * @return double
     */
    public static double getFeelsLike(String json) {
        JSONObject obj = new JSONObject(json);
        return obj.getJSONObject("main").getDouble("feels_like");
    }

    /**
     * Returns the Humidity from the JSON object
     * @param json
     * @return int
     */
    public static int getHumidity(String json) {
        JSONObject obj = new JSONObject(json);
        return obj.getJSONObject("main").getInt("humidity");
    }

    /**
     * Returns the current weather condition (cloudy, sunny, rain etc) from the JSON object
     * @param json
     * @return String
     */
    public static String getWeatherMain(String json) {
        JSONObject obj = new JSONObject(json);
        return obj.getJSONArray("weather").getJSONObject(0).getString("main");
    }
    
    

    public class WeatherApp {
        
        
    
}
    
    public String getWeather() {
        
        
        
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=London,ca&APPID=a18fc1e399b0d6a304468c00cf2370c7&units=metric";
        try {
            String weatherInfo = Weather.getJsonFromApi(apiUrl);
            String toReturn=("Temperature: " + Weather.getTemperature(weatherInfo) + "°C"+"\n")+
                    ("Feels like: " + Weather.getFeelsLike(weatherInfo) + "°C\n");/*+
                    ("Humidity: " + Weather.getHumidity(weatherInfo) + "%"+"\n")+
                    ("Weather condition: " + Weather.getWeatherMain(weatherInfo)+"\n");*/
            return toReturn;
            
            
        } catch (IOException e) {
            return ("Failed to fetch weather information: ");
        }
    }
    
}