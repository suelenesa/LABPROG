package lab06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Suelene Sa
 *
 */


public class MinhaCDteca {
    

    private final List<CD> MeuCDs;
    
    /**
     *
     */
    public MinhaCDteca() {
        this.MeuCDs = new ArrayList<>();
    }

    /**
     *
     * @param nome
     */
    public void adicionaCD(CD nome) {
        MeuCDs.add(nome);

    }

    /**
     *
     * @param nome
     */
    public void adicionaCDs(CD[] nome) {
        MeuCDs.addAll(Arrays.asList(nome));
    }

    /**
     *
     * @param nome
     * @return
     */
    public String removeCD(String nome) {
        for (int i = 0; i < MeuCDs.size(); i++) {
            if (nome.equals(MeuCDs.get(i).getTítulo())) {
                MeuCDs.remove(nome);
                continue;
            }
            return nome;

        }
        return null;
    }

    /**
     *
     * @param nome
     * @return
     */
    public boolean removeCDs(CD[] nome) {
        int cont = 0;
        for (int i = 0; i < MeuCDs.size(); i++) {
            if (nome.equals(MeuCDs.get(i).getTítulo())) {
                boolean remove = MeuCDs.remove(nome);
                cont++;
            }
        }
        return cont >= 1;
    }

    /**
     *
     * @param nome
     * @return
     */
    public String pesquisaCD(String nome) {
        for (int i = 0; i < MeuCDs.size(); i++) {
            if (nome.equals(MeuCDs.get(i).getTítulo())) {
                            } else {
                return null;
            }
        }
        return nome;
    }

    /**
     *
     */
    public void numeroDeCDs() {
        System.out.println(MeuCDs.size());
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        for (int i = 0; i < MeuCDs.size(); i++) {
            System.out.println(MeuCDs.get(i));
        }
        return super.toString();
    }

}
