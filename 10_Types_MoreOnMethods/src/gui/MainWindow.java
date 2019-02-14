package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import solution.financepart2.Account;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtAccountName;
	private JTextField txtAccountBalance;
	private Account[] accounts = new Account[2] ;
	private JLabel lblAcc1AccNo;
	private JLabel lblAcc1AccName;
	private JLabel lblAcc1AccBalance;
	private JLabel lblAcc2AccNo;
	private JLabel lblAcc2AccName;
	private JLabel lblAcc2AccBalance;
	private JButton btnTransfer;
	private JLabel lblTransferAmount;
	private JTextField txtTransferAmount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Windows\\Installer\\{90160000-0011-0000-1000-0000000FF1CE}\\graph.ico"));
		setTitle("Account Create Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(34, 46, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setBounds(34, 84, 46, 14);
		contentPane.add(lblBalance);
		
		txtAccountName = new JTextField();
		txtAccountName.setBounds(107, 43, 86, 20);
		contentPane.add(txtAccountName);
		txtAccountName.setColumns(10);
		
		txtAccountBalance = new JTextField();
		txtAccountBalance.setBounds(107, 81, 86, 20);
		contentPane.add(txtAccountBalance);
		txtAccountBalance.setColumns(10);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				getInputAndCreateAccount() ;
				
				AccountInfo dialog = new AccountInfo();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
//				
			}
		});
		btnCreateAccount.setBounds(269, 158, 140, 23);
		contentPane.add(btnCreateAccount);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnClose.setBounds(269, 227, 140, 23);
		contentPane.add(btnClose);
		
		lblAcc1AccNo = new JLabel("");
		lblAcc1AccNo.setBounds(34, 179, 65, 14);
		contentPane.add(lblAcc1AccNo);
		
		lblAcc1AccName = new JLabel("");
		lblAcc1AccName.setBounds(34, 204, 65, 14);
		contentPane.add(lblAcc1AccName);
		
		lblAcc1AccBalance = new JLabel("");
		lblAcc1AccBalance.setBounds(34, 236, 65, 14);
		contentPane.add(lblAcc1AccBalance);
		
		lblAcc2AccNo = new JLabel("");
		lblAcc2AccNo.setBounds(150, 179, 65, 14);
		contentPane.add(lblAcc2AccNo);
		
		lblAcc2AccName = new JLabel("");
		lblAcc2AccName.setBounds(150, 204, 65, 14);
		contentPane.add(lblAcc2AccName);
		
		lblAcc2AccBalance = new JLabel("");
		lblAcc2AccBalance.setBounds(150, 236, 65, 14);
		contentPane.add(lblAcc2AccBalance);
		
		btnTransfer = new JButton("Transfer");
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				transfer() ;
			}
		});
		btnTransfer.setEnabled(false);
		btnTransfer.setBounds(269, 192, 140, 23);
		contentPane.add(btnTransfer);
		
		lblTransferAmount = new JLabel("Transfer Amount");
		lblTransferAmount.setBounds(34, 131, 46, 14);
		contentPane.add(lblTransferAmount);
		
		txtTransferAmount = new JTextField();
		txtTransferAmount.setEnabled(false);
		txtTransferAmount.setBounds(107, 128, 86, 20);
		contentPane.add(txtTransferAmount);
		txtTransferAmount.setColumns(10);
	}

	protected void transfer() {
		Account.transfer(accounts[0], accounts[1], Double.parseDouble(txtTransferAmount.getText()) ) ;
		displayAccounts(2);
	}

	private void getInputAndCreateAccount() {
		System.out.println("I've been clicked!!!");
		String name = txtAccountName.getText() ;
		double balance = Double.parseDouble(txtAccountBalance.getText());
		if ( accounts[0] == null ) {
			accounts[0] = new Account(name, balance) ;
			displayAccounts(0);
		} else {
			accounts[1] = new Account(name, balance) ;
			displayAccounts(1);
			txtTransferAmount.setEnabled(true);
			btnTransfer.setEnabled(true);
		}
		
		
		
//		String msg = String.format("Account Number : %s\nName : %s\nBalance £%.2f"
//				, ac1.getAccNo(), ac1.getHolder(), ac1.getBalance() ) ;
//
//		JOptionPane.showMessageDialog(null,msg);
		
	}
	
	private void displayAccounts(int number ) {
		switch ( number ) {
		case 2 :
		case 1 :
			lblAcc2AccNo.setText(accounts[1].getAccNo());
			lblAcc2AccName.setText(accounts[1].getHolder());
			lblAcc2AccBalance.setText(Double.toString(accounts[1].getBalance()));
			
		case 0 :
			lblAcc1AccNo.setText(accounts[0].getAccNo());
			lblAcc1AccName.setText(accounts[0].getHolder());
			lblAcc1AccBalance.setText(Double.toString(accounts[0].getBalance()));
			
		
		}
//		for (int i = 0; i < accounts.length; i++) {
//			Account acc = accounts[i] ;
//			if ( i == 0 ) {
//				lblAcc1AccNo.setText(acc.getAccNo());
//				lblAcc1AccName.setText(acc.getHolder());
//				lblAcc1AccBalance.setText(Double.toString(acc.getBalance()));
//			} else {
//				lblAcc2AccNo.setText(acc.getAccNo());
//				lblAcc2AccName.setText(acc.getHolder());
//				lblAcc2AccBalance.setText(Double.toString(acc.getBalance()));
//			}
//		}
	}
}

