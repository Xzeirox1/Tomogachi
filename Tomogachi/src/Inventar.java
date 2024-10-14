public class Inventar {
//////////////////////////////////////////////////////////////////////////////////
public static int ws=10;
public static String sws;

public static int cl=20;
public static String scl;

public static int os;
public static String sos; //bitte rette mich!!!!!!!!!!

public static int wtrank=5;
public static String swtrank;
///////////////////////////////////////////////////////////////////////////////////
public static int ms=100;
public static String sms;

public static int bg=50;
public static String sbg;

public static int sl=60;
public static String ssl;

public static int etrank=22;
public static String setrank;



    public static void Rechn(){
        if (ws < 10) {
            sws = "00" + ws;
        } else if (ws < 100 && ws >= 10) {
            sws = "0" + ws;
        } else if (ws == 100) {
            sws = "" + ws;
        }
        
        if (cl < 10) {
            scl = "00" + cl;
        } else if (cl < 100 && cl >= 10) {
            scl = "0" + cl;
        } else if (cl == 100) {
            scl = "" + cl;
        }
        
        if (os < 10) {
            sos = "00" + os;
        } else if (os < 100 && os >= 10) {
            sos = "0" + os;
        } else if (os == 100) {
            sos = "" + os;
        }
        
        if (wtrank < 10) {
            swtrank = "00" + wtrank;
        } else if (wtrank < 100 && wtrank >= 10) {
            swtrank = "0" + wtrank;
        } else if (wtrank == 100) {
            swtrank = "" + wtrank;
        }
        
        if (ms < 10) {
            sms = "00" + ms;
        } else if (ms < 100 && ms >= 10) {
            sms = "0" + ms;
        } else if (ms == 100) {
            sms = "" + ms;
        }
        
        if (bg < 10) {
            sbg = "00" + bg;
        } else if (bg < 100 && bg >= 10) {
            sbg = "0" + bg;
        } else if (bg == 100) {
            sbg = "" + bg;
        }
        
        if (sl < 10) {
            ssl = "00" + sl;
        } else if (sl < 100 && sl >= 10) {
            ssl = "0" + sl;
        } else if (sl == 100) {
            ssl = "" + sl;
        }
        
        if (etrank < 10) {
            setrank = "00" + etrank;
        } else if (etrank < 100 && etrank >= 10) {
            setrank = "0" + etrank;
        } else if (etrank == 100) {
            setrank = "" + etrank;
        }
        
    }
}
