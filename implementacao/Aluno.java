import java.util.ArrayList;

public class Aluno extends Usuario{
    private ArrayList<Curso> cursos= new ArrayList<Curso>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Aluno(int id, String username,int password,String nome){
        super(id,username,password,nome);
    }
    public void vincularEmCurso(Curso curso){
        cursos.add(curso);
    }
    public boolean matricularEmDisciplina(Disciplina disciplina, String data){
        for(Curso curso1:cursos){
            for(Disciplina disciplinacurso : curso1.getDisciplinas()){
                if(disciplinacurso==disciplina){
                    int obrigatorias=0;
                    int optativas=0;
                    for(Disciplina disciplinaaluno : disciplinas){
                        if(disciplinaaluno.isOptativa()==true){
                            optativas++;
                        }
                        else{
                            obrigatorias++;
                        }
                    }
                    Data diamatricula = Data.desformatarData(data);
                    if(disciplina.isOptativa()==true && optativas==2){
                        return false;
                    }
                    else{
                        if(disciplina.isOptativa()==false && obrigatorias==4){
                            return false;
                        }
                    }
                    if(disciplina.matricularAluno(new Aluno(getId(),getUsername(),getPassword(),getNome()),diamatricula)==true){
                        disciplinas.add(disciplina);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean cancelarMatriculaEmDisciplina(Disciplina disciplina, String data){
        if(disciplina.togglePodeMatricularAluno(Data.desformatarData(data))==true) {
            for (Aluno aluno : disciplina.getAlunos()) {
                if (aluno.getId() == getId()) {
                    disciplina.getAlunos().remove(aluno);
                    return true;
                }
            }
        }
        return false;
    }
}
