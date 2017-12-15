package seleccionFutbol;

/**
 *
 * @author acabezaslopez
 */
public class Selecion {

    private int id;
    private String nome;
    private String apelido;
    private int edade;

    public Selecion() {
    }

    public Selecion(int id, String nome, String apelido, int edade) {

        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public int getEdade() {
        return edade;
    }

    public void setId() {
        this.id = id;
    }

    public void setNome() {
        this.nome = nome;
    }

    public void setApelido() {
        this.apelido = apelido;
    }

    public void setEdade() {
        this.edade = edade;
    }

    public void concentrarse() {
        System.out.print("concentrarse a selección\n");
    }

    public void viaxar() {
        System.out.print("viaxa a selección\n");
    }

    @Override
    public String toString() {
        return ("id :" + id + "\nnome :" + nome + "\napelido :" + apelido + "\nedade:" + edade);
    }
}
