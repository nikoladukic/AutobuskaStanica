
package main;

import form.FrmIzmeniAutobus;
import form.FrmLogin;
import form.FrmMain;
import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class Main {

    public static void main(String[] args) {
         new FrmLogin(new JFrame(), true).setVisible(true);
    }
}
