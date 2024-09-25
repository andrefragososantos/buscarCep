package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - ver. 1.0 ");
		lblNewLabel.setBounds(32, 31, 378, 20);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@Author André Fragoso");
		lblNewLabel_1.setBounds(32, 61, 365, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WEB Service:");
		lblNewLabel_2.setBounds(32, 84, 67, 13);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblGithub = new JLabel("republicavirtual.com.br");
		lblGithub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblGithub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://github.com/andrefragososantos");
			}
		});
		lblGithub.setForeground(SystemColor.textHighlight);
		lblGithub.setBounds(107, 84, 272, 13);
		getContentPane().add(lblGithub);
		
		JButton btnGithub = new JButton("");
		btnGithub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/andrefragososantos");
			}
		});
		btnGithub.setBackground(SystemColor.control);
		btnGithub.setToolTipText("Github");
		btnGithub.setMinimumSize(new Dimension(85, 21));
		btnGithub.setSize(new Dimension(32, 3));
		btnGithub.setMaximumSize(new Dimension(85, 21));
		btnGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGithub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGithub.setBorder(null);
		btnGithub.setPreferredSize(new Dimension(85, 21));
		btnGithub.setBounds(32, 162, 32, 32);
		getContentPane().add(btnGithub);

	}
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
