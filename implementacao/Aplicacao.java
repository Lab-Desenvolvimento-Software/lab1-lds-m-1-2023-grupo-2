public class Aplicacao {
    public static void main(String[] args) {
        Secretaria manager = new Secretaria(1, "gilda", 123, "Gilda");
        Aluno everton = manager.cadastraAluno(1,"everto",12345, "Everton");
    }
}
