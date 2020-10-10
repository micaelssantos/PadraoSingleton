package exemplosSingleton;

/**
 * Crie uma classe no padrão Singleton chamada de UserPreferences. Ela deve
 * armazenar informações da sessão atual, tal como nome de usuário, senha,
 * timestamp da última entrada no sistema e perfil de usuário (administrador ou
 * operador). Um método estático deve retornar todas as informações sobre a
 * sessão. Todos os dados podem ser gerados de maneira fictícia para o teste.
 *
 * @author micael.ssantos5
 */
public class Ex01 {

    public static void main(String[] args) {

        System.out.println("*****************");
        System.out.println("Testa 1");
        UserPreferences.getData();

        System.out.println("*****************");
        System.out.println("Testa 2");
        UserPreferences.getData();
    }

}
