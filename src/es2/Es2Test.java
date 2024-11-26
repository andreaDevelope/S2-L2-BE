package es2;

import java.util.*;

public class Es2Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserici di quanti numeri vuoi la tua lista");
        int x = sc.nextInt();
        sc.nextLine();
        Set<Integer> listaNumeriRnd = new TreeSet<>();

        es2(listaNumeriRnd, x);
        es2P2(listaNumeriRnd);
    }

    public static void es2(Set<Integer> param, int x){
        Random rnd = new Random();
        int count = 1;
        while(count <= x){
            int numRnd = rnd.nextInt(0, 100);
            param.add(numRnd);
            count++;
        }
    }

    public static void es2P2(Set<Integer> param){
        Set<Integer> listaNumeriRnd2 = new TreeSet<>();
        listaNumeriRnd2.addAll(param);
        Set<Integer> listaNumeriRnd3 = new TreeSet<>(Comparator.reverseOrder());
        listaNumeriRnd3.addAll(param);
        List<Integer> listaDoppioOdinamento = new ArrayList<>(1);
        listaDoppioOdinamento.addAll(listaNumeriRnd2);
        listaDoppioOdinamento.addAll(listaNumeriRnd3);
        System.out.println(listaDoppioOdinamento);
    }
}
