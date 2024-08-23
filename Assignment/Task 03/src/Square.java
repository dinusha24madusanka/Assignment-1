public class Square implements Shape{

    @Override
    public void draw(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
