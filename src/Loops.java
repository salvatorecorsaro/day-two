import static java.lang.System.out;

public class Loops {

    public static void main(String[] args) throws InterruptedException {


        int counter = 100;
        do {

            if (counter % 10 == 0) out.println("counter is even" + counter);
            else out.println("counter is odd");

            Thread.sleep(100);
//            System.out.println(counter);
            counter--;

        } while(counter >= 0);
        out.println("You win! You are an HERO!");
    }
}
