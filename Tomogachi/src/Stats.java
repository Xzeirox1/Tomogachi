public class Stats {
    private static int lp=60; // 1-100
     public static String slp;
    private static int hb=5; // 1-100
    public static String shb;
    private static int wb=100; // 1-100
    public static String swb;
    private static String dreck = "ja"; // "ja" or "nein"
    public static String sdreck;
    private static int spass=40; // 1-100
    public static String sspass;

    public static void main(String[] args) {
        if (lp < 10) {
            slp = "00" + lp;
        } else if (lp < 100 && lp >= 10) {
            slp = "0" + lp;
        }

        if (hb < 10) {
            shb = "00" + hb;
        } else if (hb < 100 && hb >= 10) {
            shb = "0" + hb;
        }

        if (wb < 10) {
            swb = "00" + wb;
        } else if (wb < 100 && wb >= 10) {
            swb = "0" + wb;
        }

        if (dreck.equals("ja")) {
            sdreck = "Dirty";
        } else if (dreck.equals("nein")) {
            sdreck = "Clean";
        }

        if (spass < 10) {
            sspass = "00" + spass;
        } else if (spass < 100 && spass >= 10) {
            sspass = "0" + spass;
        }
    }
}