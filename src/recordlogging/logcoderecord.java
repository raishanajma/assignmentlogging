package recordlogging;
import org.apache.logging.log4j.*;

public class logcoderecord {
	private static Logger loggingcode = LogManager.getLogger(logcoderecord.class.getName());
	public static void main (String[] args) {
		loggingcode.info("Success");
		loggingcode.error("Error");
		loggingcode.debug("Debug");
		loggingcode.fatal("Error");
		loggingcode.info("Success");
		loggingcode.error("Error");
		loggingcode.debug("Debug");
		loggingcode.fatal("Error");
		loggingcode.info("Success");
		loggingcode.error("Error");
		loggingcode.debug("Debug");
		loggingcode.fatal("Error");
		loggingcode.info("Success");
		loggingcode.error("Error");
		loggingcode.debug("Debug");
		loggingcode.fatal("Error");
	}
}