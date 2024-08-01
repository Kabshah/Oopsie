import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// SIGNUP FORM
class MyWindow extends JFrame {
    private JLabel heading;
    Font font = new Font("", Font.BOLD, 30);
    private JPanel mainPanel;
    private JLabel nameLabel, passwordLabel;
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JButton button1, button2;

    public MyWindow() {
        super.setTitle("Signup Form");
        super.setSize(500, 500);
        super.setLocation(200, 100);
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();
    }

    public void createGUI() {
        this.setLayout(new BorderLayout());
        heading = new JLabel("Signup Form");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);
        this.add(heading, BorderLayout.NORTH);

        // working with jpanel
        mainPanel = new JPanel();
        // setting layout of main panel
        mainPanel.setLayout(new GridLayout(3, 2));
        nameLabel = new JLabel("Enter name: ");
        nameLabel.setFont(font);

        passwordLabel = new JLabel("Enter password: ");
        passwordLabel.setFont(font);
        nameTextField = new JTextField();
        nameTextField.setFont(font);
        passwordField = new JPasswordField();
        passwordField.setFont(font);

        button1 = new JButton("Submit");
        button1.setFont(font);

        button2 = new JButton("Reset");
        button2.setFont(font);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameTextField.setText("");
                passwordField.setText("");
            }
        });

        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField);
        mainPanel.add(button1);
        mainPanel.add(button2);

        this.add(mainPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        MyWindow w = new MyWindow();
    }
}
