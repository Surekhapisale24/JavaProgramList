package basicprograms.com;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class MessageWindow extends JFrame {
	    private JTextArea messageArea; // Text area for displaying messages
	    private JTextField inputField; // Text field for user input

	    public MessageWindow() {
	        setTitle("Message Passing Window");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(400, 300);
	        setLocationRelativeTo(null);

	        // Create components
	        messageArea = new JTextArea();
	        messageArea.setEditable(false); // Make the text area read-only

	        JScrollPane scrollPane = new JScrollPane(messageArea); // Add scroll functionality

	        inputField = new JTextField();
	        JButton sendButton = new JButton("Send");

	        // Set layout
	        setLayout(new BorderLayout());
	        add(scrollPane, BorderLayout.CENTER);

	        JPanel bottomPanel = new JPanel(new BorderLayout());
	        bottomPanel.add(inputField, BorderLayout.CENTER);
	        bottomPanel.add(sendButton, BorderLayout.EAST);
	        add(bottomPanel, BorderLayout.SOUTH);

	        // Action listener for the send button
	        sendButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String message = inputField.getText();
	                appendMessage("You: " + message);
	                inputField.setText(""); // Clear input field after sending the message
	            }
	        });
	    }

	    // Method to append a message to the message area
	    private void appendMessage(String message) {
	        messageArea.append(message + "\n");
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new MessageWindow().setVisible(true); // Create and display the window
	            }
	        });
	    }
	}


