package model;

import java.util.HashMap;
import java.util.Map;

public class FilialFactory {

    private static FilialFactory instance = new FilialFactory();

    public static FilialFactory getInstance() {
        return instance;
    }

    private static Map<String, Filial> filiais = new HashMap<>();

    public static Filial getFilial(String codigo, String nome) {
        Filial filial = filiais.get(codigo);

        if (filial == null) {
            filial = new Filial(codigo, nome);
            filiais.put(codigo, filial);
        }
        return filial;
    }

    public static int getTotalFiliais() {
        return filiais.size();
    }

    public static void setListaVazia() {
        filiais.clear();
    }
}
