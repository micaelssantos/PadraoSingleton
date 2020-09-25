/**
 * Elabore uma classe Singleton chamada de AppInfo
 * no qual armazena informações gerais do contexto do app.
 * O mesmo deve ter métodos para retornar as dimensões horizontal e vertical da
 * tela e também o sistema operacional e a respectiva versão.
 *
 * @author micael.ssantos5
 */
package exemplosSingleton;

public class Ex02 {

    public static void main(String[] args) {

        System.out.println("*****************");
        System.out.println("Testa AppInfo");
        System.out.println("******************");
        AppInfo.GetInfo();

    }

}
