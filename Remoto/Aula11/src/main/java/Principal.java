import java.util.*;

public class Principal {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add(9);
        lista.add(false);
        lista.add(4.5);
        lista.add(1,5);

        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        lista.clear();
        lista.remove(false);
        lista.remove(0);
        System.out.println(lista);

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(30);
        numeros.add(2);
        numeros.add(1);
        numeros.add(16);

        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);
        Collections.reverse(numeros);
        System.out.println(numeros);

        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno a1 = new Aluno("Fabio",1553);
        Aluno a2 = new Aluno("Julia",1234);
        Aluno a3 = new Aluno("Gabriel",4321);

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        for(Aluno aluno:alunos) {
            System.out.println(aluno.nome);
            System.out.println(aluno.matricula);
        }
        System.out.println("-----------------------------");
        Collections.sort(alunos);
        for(Aluno aluno:alunos) {
            System.out.println(aluno.nome);
            System.out.println(aluno.matricula);
        }
        alunos.remove(a2);
        System.out.println(alunos.contains(a2));
        System.out.println(alunos.isEmpty());
        System.out.println(alunos.indexOf(a3));

        Map<String, String> cidades = new HashMap<>();
        cidades.put("Santa Rita do Sapucai","MG");
        cidades.put("Pouso Alegre","MG");
        cidades.put("Sao Jose dos Campos","SP");
        cidades.put("Sao Paulo","SP");

        System.out.println(cidades);
        System.out.println(cidades.keySet());
        System.out.println(cidades.values());

        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(3);
        inteiros.add(60);
        inteiros.add(3);
        inteiros.add(20);
        inteiros.add(14);

        System.out.println(inteiros);

    }
}
