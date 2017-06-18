/**
 * Created by lchar on 17.06.2017.
 */
class Horse {
    enum kolory {WHITE, RED, BLACK, MUDDY}
    public void speak() {
        System.out.println("I'm regular horse");
    }
}

class Arab extends Horse {
    Color col = new Color();

    @Override
    public void speak() {
        System.out.println("I'm arabic horse, man!");

    }

    class Color {
        kolory color;
        Color() {
            color = kolory.BLACK;
        }


        public void show() {
            System.out.println(color);

        }


    }
}

public class casting {


    public static void main(String[] args) {
        Horse horse1 = new Arab();
        horse1.speak();

//        Arab horse2 = new Arab();
//        ((Horse)horse2).speak();

//        Horse horse3c = new Horse();
//        horse3.speak();
//        ((Arab) horse3).speak();

        Arab arab = new Arab() {
            @Override
            public void speak() {
                System.out.println("Arab for Christ Sake");
            }

        };

        arab.speak();
        arab.col.show();


//        int a = 4;
//        String b = "1";
//
//        System.out.println(a + (int) b);

    }

}
