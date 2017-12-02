package lab06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Suelene Sa
 *
 */
public class MinhaCDteca {

    List<CD> MeuCDs;

    public MinhaCDteca() {
        this.MeuCDs = new ArrayList<>();
    }

    public void adicionaCD(CD nome) {
        MeuCDs.add(nome);

    }

    public void adicionaCDs(CD[] nome) {
        MeuCDs.addAll(Arrays.asList(nome));
    }

    public CD removeCD(CD nome) {
        for (int i = 0; i < MeuCDs.size(); i++) {
            if (nome.equals(MeuCDs.get(i).getTítulo())) {
                MeuCDs.remove(nome);
                continue;
            }
            return nome;

        }
        return null;
    }

    public boolean removeCDs(CD[] nome) {
        int cont = 0;
        for (int i = 0; i < MeuCDs.size(); i++) {
            if (nome.equals(MeuCDs.get(i).getTítulo())) {
                MeuCDs.remove(nome);
                cont++;
            }
        }
        return cont >= 1;
    }

    public CD pesquisaCD(CD nome) {
        for (int i = 0; i < MeuCDs.size(); i++) {
            if (nome.equals(MeuCDs.get(i).getTítulo())) {
                // return nome;
            } else {
                return null;
            }
        }
        return nome;
    }

    public void numeroDeCDs() {
        System.out.println(MeuCDs.size());
    }

    @Override
    public String toString() {
        for (int i = 0; i < MeuCDs.size(); i++) {
            System.out.println(MeuCDs.get(i));
        }
        return super.toString();
    }

}
