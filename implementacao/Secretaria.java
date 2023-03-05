import java.lang.reflect.Array;
import java.util.ArrayList;

public class Secretaria extends Usuario {

    public Secretaria(int id, String username, int password, String nome){
        super(id,username,password,nome);
    }

    public Professor cadastrarProfessor(int id, String username,int password,String nome){
       return new Professor(id,username,password,nome);
    }
    public Aluno cadastraAluno(int id, String username,int password,String nome){
        return new Aluno(id,username,password,nome);
    }
    public Secretaria cadastrarSecretaria(int id, String username,int password,String nome){
        return new Secretaria(id,username,password,nome);
    }
}
