import java.util.*;
public class UnliCallTextPackage implements UnliCallOffer{

    private static Map<String, String> unliMap = new HashMap<>();

    static {
        unliMap.put("Smart", "No unli call and text");
        unliMap.put("Globe", "Unli calls and texts to same network");
        unliMap.put("Ditto", "Unli calls and texts to all networks within the country");
    }


    @Override
    public String showUnliCallTextOffer(String telcoName, boolean unli){
        return unliMap.get(telcoName);
        
    }
}