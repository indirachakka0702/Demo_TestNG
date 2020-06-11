package Demp_TestNG.Demp_TestNG;

public class jenkins {
	
	// what is jenkins?
	// continuous integration and continuous deployment tool CICD
	// combining multiple modules together
	/*Scenario:
	developer will write and commit code -->
		-->git
		-->build and deploy it on the server -->DEV
		you required one human effort everytime to do this. Same steps he need to repeat
		Available in Dev
	
	Tester should run his tests on developer build
	Assumes latest code is available in Dev
	--> He will pull the latest code from GIT
	--> He will choose the suite / time interval
	-->he has to run this on the environment -> Dev
	--> Result should be published to the stake holders
	
	clubbing all the tasks in one platform and manage however we want it
	Jenkins 
	it can have an access to your command prompt or Terminal
	if you can able to run your suite on the command line then jenkins will do the rest
	you have to give set of commands or actions to jenkins
	
	-- will not point the action on eclipse
	
	running the suite.xml file using maven command
	
	install maven on your machine 
	with the maven command you have to run suite.xml
	
	1. Creating prject -->freestyle or maven
	2. Setting up the workspace
	3. Git credentials with repository, Branch
	4. Build periodically
	5. Build --> Execute windows batch command
	
	upstream 
	downstream
	
	TestNgRegression --> setup downstream as TestNGSanity
	
	TestNGSanity --> upstream as TestNgRegression
	*/
    
}
