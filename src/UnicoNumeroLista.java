import java.util.ArrayList;
import java.util.List;

public class UnicoNumeroLista {
    public static int EncontrarUnico(int[] NumerosEntradas){
        List<Integer> ListaDeNumeros = new ArrayList<>();

        for(int numero : NumerosEntradas){
            if (ListaDeNumeros.contains(numero)){
                ListaDeNumeros.remove(Integer.valueOf(numero));
            } else{
                ListaDeNumeros.add(numero);
            }
        }
        return ListaDeNumeros.get(0);
    }
}


