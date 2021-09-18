public class Principal {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[10];

        Aluno a1 = new Aluno();
        a1.setNome("Joao");
        a1.setCpf("123321123");
        a1.setIdade(18);
        a1.setCurso("GEC");
        a1.setMatricula(1234);

        Aluno a2 = new Aluno();
        a2.setNome("Maria");
        a2.setCpf("3121234212");
        a2.setIdade(20);
        a2.setCurso("GES");
        a2.setMatricula(5678);

        Professor p1 = new Professor();
        p1.setNome("Gabriel");
        p1.setCpf("7777777777");
        p1.setIdade(40);
        p1.setDisciplina("Fisica");
        p1.setSalario(5000);

        Professor p2 = new Professor();
        p2.setNome("Andre");
        p2.setCpf("8888888888");
        p2.setIdade(45);
        p2.setDisciplina("Calculo");
        p2.setSalario(10000);

        pessoas[0] = a1;
        pessoas[1] = a2;
        pessoas[2] = p1;
        pessoas[3] = p2;

        for(Pessoa pessoa:pessoas) {
            if(pessoa instanceof Aluno) {
                System.out.println("É um aluno");
                pessoa.apresentar();
            }
            if(pessoa instanceof Professor) {
                Professor professor = (Professor) pessoa; //Casting
                System.out.println("É um professor");
                professor.apresentar();
                professor.recebeSalario();
            }
        }


    }
}
