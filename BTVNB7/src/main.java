import java.util.Scanner;
public class main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sử dụng hàm for-if");
        Indexcharacter.indexfor();
        System.out.println("2. Sử dụng hàm while");
        Indexcharacter.indexwhile();
        System.out.println("3. Sử dụng hàm do-while");
        Indexcharacter.indexdowhile();
    }
}
