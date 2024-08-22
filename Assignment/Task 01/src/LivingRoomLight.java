public class LivingRoomLight implements Light{
    private int brightness;

    String location = "Living Light";

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Living Light Is ON at full brightness"  + location);
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Living Light Is OFF"  + location);
    }

    @Override
    public void dim(int level) {
        brightness = level;
        System.out.println(("Living Light Dimmed to" + brightness + "%")  + location);
    }

    public int getBrightness(){
        return brightness;
    }

}


