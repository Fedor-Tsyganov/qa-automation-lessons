# First project

This is a simple introduction to Web Automation with Java

Purpose of this project is to get familiar with the structure and basic tests.

### Project

  -  Open IntelliJ IDEA. You will see this window. 

![](https://github.com/Fedor-Tsyganov/qa-automation-lessons/blob/master/WEB/Lesson1/images/step1.png?raw=true)

  -  Click on "Create New Project"

![](https://github.com/Fedor-Tsyganov/qa-automation-lessons/blob/master/WEB/Lesson1/images/step2.png?raw=true)

  -  Select "Maven" on the left side menu

![](https://github.com/Fedor-Tsyganov/qa-automation-lessons/blob/master/WEB/Lesson1/images/step3.png?raw=true)

  -  Enter GroupId - name of your project (all lowercase and no spaces) and ArtifactId - (reverse url: google.com will be com.google)

![](https://github.com/Fedor-Tsyganov/qa-automation-lessons/blob/master/WEB/Lesson1/images/step4.png?raw=true)

  -  Enter the project name - here you may use any case and spaces

![](https://github.com/Fedor-Tsyganov/qa-automation-lessons/blob/master/WEB/Lesson1/images/step5.png?raw=true)

  -  Click "Finish"


Wait for Maven to build a project for you. It should not take a long time, but if your machine is slow it can be a timeconsuming process.


After maven completes building project it should look this way:

![](https://github.com/Fedor-Tsyganov/qa-automation-lessons/blob/master/WEB/Lesson1/images/step6.png?raw=true)

You will see the following structure of the project

  - src/main/java
  - src/main/resources
  - src/test/java
  - src/test/resources
  - src/pom.xml

You can learn more about Maven project layout [here] 

For now we will be doing our work in src/main/java directory and we also we will be working with pom.xml file

### pom.xml

> POM is an acronym for Project Object Model. 
> The pom.xml file contains information of project and configuration information for  
> the maven to build the project such as dependencies, build directory, source directory, 
> test source directory, plugin, goals etc.
>
> Maven reads the pom.xml file, then executes the goal.

If you still confused about this file, you can read [more about pom.xml] or google pom.xml 

### Working with pom.xml

  -  Open pom.xml

  -  Add "dependecies" tag. Inside those tags you are going to add 3rd party libraries or frameworks. So, it's like a basket where you add single items

  -  Now go to Google and type: Maven Central TestNG. It will bring you to a place where all opensource maven compatible libraries are hosted (to say it in simple words)

  -  Click on the first link

![](https://github.com/Fedor-Tsyganov/qa-automation-lessons/blob/master/WEB/Lesson1/images/step7.png?raw=true)

  -  You will be redirected to a library's page with released versions. Select the latest version. (6.11 at the moment of writing)

![](https://github.com/Fedor-Tsyganov/qa-automation-lessons/blob/master/WEB/Lesson1/images/step8.png?raw=true)

  -  Now at the version page you should see an XML code, go ahead and copy it

![](https://github.com/Fedor-Tsyganov/qa-automation-lessons/blob/master/WEB/Lesson1/images/step9.png?raw=true)

  -  Go back to your pom.xml and enter copied text inside "dependecies" tag. You can see the complete code in Lesson1/project/src/pom.xml file
  
Your pom.xml file should look this way:

```sh
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>webautomation</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>6.11</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.3.1</version>
        </dependency>
    </dependencies>
</project>
```

It's important that you "dependencies" tags stay inside "project" tags and not inside outher tags. You might realise that inside "dependencies" tags you several "dependency" tags. Think of it as a single item (dependency) inside of a box (dependecies). 

I recommend you to go over [this page] that expains pom.xml structure in a great detail and maybe  read some additional documentation about purpose of this file. 



Congrats!

You've just imported your first library/framework.

By the way, IntelliJ IDEA will offer you to enable auto-import. Go ahead and click on "Enable Auto Import" and it will take care of everything for you. Otherwise you will need to do it manually, but I will not explain how to do it manually (it's not hard) because i don't want to waste time on that, however it worth learning it. So do your own research on this topic.


  [here]: <https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html>
  [more about pom.xml]: <https://www.javatpoint.com/maven-pom-xml>
  [this page]:<https://maven.apache.org/guides/introduction/introduction-to-the-pom.html>


