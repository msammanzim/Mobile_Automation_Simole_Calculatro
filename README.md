Prepare Appium Instance for Window

To Start Automation with Appium, we have to follow couple of steps. First we have to make your system ready then we can start our journey with appium.

    Download & Install JDK
    Download & Install IntelliJ IDEA Community Version
    Download & Install android studio Android SDK thourgh Android Studio
    Download & Install LTS Node Js
    Download & Install Vysor
    Set environment variable(path): Set JAVA_HOME & ANDROID_HOME
    Check if node.js, npm & Android SDK are installed: node --version, npm --version, adb --version
    Install appium : Appium Version 2 commands installation process
    Check if appium is installed: appium -v
    Plugin Device (turn on developer mode & USB debugging)
        Find build number under settings and tap 7 times on build number.
        Enter your pattern, PIN or password to enable the Developer options menu.
        The "Developer options" menu will now appear in your Settings menu.
        Turn On the "USB Debugging" option from "Developer Options"
    Indentify appPackage & appActivityName Open the app in your device. and use the command: adb shell "dumpsys activity activities | grep mResumedActivity"
    Create TestNG XML plugin install from Marketplace - File >> Settings >> plugin >> Marketplace >> search 'Create TestNG XML' & install

Appium Version 2 commands

    Install Appium: npm i --location=global appium
    Uninstall Appium: npm uninstall -g appium
    check drivers list: appium driver list
    Install uiautomator2 & execute-driver driver: appium driver install uiautomator2, appium plugin install execute-driver
    check plugin list: appium plugin list
    Install Plugin: appium plugin install plugin_name
    Run with path: appium --base-path /wd/hub
    Run Appium: appium
    Run Appium with plugin & path: appium --use-plugins=execute-driver --base-path /wd/hub

Related Resources

    Appium NPM
    Appium GitHub

Create Java(Gradle) Project in IntelliJ IDEA for Appium

    Create Java(Gradle) Project in IntelliJ IDEA
    Add Gradle Dependencies
        Selenium
        Appium CLient
        TestNG
    Desired Capabilities

Open existing Java(Gradle) Project using IntelliJ IDEA

    Open existing Java(Gradle) Project using IntelliJ IDEA
    Identify Elements
    Start Writing Automation Code
    Run Test Cases

Appium Inspector to Identify Elements

    Appium Inspector download & install
    Configure Appium Inspector

    Appium Inspector
        Go to or Open Appium Inspector
            Remote host: localhost
            Port: 4723
            Path: /wd/hub
            Allow Unauthorized Certificates

    Set DesiredCapabilities

    capabilities.setCapability("udid", "192.168.56.101:5555");
    capabilities.setCapability("platformVersion", "12");
    capabilities.setCapability("appPackage", "com.bng.calculator");
    capabilities.setCapability("appActivity", "com.bng.calc.MainActivity");
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("automationName", "UiAutomator2");

    Disable Permission Monitoring

    Go to developer option.
    Go to last option called --> Disable Permission Monitoring --> enable it.

Run Test Case

    Run Test Case - Go to desired Java Class where has Test Case, Right click of mouse on Test Case >> click on Run
    Run XML File - After create TestNG file, Right click of mouse on TestNG xml >> click on Run

Download Genymotion Emulator & Download Apk from Google Play

    Download Genymotion Emulator
    Downloads – Oracle VM VirtualBoxhttps://www.virtualbox.org/wiki/Downloads)
    Download Apk from Google Play

Related Resources

    Appium Command
    Troubleshoot Activities Startup
    Appium API Documentation
    Selenium WebDriver

Create automated scripts to test EMI Calculator mobile app

Download & install EMI Calculator mobile app your device
Key functionalities, that have to be covered:

    Open EMI calculator
    Navigate to the EMI Calculator screen
    Enter <loan> in the amount field
    Enter <interest> percent rate in the interest field
    Enter <period> in the period field in years
    Enter <pFee> percent for the processing fee
    And tap on the calculate button
    Then Verify that the detail results are correct <mEMI>, <tInterest>, <tpFee> and <tPayment>

Examples:
loan 	interest 	period 	pFee 	mEMI 	tInterest 	tpFee 	tPayment
100000 	9.0 	2 	2.0 	4568 	9643 	2000 	109643
325000 	9.5 	5 	1.5 	6826 	84536 	4875 	409536
450000 	11.0 	7 	1.8 	7705 	197228 	8100 	647228
Additional functionalities, that may be covered:

    Please use Example table data to create excel/csv file as external test data provider and your automation script have the abitlity to read and write data from excel/csv

Record a video of tests execution:
