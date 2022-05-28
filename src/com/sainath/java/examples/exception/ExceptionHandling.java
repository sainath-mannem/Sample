package com.sainath.java.examples.exception;

public class ExceptionHandling {

	
	public void unchecked() throws RuntimeException {
		throw new RuntimeException();
	}
	
	public void fundtransfer(String frmAcc, String toAcct, double amt) throws NoFundsExcepion, InvaildAccountExc, ApplicationException  {
	
		if(getBalance(frmAcc) < amt) {
			throw new NoFundsExcepion();
		}
		if(toAcct == null) {
			throw new InvaildAccountExc();
		}
		
		throw new ApplicationRuntimeException(1,"");
		
	}
	
	private double getBalance(String frmAcc) {
		return 100;
	}

	public void test() throws ApplicationException {
		
		try {
			fundtransfer("1234", "12121", 34);
			throw new ApplicationException(1,"");
			
		}  catch (ApplicationException e) {
			throw new ApplicationRuntimeException(1234, "Unknown");
		} catch (NoFundsExcepion e) {
			throw new ApplicationException(123, "NoFundsExcepion");
		} catch (InvaildAccountExc e) {
			throw new ApplicationException(1234, "InvaildAccountExc");
		} catch (ApplicationRuntimeException e) {
			throw e;
		}catch (Exception e) {
			throw new ApplicationRuntimeException(1234, "Unknown");
		}
	}
	
	public static void main(String[] args) {
		ExceptionHandling ex = new ExceptionHandling();
		try {
			ex.test();
		} catch (ApplicationException e) {
			//e.getErrorCode();
			//send response
		} catch (ApplicationRuntimeException e) {
			//e.getErrorCode();
			//send response
		}
	}
}
