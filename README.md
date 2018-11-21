# Lambok Example

## How To Install Lambok :  https://howtodoinjava.com/automation/lombok-eclipse-installation-examples/

### What is Lombok
```
Lombok is a open source library (basically a standalone jar) which is capable of doing magic in automating the boilerplate code generation for any java class. So if Lombok is in classpath, it can easily get rid of all the getters & setters methods, class constructors, hashcode and equals methods and many more by just adding couple of annotations the class.

Is it not a cool feature? Let’s start learning it to use it extensively in your next project.
```

### Install Lombok in Eclipse
```
Though lombok will work if we put lombok on the project classpath. But in order to make it work with eclipse, we need to first do couple of steps to install it in eclipse.
```

### Download Lombok Jar File
```
First we need to download the Lombok jar. We can directly download it from https://projectlombok.org/downloads/lombok.jar but as we will use maven in future, so let’s maven do the download on our behalf, otherwise we will have multiple version of same jar in machine which will create problem when we will have to use updated version of the it.

To do this, we will create a maven project in eclipse and add lombok dependency in pom.xml. Latest version of Lombok at the time of writing this article is 1.16.18.
```

```
Add below dependency in your maven project so that it got downloaded first in your local repository.
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.16.18</version>
    </dependency>

Now do a mvn clean install command on the newly created project to get this jar downloaded in local repository.
```
### Start Lombok Installation

```
Once the jar downloaded in Local repository, goto the jar location from command prompt and run the following command java -jar lombok-1.16.18.jar and we should be greeted by Lombok installation window provided by lombok like this.
```
    
### Give Lombok Install Path

```
Now click on the “Specify Location” button and locate the eclipse.exe path under eclipse installation folder like this.
```    
    
### Finish Lombok Installation

```
Now we need to finally install this by clicking the “Install/Update” button and we should finished installing lombok in eclipse and we are ready to use its hidden power. Final screen will look like,
```
    
    