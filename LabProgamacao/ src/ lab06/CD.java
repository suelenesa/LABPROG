package lab06;

import java.util.ArrayList;package lab06;

import java.util.ArrayList;
import java.util.List;

/**
 * @Suelene Sa
 *
 */
public class CD {

    public String artista;
    public String título;
    public String trilhaprincipal;
    int M;
    int Mfaixas;
    List<String> listmusicas = new ArrayList<>();
    private StringBuilder StringBuilder;

    public CD(String artista, String título, int M) throws Exception {

        if (artista != null || título != null) {

            this.artista = artista;
            this.título = título;
            this.Mfaixas = M;
        } else {
            throw new Exception("O Artista ou nome do album é nulo");

        }
    }

    public CD(String título, String artista) throws Exception {
        if (artista != null || título != null) {
            this.artista = artista;
            this.título = título;
            this.Mfaixas = 10;
        } else {
            throw new Exception(" Error: O Artista ou nome do album é nulo.");
        }
    }

    public String getArtista() {
        return artista;
    }

    public String geTrilhaprincipal() {
        return trilhaprincipal;
    }

    public int getMfaixas() {
        return Mfaixas;
    }

    public String getTítulo() {
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

   



