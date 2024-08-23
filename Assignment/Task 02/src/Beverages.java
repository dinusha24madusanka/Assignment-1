abstract class Beverages{
    boolean wantsExtras;

    abstract void brew();
    abstract void addCondiments();
    abstract void addExtras();

    void boilwater(){
        System.out.println("Boiling water");
    }
    void pourIncup(){
        System.out.println("Pouring into cup");
    }
    void setWantsExtras(boolean wantsExtras){
        this.wantsExtras = wantsExtras;
    }
    final void finalTemplateMethod(){
        boilwater();
        brew();
        pourIncup();
        addCondiments();
        if(wantsExtras){
            addExtras();
        }
    }
}