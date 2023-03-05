import java.util.ArrayList;

public class Aluno extends Usuario{
    private ArrayList<Curso> cursos= new ArrayList<Curso>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Aluno(int id, String username,int password,String nome){
        super(id,username,password,nome);
    }
    public void vincularEmCurso(){

    }
    public void matricularEmDisciplina(){

    }
    public void cancelarMatriculaEmDisciplina(){

    }
}
