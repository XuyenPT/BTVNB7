public class Indexcharacter {
    static String str = "You only live once, but if you do it right, once is enough";
    static void indexfor () {
        int dem=0;
        System.out.println("Các trị trí của o trong chuỗi:");
        for(int i = 0; i<str.length();i++) {
            if (str.charAt(i) == 'o'){
                System.out.print(i+ "\t");
                dem ++;
             }
        }
        System.out.println("\n Số lần kí tự o xuất hiện trong chuỗi là "+dem);
    }

    static void indexwhile (){
        int dem=0;
        int i=0;
        System.out.println("Các vị trí của o:");
        while (i<str.length()){
            if (str.charAt(i) == 'o'){
                System.out.print(i+ "\t");
                dem++;
            }
            i++;
        }
        System.out.println("\n SỐ lần kí tự o xuất hiện trong chuỗi là "+dem);
  }

  static void indexdowhile(){
        int dem = 0;
        System.out.println("Các vị trí của o:");
        int i = 0;
        do {
            if (str.charAt(i)=='o'){
                System.out.print(i+ "\t");
                dem++;
            }
            i++;
        }
        while (i<str.length());
        System.out.println("\n Số lần xuất hiện kí tự o trong chuỗi là "+dem);
 }

}
