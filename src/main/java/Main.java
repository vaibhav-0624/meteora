import model.WeatherData;
import rules.RuleEngine;

public class Main {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        data.temperature = 25.5;
        data.weather = "cloudy";




        System.out.println(data.temperature);
        System.out.println(data.weather);
        RuleEngine.ruleEngine(data.weather, data.temperature);
  
    }}
