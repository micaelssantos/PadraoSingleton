package exemplosSingleton;

/**
 *
 * @author micael.ssantos5
 */
public class AppInfo {

    public static String horizontal = "1366";
    public static String vertical = "728";
    public static String so = "Ubuntu Linux";
    public static String version = "18.0.118";

    private AppInfo() {
        
    }
    
    
    public static void GetInfo(){
    
                System.out.println("Temanho Horizontal: " + horizontal
                + "\nTamanho Vertical: " + vertical
                + "\nSistema Operacional: " + so
                + "\nVersão: "+ version);
    
    }

}
