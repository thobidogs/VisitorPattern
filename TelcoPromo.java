public class TelcoPromo {
    public static void main(String[] args) {
      TelcoSubscription smart = new TelcoSubscription(15, 500, "Smart",false);
      TelcoSubscription globe = new TelcoSubscription(10, 450, "Globe",true);
      TelcoSubscription ditto = new TelcoSubscription(8, 400, "Ditto",true);
  
      UsagePromo promo = new TelcoAllowance();
      UnliCallTextPackage unli = new UnliCallTextPackage();    
  
      System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(smart.getTelcoName(), smart.getPrice()));
      System.out.println("Globe Data Usage Offer and price" + promo.showAllowance(globe.getTelcoName(), globe.getPrice()));
      System.out.println("Ditto Data Usage Offer and price" + promo.showAllowance(ditto.getTelcoName(), ditto.getPrice()));
  
      System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallTextOffer(smart.getTelcoName(), smart.getUnliCallText()));

      System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallTextOffer(globe.getTelcoName(), globe.getUnliCallText()));

      System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallTextOffer(ditto.getTelcoName(), ditto.getUnliCallText()));
    }
  }