package no.hvl;

import javax.swing.*;
import java.awt.*;

public class Brett extends JFrame {

    private final Rute[] ruter = new Rute[101];      // 1–100
    private final JButton[] ruteKnapper = new JButton[101];

    public Brett() {
        setTitle("Stigespill");
        setSize(650, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lagRuter();
        lagEksempelStiger();

        JPanel brettPanel = new JPanel(new GridLayout(10, 10));
        lagBrettGUI(brettPanel);

        add(brettPanel);
        setVisible(true);
    }

    private void lagRuter() {
        for (int i = 1; i <= 100; i++) {
            ruter[i] = new Rute(i);
        }
    }

    private void lagEksempelStiger() {
        ruter[3].setTeleportTil(22);   // stige
        ruter[17].setTeleportTil(4);   // slange
        ruter[28].setTeleportTil(84);  // stige
    }

    private void lagBrettGUI(JPanel brettPanel) {
        for (int i = 100; i >= 1; i--) {
            JButton btn = new JButton(String.valueOf(i));
            btn.setFocusPainted(false);

            final int ruteNr = i;
            btn.addActionListener(e -> {
                Rute r = ruter[ruteNr];
                JOptionPane.showMessageDialog(this, r.toString());
            });

            if (ruter[i].getTeleportTil() != 0) {
                btn.setBackground(Color.LIGHT_GRAY);
                btn.setOpaque(true);
            }

            ruteKnapper[i] = btn;
            brettPanel.add(btn);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater
