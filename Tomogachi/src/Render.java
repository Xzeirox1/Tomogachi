public class Render {

    public static void Menu()
    {

        System.out.println(" __________________________________________________________");
        System.out.println("|                                                          |");
        System.out.println("|                                      _______             |");
        System.out.println("|                                   .-'       `-.          |");
        System.out.println("|                                  /             \\         |");
        System.out.println("|   1) füttern                    |    O     O    |        |");
        System.out.println("|   2) spielen                    |       ^       |        |");
        System.out.println("|   3) baden                      |    \\_____/    |        |");
        System.out.println("|   4) gesundheit                 \\              /         |");
        System.out.println("|   5) shop                         `-._______.-'          |");
        System.out.println("|                                                          |");
        System.out.println("|__________________________________________________________|");
    }
    

    public static void Stats()
    {
        System.out.println("__________________________________________________________");
        System.out.println("|                                                         |");
        System.out.println("|   _________              _________                      |");
        System.out.println("|  |___"+Stats.swb+"___| Wasser     |___"+Stats.slp+"___| LP     _________    |");
        System.out.println("| _________              _________          |__"+Stats.sdreck+"__|   |");
        System.out.println("||___"+Stats.shb+"___| Hunger     |___"+Stats.sspass+"___| Spaß       Dreck      |");
        System.out.println("|                                                         |");
        System.out.println("|/////////////////////////////////////////////////////////|");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|_________________________________________________________|");
    }

    public static void Essen(){
        System.out.println(" __________________________________________________________\r\n" + //
                        "|                                                          |\r\n" + //
                        "|     Getränke                               Essen         |\r\n" + //
                        "|--------------------       |         -------------------- |\r\n" + //
                        "|                           |                              |\r\n" + //
                        "|Wasser      :"+Inventar.sws+"           |         Müsli     :"+Inventar.sms+"       |\r\n" + //
                        "|Cola        :"+Inventar.scl+"           |         Burger    :"+Inventar.sbg+"       |\r\n" + //
                        "|Orangensaft :"+Inventar.sos+"           |         Salat     :"+Inventar.ssl+"       |\r\n" + //
                        "|WStrank     :"+Inventar.swtrank+"           |         EStrank   :"+Inventar.setrank+"       |\r\n" + //
                        "|                                                          |\r\n" + //
                        "|                                                          |\r\n" + //
                        "|                                                          |\r\n" + //
                        "|__________________________________________________________|");
    }

    public static void Waschen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

}
