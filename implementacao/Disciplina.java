import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome;
    private boolean optativa;
    private String datainiciomatricula;
    private static String datafimmatricula;
    private boolean podematricular;
    private int creditos;
    private boolean ativa;
    private ArrayList<Aluno> alunos = new ArrayList<>();


    public boolean togglePodeMatricular(){

        return true;
    }

}
