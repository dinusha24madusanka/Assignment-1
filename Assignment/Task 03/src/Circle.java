public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle:");
        int r = 7;
        int diameter = 2 * r + 1;

        for (int i = 0; i < diameter; i++) {
            {
                for (int j = 0; j < diameter; j++) {
                    int x = i - r;
                    int y = j - r;
                    if (x * x + y * y <= r * r * 0.8) {
                        System.out.println("* ");
                    } else {
                        System.out.println(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

