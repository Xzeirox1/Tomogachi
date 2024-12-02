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
        System.out.println("|                                 |    \\_____/    |        |");
        System.out.println("|   4) stats                      \\               /        |");
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
                        "|1.Wasser      :"+Inventar.sws+"         |         5.Müsli     :"+Inventar.sms+"     |\r\n" + //
                        "|2.Cola        :"+Inventar.scl+"         |         6.Burger    :"+Inventar.sbg+"     |\r\n" + //
                        "|3.Orangensaft :"+Inventar.sos+"         |         7.Salat     :"+Inventar.ssl+"     |\r\n" + //
                        "|4.WStrank     :"+Inventar.swtrank+"         |         8.EStrank   :"+Inventar.setrank+"     |\r\n" + //
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
