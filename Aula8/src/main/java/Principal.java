public class Principal {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Luis",40,5000,1234,"12345678",10000);
        Estagiario e1 = new Estagiario("Joao", 20,20,5678);

        Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[0] = g1;
        funcionarios[1] = e1;

        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] instanceof Gerente) {
                Gerente gerente = (Gerente) funcionarios[i];
                gerente.apresentar();
                //System.out.println("Salario: " + gerente.calculaSalarioMes());
            }
            if (funcionarios[i] instanceof Estagiario) {
                Estagiario estagiario = (Estagiario) funcionarios[i];
                //estagiario.fazCafe();
            }
        }
        for(Funcionario funcionario: funcionarios) {
            if (funcionario instanceof Gerente) {
                Gerente gerente = (Gerente) funcionario;
                gerente.apresentar();
                //System.out.println("Salario: " + gerente.calculaSalarioMes());
            }
            if (funcionario instanceof Estagiario) {
                Estagiario estagiario = (Estagiario) funcionario;
                //estagiario.fazCafe();
            }
        }
    }
}
