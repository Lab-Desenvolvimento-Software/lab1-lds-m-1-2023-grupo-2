public class Aplicacao {
    public static void main(String[] args) {
        Secretaria manager = new Secretaria(1, "gilda", 123, "Gilda");
        Aluno everton = manager.cadastrarAluno(1,"everto",12345, "Everton");
        Curso engenharia = new Curso(1,"Engenharia",100);
        Disciplina tiaw = new Disciplina("TIAW", false,"01/01/2023","01/02/2023",25);
        engenharia.addDisciplina(tiaw);
        everton.vincularEmCurso(engenharia);
        System.out.println(everton.matricularEmDisciplina(tiaw,"02/01/2023"));
        System.out.println(tiaw.matriculaAtiva());
    }
}
