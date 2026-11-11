

package com.mycompany.fidness;


public class Fidness {

    public static void main(String[] args) {
        // Hace que la ventana de Login sea la primera en abrirse
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}
