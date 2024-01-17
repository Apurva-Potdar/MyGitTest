package listeners;


import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import baseCoverFox.BaseClass;
import utilityCoverFox.Utility;

public class ListenerCoverFox extends BaseClass implements ITestListener
{
@Override
public void onTestFailure(ITestResult result)
{
try {
Utility.takesScreenShot(driver, result.getName());
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
@Override
public void onTestSuccess(ITestResult result) {
}
@Override
public void onTestSkipped(ITestResult result) {
}
}