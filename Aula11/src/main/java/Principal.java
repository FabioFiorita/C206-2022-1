import java.util.*;

public class Principal {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add(90);
        lista.add(false);
        lista.add(6.5);
        lista.add("String");

        //System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            //System.out.println(lista.get(i));
        }

        //lista.clear();
        lista.remove(false);
        lista.remove(1);
        //System.out.println(lista);

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(4);
        numeros.add(30);
        numeros.add(90);
        numeros.add(1);
        numeros.add(75);
        numeros.add(32);

//        System.out.println(numeros);
//        Collections.sort(numeros);
//        System.out.println(numeros);
//        Collections.reverse(numeros);
//        System.out.println(numeros);


        ArrayList<Aluno> alunos = new ArrayList<>();

        Aluno a1 = new Aluno("Joao",1234);
        Aluno a3 = new Aluno("Jose",1564);
        Aluno a2 = new Aluno("Julia",9876);

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);

        for(Aluno aluno: alunos) {
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Matricula: " + aluno.matricula);
        }

        System.out.println("-------------------");
        Collections.sort(alunos);

        for(Aluno aluno: alunos) {
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Matricula: " + aluno.matricula);
        }

        alunos.remove(a2);
//        System.out.println("Possui o aluno: " + alunos.contains(a1));
//        System.out.println("Esta vazio: " + alunos.isEmpty());
//        System.out.println("Index do a3: " + alunos.indexOf(a3));

        Map<String, String> cidades = new HashMap<>();
        cidades.put("Santa Rita do Sapucai", "MG");
        cidades.put("Pouso Alegre", "MG");
        cidades.put("Sao Paulo", "SP");

//        System.out.println(cidades);
//        System.out.println(cidades.keySet());
//        System.out.println(cidades.values());

        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(10);
        inteiros.add(2);
        inteiros.add(2);
        inteiros.add(4);
//        System.out.println(inteiros);
    }
}
