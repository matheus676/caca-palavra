import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CacaLetras {
    public CacaLetras() {

    }
    public List<String> buscaPalavras(char[][] letras, int linha, 
                                      int coluna,boolean[][] visitados,
                                      List<String> palavras){
        List<String> palvras = new ArrayList<>();
        if (visitados == null) {
            visitados = new boolean[letras.length][letras[0].length];
        }
        visitados[linha][coluna] = true;
        try {
            if (!visitados[linha-1][coluna-1]) {
                palvras.addAll(buscaPalavras(letras, linha-1, coluna-1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha-1][coluna]) {
                palvras.addAll(buscaPalavras(letras, linha-1, coluna, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha-1][coluna+1]) {
                palvras.addAll(buscaPalavras(letras, linha-1, coluna+1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }


        try {
            if (!visitados[linha][coluna-1]) {
                palvras.addAll(buscaPalavras(letras, linha, coluna-1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha][coluna+1]) {
                palvras.addAll(buscaPalavras(letras, linha, coluna+1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }



        try {
            if (!visitados[linha+1][coluna-1]) {
                palvras.addAll(buscaPalavras(letras, linha+1, coluna-1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha+1][coluna]) {
                palvras.addAll(buscaPalavras(letras, linha+1, coluna, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha+1][coluna+1]) {
                palvras.addAll(buscaPalavras(letras, linha+1, coluna+1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }


        List<String> temp = new ArrayList<>();
        for (String palavra : palvras) {
            temp.add(String.valueOf(letras[linha][coluna]) + palavra);
        }
        palvras.addAll(temp);
        if (palvras.isEmpty()) {
            palvras.add(String.valueOf(letras[linha][coluna]));
        }
        return palvras; 

    }

    public List<String> lerArquivo(){
        List<String> brsemacentos = new ArrayList<>();
        try{
        File file = new File("dicionario.txt");
        Scanner scanner = new Scanner(file);   
        while (scanner.hasNext()) {
            brsemacentos.add(scanner.next());
        }
        scanner.close();
    }catch (Exception e) {
        System.out.println("Erro ao ler arquivo");
        System.out.println(e.getMessage());
    } 
      return brsemacentos;
    }
}