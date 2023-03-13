import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome;
    private boolean optativa;
    private Data datainiciomatricula;
    private static Data datafimmatricula;
    private int creditos;

    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();


    public Disciplina(String nome, boolean optativa, String datainiciomatricula, String datafimmatricula, int creditos){
        this.nome = nome;
        this.optativa = optativa;
        this.datainiciomatricula = Data.desformatarData(datainiciomatricula);
        this.datafimmatricula = Data.desformatarData(datafimmatricula);
        this.creditos = creditos;

    }

    public boolean togglePodeMatricularAluno(Data data){
        if(alunos.size()<=60){
             if(data.getMes() >= datainiciomatricula.getMes() && data.getMes()<= datafimmatricula.getMes()){
                 if(data.getMes()==datainiciomatricula.getMes()){
                     if(data.getDia() >= datainiciomatricula.getDia()){
                         return true;
                     }
                 }
                 if(data.getMes()==datafimmatricula.getMes()){
                     if(data.getDia() <= datafimmatricula.getDia()){
                         return true;
                     }
                 }
                 if(data.getDia() >= datainiciomatricula.getDia() && data.getDia()<= datafimmatricula.getDia()){
                     return true;
                 }
             }
        }
        return false;
    }

    public boolean matricularAluno(Aluno aluno, Data data){
        if(togglePodeMatricularAluno(data)==true){
            alunos.add(aluno);
            return true;
        }
        return false;
    }

    public boolean matricularProfessor(Professor professor){
        professores.add(professor);
        return true;
    }

    public boolean matriculaAtiva(){
        if(alunos.size()<3){
            return false;
        }
        return true;
    }


    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public boolean isOptativa() {
        return optativa;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }
}
