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
5. Be sure to add all necessary jars or imports will not execute.

Software Tester can be reached at:
919-210-8413
blaire.k.taylor@gmail.com
