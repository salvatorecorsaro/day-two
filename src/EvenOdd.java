public class EvenOdd {
    public static void main(String[] args) {
        int random;
        int evenCount=0;
        int oddCount=0;

        for (int i = 0; i < 10000000; i++) {
            random = (int)(Math.random()*10+1);

            if (random%2 == 0) {
                evenCount++;
            } else oddCount++;
        }

        System.out.println("Generados 100 numeros");

        System.out.println("Even: " + evenCount+ "\nOdd: "+ oddCount);
        if ( evenCount == oddCount) {
            System.out.println("Draw");
        } else {
            System.out.println(evenCount>oddCount?"Even Wins!":"Odd Wins!");
        }


    }




}
