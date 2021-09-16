import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Source source = new Source();
        Listener listener1 = new Listener();
        source.addMyListener(listener1);

        while (true){
            System.out.print("Enter Score ");
            Scanner sc = new Scanner(System.in);
            String score = sc.nextLine();
            if (score.equals("")){
                break;
            }
            source.setSource(score);
        }
    }
}
