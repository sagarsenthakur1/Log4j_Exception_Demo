package log4j_exception_demo;
import org.apache.log4j.Logger;

public class ExceptionEx {
	
	final static Logger logger = Logger.getLogger(ExceptionEx.class);
	
	public static void main(String[] args) {
		
		ExceptionEx log4j = new ExceptionEx();
		
		try {
			log4j.divideByZero();
		} catch (ArithmeticException ex) {
			logger.error("Invalid Arithmetic operation.... Please Check ");
					
		}
	}
	private void divideByZero() {
		logger.info("divideByZero() Enter");
		int value = 200 / 0;
		logger.info("divideByZero() Done");
	}

}
