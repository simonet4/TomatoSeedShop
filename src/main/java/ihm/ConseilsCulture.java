package ihm;

import javax.swing.*;
import java.awt.*;

public class ConseilsCulture {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                JFrame frame = new JFrame("Conseils de Culture");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600, 500);
                frame.setLocationRelativeTo(null);
                
                JPanel panel = new JPanel();
                frame.getContentPane().add(panel, BorderLayout.NORTH);
                panel.setLayout(new BorderLayout(0, 0));
                
                JScrollPane scrollPane = new JScrollPane((Component) null);
                scrollPane.setToolTipText(		"Conseils de culture\n\n" +
											    "Semis : mars-avril\n" +
											    "Repiquage : après les gelées\n" +
											    "Récolte : juillet à septembre, voire octobre\n\n" +
											    "Semis :\n" +
											    "Démarrez vos semis en petite terrine dès mars / avril (15/20° nuit et jour), dans du terreau à semis, sous une épaisseur de 0,5 cm, tassez légèrement et humidifiez.\n" +
											    "Repiquer vos semis lorsqu'ils font 5 cm, dans des godets avec du terreau pour semis ou fumier ou compost, enterrer jusqu'à première feuille.\n\n" +
											    "Après les Saints de glaces, plantez vos pieds de tomates dès qu'ils atteignent 15 cm, les espacer d'au moins 50 cm.\n" +
											    "Les planter profondément dans un trou avec du fumier ou compost au fond.\n" +
											    "Tuteurez-les dès la plantation avec des tuteurs d'une hauteur espacés de 70 cm.\n\n" +
											    "Arrosez abondamment les premiers jours puis arrosez les 15 jours suivants sans mouiller le feuillage.\n\n" +
											    "Pensez à pailler ! ainsi vous garderez beaucoup plus facilement..."
											);
                frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
