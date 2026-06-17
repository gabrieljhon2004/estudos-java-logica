package estrutura_condicional.validador_login;

public class ValidadorDeLogin {
    public static void main(String[] args) {
        String usuarioCadastrado =  "admin";
        String usuarioDigitado = new String("admin");

//        Se usarmos if (usuarioCadastrado == usuarioDigitado), o resultado será FALSO.
        if (usuarioCadastrado.equals(usuarioDigitado)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Usuário incorreto");
        }
    }
}
