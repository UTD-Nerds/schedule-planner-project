<!-- ==================================================================================================== -->
<!-- =========================================== Description ============================================ -->

# **Schedule Planner Project**

Schedule Planner Project is a hybrid Java application that combines the power of Spring Boot for backend services and JavaFX for a desktop GUI. It’s designed to help organize and manage schedules efficiently, whether through a web interface or a standalone desktop experience.

The project is built with Maven, which handles all dependency management, build tasks, and project structure. This keeps the development process smooth and predictable, especially when working across multiple modules or switching between desktop and web environments. Maven’s support for clear configuration also makes it easier to onboard new contributors and manage the application as it grows.

By combining two popular Java technologies within a single project, Schedule Planner provides a solid foundation for developing hybrid applications. Whether it’s used as a personal tool or expanded into a larger solution, the structure is built to support long-term development, easy maintenance, and a wide range of potential features.

<!-- ==================================================================================================== -->
<!-- ======================================= Buiding Requirements ======================================= -->

## **Building Requirements**

#### 1. [Java Development Kit (JDK) 23](https://www.oracle.com/java/technologies/downloads/) (or higher)

#### 2. [Apache Maven 3.9+](https://maven.apache.org)

#### 3. [Git](https://git-scm.com)

#### 4. [SceneBuilder](https://gluonhq.com/products/scene-builder/)

#### 5. A Java Integrated Development Environment (IDE)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)

