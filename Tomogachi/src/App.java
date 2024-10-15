import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Test");
        Render.Menu();
        Menuinput();
    }
    public static void Menuinput(){
        Scanner hole = new Scanner(System.in);

        int x = hole.nextInt();

        switch (x) {
            case 1:
                Render.Waschen();
                Inventar.Rechn();
                Render.Essen(); 
                System.out.println("Option 1 ");
                break;
            case 2:
                Render.Waschen();
                System.out.println("Option 2 ");
                break;
            case 3:
                Render.Waschen();
                System.out.println("Option 3 ");
                break;
            case 4:
                Render.Waschen();
                Stats.Rechn();
                Render.Stats();
                break;
            case 9 :
                Render.Waschen();
                Render.Menu();
                break;
            default:
                System.out.println("Invalid option");
                break;
            
        }
     hole.close();
    }

}


