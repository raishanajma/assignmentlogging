package logassignment;
import org.apache.logging.log4j.*;

public class logcode {
	private static Logger loggingcode = LogManager.getLogger(logcode.class.getName());
	public static void main (String[] args) {
		loggingcode.info("Success");
		loggingcode.error("Error");
		loggingcode.debug("Debug");
		loggingcode.fatal("Error");
	}
}