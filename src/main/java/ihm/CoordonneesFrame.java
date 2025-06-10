package ihm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CoordonneesFrame extends JDialog {
    private JTextField txtNom;
    private JTextField txtPrenom;
    private JTextField txtAdresse1;
    private JTextField txtAdresse2;
    private JTextField txtCodePostal;
    private JTextField txtVille;
    private JTextField txtTelephone;
    private JTextField txtMail;

    public CoordonneesFrame(JFrame parent) {
        super(parent, "Ô'Tomates", true);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setSize(520, 550);
        setLocationRelativeTo(parent);
        getContentPane().setLayout(null);

        JLabel lblCoordonnees = new JLabel("Vos coordonnées");
        lblCoordonnees.setForeground(new Color(34, 139, 34));
        lblCoordonnees.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblCoordonnees.setBounds(160, 10, 200, 30);
        getContentPane().add(lblCoordonnees);

        JLabel lblNom = new JLabel("Nom :");
        lblNom.setBounds(30, 60, 100, 20);
        getContentPane().add(lblNom);

        txtNom = new JTextField();
        txtNom.setBounds(150, 60, 300, 20);
        getContentPane().add(txtNom);

        JLabel lblPrenom = new JLabel("Prénom :");
        lblPrenom.setBounds(30, 90, 100, 20);
        getContentPane().add(lblPrenom);

        txtPrenom = new JTextField();
        txtPrenom.setBounds(150, 90, 300, 20);
        getContentPane().add(txtPrenom);

        JLabel lblAdresse1 = new JLabel("Adresse 1 :");
        lblAdresse1.setBounds(30, 120, 100, 20);
        getContentPane().add(lblAdresse1);

        txtAdresse1 = new JTextField();
        txtAdresse1.setBounds(150, 120, 300, 20);
        getContentPane().add(txtAdresse1);

        JLabel lblAdresse2 = new JLabel("Adresse 2 :");
        lblAdresse2.setBounds(30, 150, 100, 20);
        getContentPane().add(lblAdresse2);

        txtAdresse2 = new JTextField();
        txtAdresse2.setBounds(150, 150, 300, 20);
        getContentPane().add(txtAdresse2);

        JLabel lblCodePostal = new JLabel("Code postal :");
        lblCodePostal.setBounds(30, 180, 100, 20);
        getContentPane().add(lblCodePostal);

        txtCodePostal = new JTextField();
        txtCodePostal.setBounds(150, 180, 300, 20);
        getContentPane().add(txtCodePostal);

        JLabel lblVille = new JLabel("Ville :");
        lblVille.setBounds(30, 210, 100, 20);
        getContentPane().add(lblVille);

        txtVille = new JTextField();
        txtVille.setBounds(150, 210, 300, 20);
        getContentPane().add(txtVille);

        JLabel lblTelephone = new JLabel("Téléphone :");
        lblTelephone.setBounds(30, 240, 100, 20);
        getContentPane().add(lblTelephone);

        txtTelephone = new JTextField();
        txtTelephone.setBounds(150, 240, 300, 20);
        getContentPane().add(txtTelephone);

        JLabel lblMail = new JLabel("Mail :");
        lblMail.setBounds(30, 270, 100, 20);
        getContentPane().add(lblMail);

        txtMail = new JTextField();
        txtMail.setBounds(150, 270, 300, 20);
        getContentPane().add(txtMail);
        
        JPanel panelPaiement = new JPanel();
        panelPaiement.setForeground(new Color(34, 139, 34));
        panelPaiement.setBorder(BorderFactory.createTitledBorder("Moyen de paiement"));
        panelPaiement.setBounds(30, 310, 420, 60);
        getContentPane().add(panelPaiement);
        panelPaiement.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JRadioButton rdbCarte = new JRadioButton("Carte de crédit");
        panelPaiement.add(rdbCarte);

        JRadioButton rdbPaypal = new JRadioButton("Paypal");
        panelPaiement.add(rdbPaypal);

        JRadioButton rdbCheque = new JRadioButton("Chèque");
        panelPaiement.add(rdbCheque);

        ButtonGroup bgPaiement = new ButtonGroup();
        bgPaiement.add(rdbCarte);
        bgPaiement.add(rdbPaypal);
        bgPaiement.add(rdbCheque);

        JPanel panelNewsletter = new JPanel();
        panelNewsletter.setBorder(BorderFactory.createTitledBorder("Abonnement à notre Newsletter"));
        panelNewsletter.setBounds(30, 380, 420, 60);
        getContentPane().add(panelNewsletter);
        panelNewsletter.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JRadioButton rdbOui = new JRadioButton("Oui");
        panelNewsletter.add(rdbOui);

        JRadioButton rdbNon = new JRadioButton("Non");
        panelNewsletter.add(rdbNon);

        ButtonGroup bgNewsletter = new ButtonGroup();
        bgNewsletter.add(rdbOui);
        bgNewsletter.add(rdbNon);

        JButton btnOK = new JButton("OK");
        btnOK.setBounds(270, 460, 80, 30);
        getContentPane().add(btnOK);

        JButton btnAnnuler = new JButton("Annuler");
        btnAnnuler.setBounds(360, 460, 100, 30);
        getContentPane().add(btnAnnuler);

        btnAnnuler.addActionListener(e -> dispose());

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = txtNom.getText();
                String prenom = txtPrenom.getText();
                String adresse1 = txtAdresse1.getText();
                String adresse2 = txtAdresse2.getText();
                String codePostal = txtCodePostal.getText();
                String ville = txtVille.getText();
                String telephone = txtTelephone.getText();
                String mail = txtMail.getText();

                String htmlContent = "<html>" +
                		"<head>" +
                		"<title>Facture</title>" +
                		"<style>" +
                		"body { font-family: 'Segoe UI', sans-serif; background-color: #f8f9fa; margin: 0; padding: 40px; }" +
                		
               			"h1 { text-align: center; color: #2c3e50; margin-bottom: 30px; }" +
                		"table { width: 100%; border-collapse: collapse; }" +
                		"td.label { font-weight: bold; background-color: #ecf0f1; padding: 10px; width: 35%; color: #2c3e50; }" +
                		"td.value { background-color: #fdfdfd; padding: 10px; color: #34495e; }" +
                		"tr:nth-child(even) td { background-color: #f8f8f8; }" +
                		".print-btn { background-color: #3498db; color: white; padding: 12px 20px; border: none; border-radius: 5px; font-size: 16px; cursor: pointer; margin: 30px auto 0; display: block; }" +
                		".print-btn:hover { background-color: #2980b9; }" +
                		".footer { text-align: center; font-size: 12px; color: #999; margin-top: 40px; }" +
                		"@media print { .print-btn { display: none; } body { padding: 0; background: white; } }" +
                		"</style>" +
                		"</head>" +
                		"<body>" +
                		
                		"<h1>Facture</h1>" +
                		"<table>" +
                		"<tr><td class='label'>Nom :</td><td class='value'>" + nom + "</td></tr>" +
                		"<tr><td class='label'>Prénom :</td><td class='value'>" + prenom + "</td></tr>" +
                		"<tr><td class='label'>Adresse 1 :</td><td class='value'>" + adresse1 + "</td></tr>" +
                		"<tr><td class='label'>Adresse 2 :</td><td class='value'>" + adresse2 + "</td></tr>" +
                		"<tr><td class='label'>Code postal :</td><td class='value'>" + codePostal + "</td></tr>" +
                		"<tr><td class='label'>Ville :</td><td class='value'>" + ville + "</td></tr>" +
                		"<tr><td class='label'>Téléphone :</td><td class='value'>" + telephone + "</td></tr>" +
                		"<tr><td class='label'>Mail :</td><td class='value'>" + mail + "</td></tr>" +
                		"</table>" +
                		"<button class='print-btn' onclick='window.print()'>🖨️ Imprimer la facture</button>" +
                		"<div class='footer'>Merci pour votre confiance. Cette facture a été générée automatiquement.</div>" +
                		"</div>" +
                		"</body>" +
                		"</html>";



                try {
                    File htmlFile = new File("facture.html");
                    BufferedWriter writer = new BufferedWriter(new FileWriter(htmlFile));
                    writer.write(htmlContent);
                    writer.close();

                    Desktop.getDesktop().browse(htmlFile.toURI());
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(CoordonneesFrame.this, "Erreur lors de la création de la facture.", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            CoordonneesFrame dialog = new CoordonneesFrame(null);
            dialog.setVisible(true);
        });
    }
}
