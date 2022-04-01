public class Principal {
    public static void main(String[] args) {
        Escola escola = new Escola();
        escola.nome = "Inatel";
        escola.cidade = "Santa Rita do Sapucai";
        escola.anoCriacao = 1950;

//        Departamento departamento = new Departamento("RH",2000);
//        System.out.println(departamento.nome);
//        System.out.println(departamento.custoDeManuntencao);
//
//        departamento.fazerObra(500);
//        System.out.println(departamento.custoDeManuntencao);

        escola.departamento.nome = "Tesouraria";
        escola.departamento.custoDeManuntencao = 3000;

        System.out.println("Nome do departamento:" + escola.departamento.nome);

        Professor professor = new Professor();
        professor.nome = "Jose";
        professor.salario = 5000;
        professor.matricula = 1342;

        escola.departamento.professor = professor;

    }
}
