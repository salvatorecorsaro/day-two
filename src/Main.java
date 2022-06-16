public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");


//        Create a method named productFormatter that receives a String name productName
//        and a String date as parameters. This method should return the productName trimmed, change
//        spaces by _ and append the date at the end of the string. The result must be given in uppercase.

        System.out.println(productFormatter("          Clean Code", "16-06-22"));

    }
    public static String productFormatter(String productName, String date){
        var r = productName.trim().replace(' ', '_').concat(date).toUpperCase();

//        var myBigClassWithAVeryLongName = new MyBigClassWithAVeryLongName();
        return r;
    };

    public static void printHello(){
        System.out.println("Hello!!");
    }
}