- [VS Code](https://code.visualstudio.com/) with **Extension Pack for Java** and **Spring Boot Extension Pack**

<!-- ==================================================================================================== -->
<!-- ====================================== Installation for macOS ====================================== -->

## **Installation for macOS**

#### 1. [Java Development Kit (JDK) 23](https://www.oracle.com/java/technologies/downloads/) (or higher)

- Visit the [Oracle JDK download page](https://www.oracle.com/java/technologies/downloads/) and choose the appropriate installer for your operating system

- Download the JDK and run the installer (use defaults)

- List all installed JDKs

```bash
/usr/libexec/java_home -V
```

- Example output

```bash
Matching Java Virtual Machines (1):
    24.0.2 (arm64) "Oracle Corporation" - "Java SE 24.0.2" /Library/Java/JavaVirtualMachines/jdk-24.jdk/Contents/Home
```

- Restart the terminal and verify

```bash
java -version
```

#### 2. [Apache Maven 3.9+](https://maven.apache.org)

- Visit the [Maven download page](https://maven.apache.org/download.cgi)

- Under **Files**, download `Binary zip archive (apache-maven-3.9.X-bin.zip)` and unzip

- Add to `~/.zshrc` or `~/.bashrc`

```bash
export MAVEN_HOME=/opt/apache-maven-3.9.X       # or /opt/maven if symlink
export PATH=$MAVEN_HOME/bin:$PATH
```

- Reload

```bash
source ~/.zshrc     # or ~/.bashrc
```

- Restart the terminal and verify

```bash
mvn -v
```

<!-- ==================================================================================================== -->
<!-- ===================================== Installation for Windows ===================================== -->

## **Installation for Windows**

#### 1. [Java Development Kit (JDK) 23](https://www.oracle.com/java/technologies/downloads/) (or higher)

- Visit the [Oracle JDK download page](https://www.oracle.com/java/technologies/downloads/) and choose the appropriate installer for your operating system

- Download the JDK and run the installer (use defaults)

- Save the folder to `C:\Program Files\Java\jdk-23` (replace "23" with your version)

- Open **Start Menu** → Search for **Edit the system environment variables**

- Select **Environment Variables**. Under **System variables**
  
    - Select **New**
        
        - Variable name: `JAVA_HOME`

        - Variable value: `C:\Program Files\Java\jdk-23` (replace "23" with your version)
    
    - Find `Path` variable
    
        - Select **Edit** → Select **New** → Add `%JAVA_HOME%\bin`

- Restart the terminal and verify

```bash
java -version
```

#### 2. [Apache Maven 3.9+](https://maven.apache.org)

- Visit the [Maven download page](https://maven.apache.org/download.cgi)

- Under **Files**, download `Binary zip archive (apache-maven-3.9.X-bin.zip)` and extract

- Save the folder to `C:\Program Files\apache-maven-3.9.X` (replace "X" with your version)

- Open **Start Menu** → Search for **Edit the system environment variables**

- Select **Environment Variables**. Under **System variables**
  
    - Select **New**
        
        - Variable name: `MAVEN_HOME`

        - Variable value: `C:\Program Files\apache-maven-3.9.X` (replace "X" with your version)
    
    - Find `Path` variable
    
        - Select **Edit** → Select **New** → Add `%MAVEN_HOME%\bin`

- Restart the terminal and verify

```bash
mvn -v
```

## Installation for both macOS and Windows

#### 1. [Git](https://git-scm.com)

- Visit the [Git download page](https://git-scm.com/downloads) and choose the appropriate installer for your operating system

- Download and run the installer (use defaults)

#### 2. [SceneBuilder](https://gluonhq.com/products/scene-builder/)

- Visit the [SceneBuilder download page](https://gluonhq.com/products/scene-builder/) and choose the appropriate installer for your operating system

- Download and run the installer (use defaults)

<!-- ==================================================================================================== -->
<!-- ========================================== Project Setup =========================================== -->

## **Project Setup**

#### 1. Clone the repository

```bash
git clone https://github.com/UTD-Nerds/schedule-planner-project
```

#### 2. Navigate to the project folder (cloned working directory)

```bash
cd ./schedule-planner-project/planner
```

<!-- ==================================================================================================== -->
<!-- =========================================== Developement =========================================== -->

## **Development**

#### 1. JavaFX desktop application

- Maven dependency (already included in this project)

```xml
<profiles>
    <profile>
        <id>desktop</id>
        <properties>
            <mainClass>org.utd.planner.DesktopApp</mainClass>
        </properties>
    </profile>
</profiles>
```

- Program run command (with Maven dependency)

```bash
mvn javafx:run -P desktop
```

- Program run command (without Maven dependency)

```bash
mvn javafx:run -Dexec.mainClass="org.utd.planner.DesktopApp"
```

#### 2. Spring Boot web application

- Maven dependency (already included in this project)

```xml
<profiles>
    <profile>
        <id>web</id>
        <properties>
            <mainClass>org.utd.planner.WebpageApp</mainClass>
        </properties>
    </profile>
</profiles>
```
- Program run command (with Maven dependency)

```bash
mvn spring-boot:run -P web
```

- Program run command (without Maven dependency)

```bash
mvn spring-boot:run -Dspring-boot.run.main-class="org.utd.planner.WebpageApp"
```

<!-- ==================================================================================================== -->
<!-- ======================================== Project Structure ========================================= -->

## **Project Structure**

```bash
schedule-planner-project
├── CODE_OF_CONDUCT.md
├── CONTRIBUTING.md
├── LICENSE
├── planner/                                                            # Main working directory
│   ├── HELP.md
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml                                                         # Maven dependencies & plugins
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── org/
│   │   │   │       └── utd/
│   │   │   │           └── planner/
│   │   │   │               ├── controller/
│   │   │   │               │   ├── javafx/
│   │   │   │               │   │   ├── homeController.java
│   │   │   │               │   │   └── raisaideaController.java
│   │   │   │               │   └── springboot/
│   │   │   │               │       └── HomeController.java
│   │   │   │               ├── DesktopApp.java                         # Spring Boot entry point
│   │   │   │               └── WebpageApp.java                         # JavaFX entry point
│   │   │   └── resources/
│   │   │       ├── application.properties                              # Spring Boot configuration
│   │   │       ├── static/                                             # Static web assets
│   │   │       │   ├── css/
│   │   │       │   │   └── style.css
│   │   │       │   ├── images/
│   │   │       │   │   └── test.txt
│   │   │       │   └── js/
│   │   │       │       └── script.js
│   │   │       └── templates/
│   │   │           ├── fragments/                                      # Thymeleaf
│   │   │           │   ├── test.txt
│   │   │           ├── fxml/                                           #FXML templates
│   │   │           │   ├── hello-view.fxml
│   │   │           │   └── raisaidea.fxml
│   │   │           └── home.html                                       # Main html homepage
│   │   └── test/                                                       # Unit & integration tests
│   │       └── java/
│   │           └── org/
│   │               └── utd/
│   │                   └── planner/
│   │                       └── PlannerApplicationTests.java
│   └── target/                                                         # Auto-generated build output (ignored by Git)
└── README.md
```