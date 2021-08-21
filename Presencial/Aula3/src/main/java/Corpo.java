public class Corpo {
    Perna p1;

    Corpo() {
        p1 = new Perna();
    }

    void andar() {
        System.out.println("Esta andando");
    }
    void andar(Perna perna) {
        System.out.println("Esta andando com perna " + perna.toString());
    }
}
