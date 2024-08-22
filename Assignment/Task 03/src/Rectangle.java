public class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Rectangle:");
        for (int i = 0; i < 3; i++);{
            for (int j = 0; j < 10; j++){
                System.out.println("* ");
            }
            System.out.println();
        }

    }
}
