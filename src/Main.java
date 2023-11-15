import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 1 string. przenieś ostatnie 2 znaki na jego przód, pod warunkiem że tych znaków jest conajmniej 3
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj łańcuch znaków: ");
        String a = skaner.nextLine();
        String b = new String();
        if(a.length() >= 3){
            b = a.substring(a.length()-2) + a.substring(0, a.length()-2);
            System.out.println("Łańcuch po zmianie to: " + b);
        }
        else{
            System.out.println("Podany łańcuch znaków jest zbyt krótki");
        }

    }
}