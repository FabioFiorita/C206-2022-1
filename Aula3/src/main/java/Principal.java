public class Principal {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        p1.nome = "Phyl";
        p1.salario = 500.99;
        p1.matricula = 1234;

        Departamento d1 = new Departamento();
        d1.nome = "Academico";
        d1.custoDeManutencao = 1500.99;
        d1.professor = p1;

        System.out.println(d1.professor.nome);

    }
}
