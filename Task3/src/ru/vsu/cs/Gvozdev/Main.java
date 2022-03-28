package ru.vsu.cs.Gvozdev;

public class Main {

    public static void main(String[] args) {

        ru.vsu.cs.util.SwingUtils.setDefaultFont("Microsoft Sans Serif", 18);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ru.vsu.cs.Gvozdev.FrameMain().setVisible(true);
            }
        });

    }
}
