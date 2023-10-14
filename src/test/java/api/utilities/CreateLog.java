package api.utilities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class CreateLog {
	Logger logger = (Logger) LogManager.getLogger(CreateLog.class);
	/* This method is used to send as a info message
	 * @Param message */
   public void info(String message) {
	   logger.info(message);
   }
   /* This method is used to send as a pass message
	 * @Param message */
   public void pass(String message) {
	   logger.info(message);
   }
   /* This method is used to send as a fail message
	 *@Param message */
   public void fail(String message) {
	   logger.error(message);
   }
   /* This method is used to send as a error message
  	 *@Param message */
   public void error(String message) {
	   logger.error(message);
   }

}
