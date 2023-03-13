import java.util.ArrayList;

public class Curso {
  private int id;
  private String nome;
  private int credito;
  private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

  public Curso(int id,String nome, int credito){
    this.id=id;
    this.nome=nome;
    this.credito=credito;
  }

  public void addDisciplina(Disciplina disciplina){
    disciplinas.add(disciplina);
  }

  public ArrayList<Disciplina> getDisciplinas() {
    return disciplinas;
  }
}
