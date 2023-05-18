/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
  import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class NewClass {
  

    public static void main(String[] args) {
        JFrame frame = new JFrame("AutoComplete Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel
        JPanel panel = new JPanel();

        // Unos teksta
        JTextField textField = new JTextField(20);

        // Lista rezultata
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> resultList = new JList<>(listModel);

        // Dodavanje elemenata u listu
        listModel.addElement("Apple");
        listModel.addElement("Banana");
        listModel.addElement("Orange");
        listModel.addElement("Pineapple");
        listModel.addElement("Strawberry");

        // Postavljanje layouta panela
        panel.setLayout(new BorderLayout());

        // Dodavanje komponenti u panel
        panel.add(textField, BorderLayout.NORTH);
        panel.add(new JScrollPane(resultList), BorderLayout.CENTER);

        // Dodavanje panela u prozor
        frame.getContentPane().add(panel);

        // Slušač za promene teksta u polju
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateResults();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateResults();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateResults();
            }

            // Metoda za ažuriranje rezultata
            private void updateResults() {
                String prefix = textField.getText().toLowerCase();
                List<String> filteredList = new ArrayList<>();

                // Filtriranje elemenata koji počinju na uneti prefiks
                for (int i = 0; i < listModel.getSize(); i++) {
                    String element = listModel.getElementAt(i);
                    if (element.toLowerCase().startsWith(prefix)) {
                        filteredList.add(element);
                    }
                }

                // Ažuriranje prikazane liste rezultata
                resultList.setListData(filteredList.toArray(new String[0]));
            }
        });

        // Postavljanje veličine prozora i prikazivanje
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

