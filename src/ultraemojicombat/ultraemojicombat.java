package ultraemojicombat;

public class ultraemojicombat {

    public static void main(String[] args) {
        Lutador[] l = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 1, 2);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.69f, 57.8f, 14, 3, 2);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 1, 2);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 2, 0);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 3, 4);
        l[5] = new Lutador("Nerdart", "EUA", 30, 1.81f, 105.7f, 12, 4, 2);

        Pessoa p = new Lutador("Inconnu", "Desconhecido", 99, 1.80f, 75.0f, 0, 0, 0);
        System.out.println("### APRESENTAÇÃO ###");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Nacionalidade: " + p.getNacionalidade());
        System.out.println("Idade: " + p.getIdade());

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
    }
}
