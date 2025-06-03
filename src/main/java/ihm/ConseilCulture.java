package ihm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class ConseilCulture extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConseilCulture dialog = new ConseilCulture();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConseilCulture() {
	    setBounds(100, 100, 500, 400);
	    getContentPane().setLayout(new BorderLayout());
	    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	    getContentPane().add(contentPanel, BorderLayout.CENTER);
	    String[] conseils = {
	        "Conseils de culture",
	        "",
	        "Semis : mars-avril",
	        "Repiquage : après les gelées",
	        "Récolte : juillet à septembre, voire octobre",
	        "",
	        "Semis :",
	        "Démarrez vos semis en terrine dès mars / avril...",
	        "Repiquer à 5 cm dans des godets...",
	        "",
	        "Après les Saints de glaces, planter à 15 cm...",
	        "Espacer de 50 cm, tuteurer à 70 cm...",
	        "",
	        "Arrosage abondant au début, sans mouiller le feuillage.",
	        "",
	        "Pensez à pailler !"
	    };
	    contentPanel.setLayout(null);

	    JList<String> list = new JList<>(conseils);
	    JScrollPane scrollPane = new JScrollPane(list);
	    scrollPane.setBounds(10, 132, 466, 190);
	    contentPanel.add(scrollPane); 
	    
	    JLabel lblNewLabel = new JLabel("Conseils de ");
	    lblNewLabel.setBounds(61, 30, 71, 13);
	    contentPanel.add(lblNewLabel);

	    JPanel buttonPane = new JPanel();
	    buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
	    getContentPane().add(buttonPane, BorderLayout.SOUTH);

	    JButton okButton = new JButton("OK");
	    okButton.setActionCommand("OK");
	    buttonPane.add(okButton);

	    JButton cancelButton = new JButton("Cancel");
	    cancelButton.setActionCommand("Cancel");
	    buttonPane.add(cancelButton);
	}
}
