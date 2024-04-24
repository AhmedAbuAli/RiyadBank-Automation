package P02_Listeners;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.testng.ITestListener;
import org.testng.ITestResult;
import P01_Base.Base;

public class TestListeners  extends Base implements ITestListener{

	public void OnTestFailure(ITestResult result) {

		if (result.getThrowable() != null) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			result.getThrowable().printStackTrace(pw);
			System.out.print(sw.toString());
		}
	}
}
