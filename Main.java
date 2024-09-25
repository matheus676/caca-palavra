import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        char letras[][] = new char[4][3];
        letras[0][0] = 'e';
        letras[0][1] = 'l';
        letras[0][2] = 'i';
        letras[1][0] = 'j';
        letras[1][1] = 'e';
        letras[1][2] = 'p';
        letras[2][0] = 'a';
        letras[2][1] = 'f';
        letras[2][2] = 'e';
        letras[3][0] = 'o';
        letras[3][1] = 'n';
        letras[3][2] = 't';
        

        CacaLetras cacaLetras = new CacaLetras();
        List<String> dicionario = cacaLetras.lerArquivo();
        List<String> palavras = cacaLetras.buscaPalavras(letras, 0, 0, null, null);

        palavras.retainAll(dicionario);
        System.out.print("Palavras existentes: ");
        for(String palavraexistente: palavras){
         System.out.print( palavraexistente + ", "); 
        }
    }
}