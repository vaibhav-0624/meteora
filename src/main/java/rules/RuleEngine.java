package rules;


public class RuleEngine {
    public static void ruleEngine(String weather,double temperature) {
      
        if (weather.equals("cloudy") && temperature > 20 && temperature < 30) {
            System.out.print("animated windy photo");
        }
    }
    
}
