package no.hvl;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

      int antall = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange spiller?"));
        String[] navn = new String[antall];

        for(int i = 0; i < navn.length; i++){
            navn[i] = JOptionPane.showInputDialog("Spiller"+(i+1)+"?");

        }

        Stigespill stigespill = new Stigespill();
        stigespill.spill(antall, navn);

    }
}
