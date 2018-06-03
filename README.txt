Instructions------------------------------
FOR IE TEST:
1. I had to set my path to point to my web-driver. 
2. Right Click on my Computer, then select "Advanced system settings", then click "Environment Variables", then select "Path" and click on edit. Now add the path to your IEDriverServer.exe, for example mine was "C:\eclipse\webdriver\IEDriverServer.exe". 
3. I would recommend restart your pc.
4. You must run the 32 bit IE WEB driver http://selenium-release.storage.googleapis.com/index.html I downloaded 3.0
5. Now here is the piece of gold part that made the world of a difference to me. Set your IE to run as administrator. 
6. Right click on IE shortcut and select options, under Shortcut tab click on advanced button then check checkbox "run as administrator". 
7. Now Restart IE.
8. When you open IE, then go to tools, then Internet options and then security tab. I have unchecked "Enable Protected Mode" on Local intranet and trusted sites. 
9. Restart IE
10. Add domain "https://info.xoi.io/pilot" to list of "Trusted Sites" for i.e. in "Internet Options".

To download, import and run:
1. Download zip file from repository on github.
2. Drag and drop into the packages panel inside JavaOxygen (selenium) that’s already open.
3. Review compatibility items below and if click “green Play” to execute.
4. Run the Java package called "ChromeDriverTest.java" - there are two functional tests in it, notated by comments line.
Per my email, IE11 seems to have issues with click and sendKeys and action commands. I’ve used IE8 for other projects and I do know that it works with the webdriver for IE8.

Software/Application Compatibility: Make sure you have the following versions of software: Make sure you have all drivers compatible with the relevant browser platforms, otherwise there will be an error. 
 "Errors": - Element not clickable: Add more wait time or find a faster internet  connection (using a mobile hotspot allows for a fast connection) - Element not found: Locator is not correct. Try using a CSS selector or id  if the xpath will not work. - Compiled error: Software compatibility issues - Unknown error: See Reusable methods for printouts.  File paths: - Be sure to change the file path of your web browser's drivers  from the intiial developer's path to the driver's location on your hard drive.  This can be found in the "Driver" subfolder by double-clicking the "Driver" folder,  right-clicking the driver needed, and selecting properties.  The driver's location path will be in the Resource folder next to "Location".  Other: - If you have tasks in your Wipro profile you need to update,  the test will fail after logging in. - Be sure to add external jars to your project's buildpath.  

Software Tester can be reached at:
919-210-8413
blaire.k.taylor@gmail.com