package lab06;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um CD de músicas.
 * @aluna Suelene Sa
 *
 */
public class CD {

    private String artista;
    private String título;
    private String trilhaprincipal;
    private int Mfaixas;
    private final List<String> listmusicas;
    private final int M = 10;
    
   
    /*Construtor que recebe o título e o artista do CD como parametro.*/

    /**
     *
     * @param título
     * @param artista
     * @throws Exception
     */

     public CD(String título, String artista) throws Exception {
        this.listmusicas = new ArrayList<>();
        if (artista != null || título != null) {
            this.artista = artista;
            this.título = título;
            this.Mfaixas = 10;
        } else {
            throw new Exception(" Error: O Artista ou nome do album é nulo.");
        }
    }

    public String getArtista() {/*Retorna o artista CD*/
        return artista;
    }

    public String getTrilhaprincipal() {/*Retorna a principal musica do CD*/
        return trilhaprincipal;
    }

    public int getMfaixas() {/*Retorna um conjunto de musicas que compe o album*/
        return Mfaixas;
    }

    public String getTítulo() {/*Retorna o título do CD*/
        return título;
    }

    /* Metodo modificador para trilha principal*/
    public boolean setTrilhaprincipal(String trilhaprincipal) {
        for (int i = 0; i < listmusicas.size(); i++) {
            if ((listmusicas.get(i)).equals(trilhaprincipal)) {
                this.trilhaprincipal = trilhaprincipal;
                return true;
            }
        }

        System.out.println("\n Não foi possível realizar a operação, esta música não está no álbum!");
        return false;

    }

    public void cadastrarMusica(String nome) {
        listmusicas.add(nome);

    }

    public void exibirMusica(int i) {
        int num = i - 1;
        if (num < listmusicas.size()) {
            System.out.println(listmusicas.get(num));
        } else {
            System.out.println("\nEsta faixa não existe!");
        }
    }

    public String listarMusicas() {
        for (int i = 0; i < listmusicas.size(); i++) {
            int faixa = i + 1;
            System.out.println(faixa + " - " + listmusicas.get(i));
        }

        /**
         *
         * @return
         */
     
    @Override
        public String toString(){
                StringBuilder string = new StringBuilder();
		string.append("Artista: "+getArtista());
		string.append("\nTítulo: ").append(getTítulo());
                string.append("\n\nLista de músicas: ");
            
            
            for (int i = 0; i < listmusicas.size(); i++) {
                int faixa = i + 1;
                System.out.println(faixa + " - " + listmusicas.get(i));
            }
            return string.toString();
        }

    }

    
}

   



