package Task2;

public abstract class Beverages {
    private boolean wantsExtras=true;

     public void boidWather(){
         System.out.println("Boiling water");

     }
     public void pourInCup(){
         System.out.println("Pouring into cup");

     }
     public final void finalTemplateMethod(){
         boidWather();
         brew();
         pourInCup();
         addCondiments();
         if (wantsExtras){
             addExtras();
         }

     }



     abstract void brew();
     abstract void addCondiments();
     abstract void addExtras();


    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }
}
