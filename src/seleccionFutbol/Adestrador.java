package seleccionFutbol;

/**
 *
 * @author acabezaslopez
 */
public class Adestrador extends Selecion {

    private String idFederacion;

    public Adestrador() {
    }

    public Adestrador(int id, String nome, String apelido, int edade,String idFederacion) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }

    public void dirixirPartido() {
    }

    public void dirixirAdestramento() {
    }

    @Override
    public String toString() {
        return ("Adestrador:\n"+super.toString() + "\nidFederacion :" + idFederacion);

    }

    @Override
    public void viaxar() {
        System.out.print("viaxan os xogadores.....\n");
    }
}
