public abstract class Usuario {
    private int id;
    private String username;
    private int password;
    private String nome;

    public boolean login(int password) {
        if(password == this.password){
            return true;
        }
        return false;
    }

    public Usuario(int id, String username,int password,String nome){
        this.id = id;
        this.username = username;
        this.password = password;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public String getNome() {
        return nome;
    }
}
