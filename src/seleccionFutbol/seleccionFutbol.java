package seleccionFutbol;

/**
 *
 * @author acabezaslopez
 */
public class seleccionFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Selecion sel = new Selecion(24, "Oscar", "Piñeiro", 21);
        System.out.println(sel.toString());
        sel.concentrarse();
        sel.viaxar();
        
        Xogador x1 = new Xogador(54, "Luis", "Fernández", 35, 13, "delantero");
        System.out.println(x1.toString());
        x1.concentrarse();
        x1.viaxar();

        Adestrador ad1 = new Adestrador(32, "Javier", "López", 65, "154");
        System.out.println(ad1.toString());
        ad1.concentrarse();
        ad1.viaxar();

        Masaxista mx1 = new Masaxista(34, "María", "García", 33, "fisioterapia", 5);
        System.out.println(mx1.toString());
        mx1.concentrarse();
        mx1.viaxar();
    }

}
