public class Visitante extends Pessoa {
    private String telefone;
    private String email;

    @Override
    public void apresentar() {
        System.out.println("Sou um visitante");
    }
}
