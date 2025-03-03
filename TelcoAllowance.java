import java.util.*;
public class TelcoAllowance implements UsagePromo{

    private static Map<String, Double> allowanceMap = new HashMap<>();

    static {
        allowanceMap.put("Smart", 15.0);
        allowanceMap.put("Globe", 10.00);
        allowanceMap.put("Ditto", 8.00);
    }


    @Override
    public String showAllowance(String telcoName, double price){
        return "Get " + allowanceMap.get(telcoName) + " GB for " + price;
    }
}