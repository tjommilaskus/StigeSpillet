package no.hvl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String navn[] = {"martin","tobias"};
        Stigespill stigespill = new Stigespill();
        stigespill.spill(2, navn);

    }
}
