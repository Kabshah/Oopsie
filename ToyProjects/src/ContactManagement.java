import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ContactManagement {
    final JFrame frame;
    final JTextField nameField;
    final JTextField phoneField;
    final JTextField emailField;
    final JTextArea displayArea;

    public ContactManagement() {
        frame = new JFrame("Contact Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Create form panel
        JPanel formPanel = new JPanel(new GridLayout(3, 2));

        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Phone:"));
        phoneField = new JTextField();
        formPanel.add(phoneField);

        formPanel.add(new JLabel("Email:"));
        emailField = new JTextField();
        formPanel.add(emailField);

        frame.add(formPanel, BorderLayout.NORTH);

        // Create display area
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        frame.add(new JScrollPane(displayArea), BorderLayout.CENTER);

        // Create button panel
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add Contact");
        addButton.addActionListener(new AddButtonListener());
        buttonPanel.add(addButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();

            displayArea.append("Name: " + name + "\n");
            displayArea.append("Phone: " + phone + "\n");
            displayArea.append("Email: " + email + "\n\n");

            // Clear fields
            nameField.setText("");
            phoneField.setText("");
            emailField.setText("");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ContactManagement::new);}}