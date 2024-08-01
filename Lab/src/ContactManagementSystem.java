import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class ContactManagementSystem {
    final JFrame frame;
    final JTextField nameField;
    final JTextField phoneField;
    final JTextField emailField;
    final JTextArea displayArea;

    public ContactManagementSystem() {
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

            if (isValidEmail(email) && isValidPhone(phone)) {
                displayArea.append("Name: " + name + "\n");
                displayArea.append("Phone: " + phone + "\n");
                if (!email.isEmpty()) {
                    displayArea.append("Email: " + email + "\n");
                }
                displayArea.append("\n");

                // Clear fields
                nameField.setText("");
                phoneField.setText("");
                emailField.setText("");
            } else {
                String errorMessage = "Please enter a valid ";
                if (!isValidEmail(email)) {
                    errorMessage += "email address.";
                } else if (!isValidPhone(phone)) {
                    errorMessage += "phone number.";
                }
                JOptionPane.showMessageDialog(frame, errorMessage, "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }

        private boolean isValidEmail(String email) {
            if (email.isEmpty()) {
                return true;
            }
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            Pattern pattern = Pattern.compile(emailRegex);
            return pattern.matcher(email).matches();
        }

        private boolean isValidPhone(String phone) {
            String phoneRegex = "\\d+";
            Pattern pattern = Pattern.compile(phoneRegex);
            return pattern.matcher(phone).matches();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ContactManagementSystem::new);
    }
}