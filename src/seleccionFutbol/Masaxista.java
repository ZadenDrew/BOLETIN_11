package seleccionFutbol;

/**
 *
 * @author acabezaslopez
 */
public class Masaxista extends Selecion {

    private String titulacion;
    private int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(int id, String nome, String apelido, int edade,String titulacion,int anosExperiencia) {
        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;

    }
    
    public void darMasaxes() {
    }

    @Override
    public String toString() {
        return ("Masaxista:\n"+super.toString() + "\ntitulacion :"+titulacion+"\nanosexperiencia :" + anosExperiencia);
    }

    @Override
    public void viaxar() {
        System.out.print("viaxan os xogadores.....\n");
    }

}
