package exemplosSingleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author micael.ssantos5
 */
public class UserPreferences {

    public static String username = "Micael Santos";
    public static String password = "@Tst@123";
    DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    static LocalDateTime now = LocalDateTime.now();
    public static String timestamp = now.toString();
    public static String type = "Operador";

    private UserPreferences() {

    }

    public static void getData() {

        System.out.println("Usuario: " + username
                + "\nSenha: " + password
                + "\nHorário Sessão: " + timestamp
                + "\nPerfil: " + type
        );

    }

}
