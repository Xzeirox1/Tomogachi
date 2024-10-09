public class App {
    private String name; /*  wird später mit txt datein oder .json für config gemacht*/
    private int alter;
    private int ver;   // 1 katze 2 Mensch 3 Roboter 4 Hund
    // Feste von spieler feststellbar
    /////////////
    // vom spiel festgestellte
    private int lp; // 1-100
    private int hb; // 1-100
    private static  int wb; //1-100
    private boolean dreck; // ja _ nein
    private int spass; // 1-100

    public static void main(String[] args)
    {
        System.out.println("Test");
        Render.Menu();
    }

}
