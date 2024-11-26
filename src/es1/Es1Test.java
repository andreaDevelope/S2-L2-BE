package es1;

import java.util.*;

public class Es1Test {
    public static void main(String[] args) {
    es1();
    }

    public static void es1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("inserisci il numero di parole che vuoi inserire");
        int numeroIterazioni = sc.nextInt();
        sc.nextLine();
        int count = 1;
        Set<String> paroleDistinte = new HashSet<>();
        List<String> paroleDuplicate = new ArrayList<>(1);

        while(count <= numeroIterazioni){

            System.out.println("inserisci qui sotto la parola");
            String parola = sc.next();
            if(paroleDistinte.add(parola))
                paroleDistinte.add(parola);
            else paroleDuplicate.add(parola);
            count++;
        }

        System.out.println("queste sono le parole duplicate:" +
                "\n " + paroleDuplicate + "\nle parole distinte sono: " + paroleDistinte.size() +
                "\nquesta è la lista: " + paroleDistinte);
    }
}
