/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import form.FrmMainServer;
import form.FrmMainServer;
import form.FrmSettings;
import javax.swing.JFrame;
import server.Server;

/**
 *
 * @author Cartman
 */
public class Main {
    public static void main(String[] args) {
        new FrmSettings(new JFrame(), true).setVisible(true);
       
    }
}
