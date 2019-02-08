public class WeatherConditionals
{
    private int temperature = 0;
    private String description = "";
    private int windchill = 0;
    private int humidity = 0;
    
    public static String getWeatherAdvice(int temperature, String description){
        boolean windy = false;
        //return(temperature + "°F" + " and " + description);
        if (description == "windy" || description == "snow" || temperature < 32) 
            return("Too windy or too cold! It's best to watch the weather through the window. It is currently " + temperature + "°F and " + description + " outside.");
        else 
            return("You're okay to go outside! It is currently " + temperature + "°F" + " and " + description + " outside. Enjoy your day!");
    }
    
    public static String getHikingAdvice(int temperature,int windchill, int humidity, String description){
        if (temperature > 82 || temperature < 43)
            return("We advise against going hiking, this weather is not ideal for it.");
        else if (humidity >= 63)
            return("We advise against going hiking, the humidity might affect your well being while hiking.");
        else if (windchill <=32)
            return("We advise against going hiking, the windchill makes it feel very cold");
        else if (description.indexOf("storm") != -1 || description.indexOf("rain") != -1 || description.indexOf("snow") != -1 || description.indexOf("hurricane") != -1 || description.indexOf("tornado") != -1)
            return("We advise against going hiking, this weather is not ideal for hiking.");
        else 
            return("Enjoy Hiking!");
    }
}