package javabasics.com;

public class SplitString 
{
	public static void main(String[] args)
	{
		String str = "2023-12-19 10:30:45 - [INFO] Application started successfully";

		String[] strArr = str.split(" - ", 2);

		String timestamp = strArr[0];
		String[] parts2 = strArr[1].split("\\] ", 2);

		// Extract the log level (remove the opening square bracket)
		String logLevel = parts2[0].substring(1);

		// Extract the message
		String message = parts2[1];

		//		Print the timestamp, log level, and the message
		//		System.out.println("Timestamp: " + timestamp);
		//		System.out.println("Log Level: " + logLevel);
		//		System.out.println("Message: " + message);


		String[] result = timestamp.split("\\s", 0);

		System.out.println(result[0] +" " +message);

	}
}
