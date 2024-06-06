package strings.com;

public class SplitString 
{
	public static void main(String[] args) 
	{
		String[] logEntries = {
	            "2023-12-19 10:30:45 - [INFO] Application started successfully",
	            "2023-12-19 11:15:20 - [ERROR] NullPointerException occurred",
	            "2023-12-19 12:05:55 - [WARN] Database connection timeout"
	        };
		
		 for (String entry : logEntries) {
	            // Check if the log entry contains the specific message
	            if (entry.contains("Application started successfully")) {
	                // Split the log entry into its components
	                String[] parts = entry.split(" - ");
	                if (parts.length == 2) {
	                    // Extract the date part and the message part
	                    String dateTime = parts[0];
	                    String messagePart = parts[1];

	                    // Split the dateTime to get the date only
	                    String date = dateTime.split(" ")[0];

	                    // Remove the log level from the message part
	                    String message = messagePart.replaceAll("\\[.*?\\] ", "");

	                    // Print the formatted output
	                    System.out.println(date + " " + message);
				}
			}
		}
	}
}
