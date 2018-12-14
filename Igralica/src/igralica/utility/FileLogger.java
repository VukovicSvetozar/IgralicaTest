package igralica.utility;

import java.io.IOException;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileLogger {

	private static final Logger logger = Logger.getLogger("/Zabiljeske/FileLogger");

	public static void log(Level level, String msg, Throwable thrown) {
		FileHandler fh = null;
		try {
			fh = new FileHandler("/Zabiljeske/log.xml", true);
			logger.setUseParentHandlers(false);
			logger.addHandler(fh);
			logger.log(level, msg, thrown);
		} catch (IOException | SecurityException e) {
			logger.log(Level.SEVERE, null, e);
		}
	}

}
