import java.util.ArrayList;

public class Professor extends Usuario {
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Professor(int id, String username,int password,String nome){
        super(id,username,password,nome);
    }

    public ArrayList<Aluno> conferirAlunos(Disciplina disciplina){
        return disciplina.getAlunos();
    }
    public boolean vincularEmDisciplina(Disciplina disciplina){
        disciplina.matricularProfessor(new Professor(getId(),getUsername(),getPassword(),getNome()));
        disciplinas.add(disciplina);
        return true;
    }
}
