package week06d05;

public class Biscuit {

   private BiscuitType type;
   private int gramAmount;

   public Biscuit(BiscuitType type, int gramAmount){
       this.type = type;
       this.gramAmount = gramAmount;
   }

   public static Biscuit of(BiscuitType type, int gramAmount){
        return new Biscuit(type,gramAmount);
   }

    public static void main(String[] args) {
        System.out.println(Biscuit.of(BiscuitType.PILOTA, 200));
    }
}
