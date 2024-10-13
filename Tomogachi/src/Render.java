public class Render {

    public static void Menu()
    {

        System.out.println("__________________________________________________________");
        System.out.println("                                                          |");
        System.out.println("                                      _______             |");
        System.out.println("                                   .-'       `-.          |");
        System.out.println("                                  /             \\         |");
        System.out.println("   1) füttern                    |    O     O    |        |");
        System.out.println("   2) spielen                    |       ^       |        |");
        System.out.println("   3) baden                      |    \\_____/    |        |");
        System.out.println("   4) gesundheit                 \\              /         |");
        System.out.println("                                   `-._______.-'          |");
        System.out.println("                                                          |");
        System.out.println("__________________________________________________________|");
    }
    

    public static void Stats()
    {
        System.out.println("__________________________________________________________");
        System.out.println("                                                         |");
        System.out.println("   _______              _________                        |");
        System.out.println("  |__"+Stats.swb+"__| Wasser     |___"+Stats.slp+"___| LP       ________      |");
        System.out.println(" _________              _________          |__"+Stats.sdreck+"__|     |");
        System.out.println("|___"+Stats.shb+"___| Hunger     |___"+Stats.sspass+"___| Spaß      Dreck       |");
        System.out.println("                                                         |");
        System.out.println("/////////////////////////////////////////////////////////|");
        System.out.println("                                                         |");
        System.out.println("                                                         |");
        System.out.println("                                                         |");
        System.out.println("_________________________________________________________|");
    }

    public static void Waschen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

}
