public class Square implements Shape{

    @Override
    public void draw(){
        System.out.println("Square:");
        for (int i = 0; i < 5; i++);{
            for (int j = 0; j < 5; j++){
                System.out.println("* ");
            }
            System.out.println();
        }

    }
}
