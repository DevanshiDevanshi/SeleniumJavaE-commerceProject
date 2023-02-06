package resources;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import basePackage.BasePage;

public class Listeners extends BasePage implements ITestListener {

	public Listeners() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			takeSnapShot(result.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
