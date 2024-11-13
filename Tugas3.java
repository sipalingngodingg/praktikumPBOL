import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Tugas3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout card = new CardLayout();
        JPanel mainPanel = new JPanel(card);

        // Panel LOGIN
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBorder(new EmptyBorder(20, 20, 20, 20));
        panel1.setBackground(new Color(135, 206, 235));

        JLabel loginLabel = new JLabel("MASUK");
        loginLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
        loginLabel.setForeground(Color.BLACK);

        JPanel formPanel1 = new JPanel(new GridBagLayout());
        formPanel1.setAlignmentX(Component.CENTER_ALIGNMENT);
        formPanel1.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridwidth = 2;

        // Email
        gbc.gridy = 0;
        JLabel emailLabel1 = new JLabel("Email :");
        emailLabel1.setForeground(Color.BLACK);
        formPanel1.add(emailLabel1, gbc);
        gbc.gridy = 1;
        JTextField emailField1 = new JTextField(20);
        formPanel1.add(emailField1, gbc);

        // Password
        gbc.gridy = 2;
        JLabel passwordLabel1 = new JLabel("Kata Sandi :");
        passwordLabel1.setForeground(Color.BLACK);
        formPanel1.add(passwordLabel1, gbc);
        gbc.gridy = 3;
        JPasswordField passwordField1 = new JPasswordField(20);
        formPanel1.add(passwordField1, gbc);

        JButton loginButton = new JButton("Masuk");
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel noaccLabel = new JLabel("Belum punya akun?");
        noaccLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        noaccLabel.setForeground(Color.BLACK);

        JButton noaccButton = new JButton("Daftar");
        noaccButton.addActionListener(e -> card.show(mainPanel, "panel2"));
        noaccButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel1.add(loginLabel);
        panel1.add(Box.createVerticalStrut(20));
        panel1.add(formPanel1);
        panel1.add(Box.createVerticalStrut(20));
        panel1.add(loginButton);
        panel1.add(Box.createVerticalStrut(10));
        panel1.add(noaccLabel);
        panel1.add(noaccButton);
        
        // Panel SIGN UP
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setBorder(new EmptyBorder(20, 20, 20, 20));
        panel2.setBackground(new Color(135, 206, 235));
        
        JLabel signupLabel = new JLabel("DAFTAR");
        signupLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        signupLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
        signupLabel.setForeground(Color.BLACK);
        
        JPanel formPanel2 = new JPanel(new GridBagLayout());
        formPanel2.setAlignmentX(Component.CENTER_ALIGNMENT);
        formPanel2.setOpaque(false);

        // Full name
        gbc.gridy = 0;
        JLabel nameLabel2 = new JLabel("Nama panjang : ");
        nameLabel2.setForeground(Color.BLACK);
        formPanel2.add(nameLabel2, gbc);
        gbc.gridy = 1;
        JTextField fullnameField = new JTextField(20);
        formPanel2.add(fullnameField, gbc);

        // Email
        gbc.gridy = 2;
        JLabel emailLabel2 = new JLabel("Email :");
        emailLabel2.setForeground(Color.BLACK);
        formPanel2.add(emailLabel2, gbc);
        gbc.gridy = 3;
        JTextField emailField2 = new JTextField(20);
        formPanel2.add(emailField2, gbc);

        // Password
        gbc.gridy = 4;
        JLabel passwordLabel2 = new JLabel("Kata Sandi :");
        passwordLabel2.setForeground(Color.BLACK);
        formPanel2.add(passwordLabel2, gbc);
        gbc.gridy = 5;
        JPasswordField passwordField2 = new JPasswordField(20);
        formPanel2.add(passwordField2, gbc);

        JButton signupButton = new JButton("Daftar");
        signupButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel haveaccLabel = new JLabel("Sudah punya akun?");
        haveaccLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        haveaccLabel.setForeground(Color.BLACK);

        JButton haveaccButton = new JButton("Masuk");
        haveaccButton.addActionListener(e -> card.show(mainPanel, "panel1"));
        haveaccButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel2.add(signupLabel);
        panel2.add(Box.createVerticalStrut(20));
        panel2.add(formPanel2);
        panel2.add(Box.createVerticalStrut(20));
        panel2.add(signupButton);
        panel2.add(Box.createVerticalStrut(10));
        panel2.add(haveaccLabel);
        panel2.add(haveaccButton);

        // Tambahkan panel ke CardLayout
        mainPanel.add(panel1, "panel1"); // Panel login menjadi yang pertama
        mainPanel.add(panel2, "panel2"); // Panel sign up menjadi yang kedua
        frame.add(mainPanel);

        card.show(mainPanel, "panel1"); // Tampilkan panel login terlebih dahulu

        frame.setVisible(true);
    }
}
