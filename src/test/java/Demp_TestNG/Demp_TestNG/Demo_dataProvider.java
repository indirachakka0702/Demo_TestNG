package Demp_TestNG.Demp_TestNG;

import java.io.FileInputStream;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class Demo_dataProvider {

	//Though my test got failed or Error or exception .It is still proceeding for next test case which means next @Test is going to run
		//It is built to testing purpose
		
		@BeforeSuite
		public void dependencyTriggering() {
		BrowserUtility.launchBrowser("ch");
		}
	    @AfterMethod
		public void settingURL() {
			if(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isDisplayed())
			{
				BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
				WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 50);
				wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.id("email_field"))));	
			}
		
		}
	    
		@Test(dataProvider ="Data_UsernameAndPassword")
		public void checkLoginSuccessOrNot(String username, String Password) throws Exception{
			System.out.println("11111");
		BrowserUtility.loginToBrowser(username, Password);
		}
		
		@AfterSuite
		public void tearDownDependencies() {
			BrowserUtility.quitBrowser();
		}
		
		@DataProvider(name ="Data_UsernameAndPassword")
		public Object[][] usernamePassword_dp(){
			return new Object[][] {{"admin123@gmail.com", "admin3"},{"admin123@gmail.com", "admin123"}};
		}
		// or
		/*@DataProvider(name ="trainerInfo")
		Object[][] trainerInfoFromExcel()throws Exception{
			  String sFile = System.getProperties("user.dir")+"/testExcel.xls";
			    return readDataFromExcelSheet(sFile);
		}*/
		@Test(dataProvider="asposetrainerInfo")
		public void validatingTrainerInfo(String name, int exp, String email) {
			System.out.println(name+"\t"+exp+"\t"+email);
		}
		
		@DataProvider(name="asposetrainerInfo")
		Object[][] trainerInfoFromExcel_aspose()throws Exception{
			String sFile = System.getProperty("user.dir")+"/testExcel.xls";
			 return readDataFromExcelSheet_aspose(sFile);
		}
		//open source free tools can be used anywhere. 
		private Object[][] readDataFromExcelSheet_aspose(String sFile) throws Exception {
			//Creating a file stream containing the Excel file to be opened
					FileInputStream fstream = new FileInputStream(sFile);
					
					//Instantiating a Workbook object
					Workbook workbook = new Workbook(fstream);
					
					//Accessing the first worksheet in the Excel file
					Worksheet worksheet = workbook.getWorksheets().get(0);
					
					//Exporting the contents of 7 rows and 2 columns starting from 1st cell to Array.
					Object[][] dataTable = worksheet.getCells().exportArray(0,0,5,3);
					for (int i = 0 ; i < dataTable.length ; i++)
					{
						System.out.println("["+ i +"]: "+ Arrays.toString(dataTable[i]));
					}
					//Closing the file stream to free all resources
					fstream.close();
			return dataTable;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
