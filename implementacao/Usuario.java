public abstract class Usuario {
    private int id;
    private String username;
    private int password;
    private String nome;
    public void login() {
    }

    public Usuario(int id, String username,int password,String nome){
        this.id = id;
        this.username = username;
        this.password = password;
        this.nome = nome;
    }
}
