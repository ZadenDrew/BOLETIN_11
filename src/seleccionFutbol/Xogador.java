package seleccionFutbol;

/**
 *
 * @author acabezaslopez
 */
public class Xogador extends Selecion {

    int dorsal;
    String demarcacion;

    public Xogador() {
    }

    public Xogador(int id, String nome, String apelido, int edade,int dorsal,String demarcacion) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void xogarPartido() {
    }

    public void entrenar() {
    }

    @Override
    public void viaxar() {
        System.out.print("viaxan os xogadores.....\n");
    }

    @Override
    public String toString() {
        return ("Xogador:\n"+super.toString() + "\ndorsal : "+dorsal +"\ndemarcacion :" + demarcacion);
    }
}
