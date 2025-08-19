import java.util.scanner;
public class control{
    public static void main(String[]){
    Scanner newscanner = new Scanner(System.in);
    System.out.print(s:"what is our height: ");
    float height = newscanner.nextFloat();
    if(height < 6.0){
        System.out.println(x:"you are short");

    }
    else if (height >= 6.0 && height < 6.5) {
        System.out.println("you are average height");
    }
    else {
        System.out.println(x:"you are tall");
    }

    }
}

