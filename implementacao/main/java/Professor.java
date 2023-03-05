import java.util.ArrayList;

public class Professor extends Usuario {
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Professor(int id, String username,int password,String nome){
        super(id,username,password,nome);
    }

    public void vincularEmDisciplina(){

    }
}
