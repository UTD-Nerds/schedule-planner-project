# **Schedule Planner Project**

A desktop + web planner application built with **Spring Boot**, **JavaFX**. We still don't know what it does :D

## **Building Requirements**

#### 1. [Java Development Kit (JDK) 23](https://www.oracle.com/java/technologies/downloads/) (or higher)

#### 2. [Apache Maven 3.9+](https://maven.apache.org/download.cgi)

#### 3. [Git](https://git-scm.com/downloads)

#### 4. A Java Integrated Development Environment (IDE)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

- [VS Code](https://code.visualstudio.com/) with **Extension Pack for Java** and **Spring Boot Extension Pack**

## **Installation For macOS**

#### 1. [Java Development Kit (JDK) 23](https://www.oracle.com/java/technologies/downloads/) (or higher)

- Visit the [Oracle JDK download page](https://www.oracle.com/java/technologies/downloads/)

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

- Verify

```bash
java -version
```

#### 2. [Apache Maven 3.9+](https://maven.apache.org/download.cgi)

- Visit [Maven download page](https://maven.apache.org/download.cgi)

- Under **Files**, download `Binary zip archive (apache-maven-3.9.X-bin.zip)` and unzip

- Add to `~/.zshrc` or `~/.bashrc`

```bash
# or /opt/maven if symlink
export MAVEN_HOME=/opt/apache-maven-3.9.X
export PATH=$MAVEN_HOME/bin:$PATH

# Reload
source ~/.zshrc  # or ~/.bashrc
```

- Verify

```bash
mvn -v
```

#### 3. [Git](https://git-scm.com/downloads)

## **Installation For Windows**

#### 1. [Java Development Kit (JDK) 23](https://www.oracle.com/java/technologies/downloads/) (or higher)

- Visit the [Oracle JDK download page](https://www.oracle.com/java/technologies/downloads/)

- Download the JDK and run the installer (use defaults)

- Open **Start Menu** and search for **Environment Variables**

- Select **Edit the system environment variables** → Select **Environment Variables...**

- Under **System variables**
  
    - Select **New**
        
        - Variable name: `JAVA_HOME`

        - Variable value: `C:\Program Files\Java\jdk-24` (replace "24" with your version)
    
    - Find `Path` variable
    
        - Select **Edit** → Select **New** → Add `%JAVA_HOME%\bin`

- Restart the terminal and verify

```bash
java -version
```

#### 2. [Apache Maven 3.9+](https://maven.apache.org/download.cgi)

- Visit [Maven download page](https://maven.apache.org/download.cgi)

- Under **Files**, download `Binary zip archive (apache-maven-3.9.X-bin.zip)` and extract

- Move the folder to `C:\Program Files\apache-maven-3.9.X`

- Open **Start Menu** and search for **Environment Variables**

- Select **Edit the system environment variables** → Select **Environment Variables...**

- Under **System variables**
  
    - Select **New**
        
        - Variable name: `MAVEN_HOME`

        - Variable value: `C:\Program Files\apache-maven-3.9.`
    
    - Find `Path` variable
    
        - Select **Edit** → Select **New** → Add `%MAVEN_HOME%\bin`

- Restart the terminal and verify

```bash
mvn -v
```

#### 3. [Git](https://git-scm.com/downloads)

## **Project Setup**

#### 1. Clone the repository

```bash
git clone https://github.com/khangdoan514/schedule-planner-project
```

#### 2. CD into the cloned working directory

```bash
cd ./schedule-planner-project/planner
``` 

## **Development**

```bash
# JavaFX desktop application
mvn javafx:run -P desktop

# Spring Boot web application
mvn spring-boot:run -P web
```

## **Project Structure**

```bash
schedule-planner-project
├── planner/                                        # Main working directory
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/org/utd/planner/
│   │   │   │   ├── controller/
│   │   │   │   │   └── HomeController.java
│   │   │   │   │
│   │   │   │   ├── WebpageApp.java                 # Spring Boot entry point
│   │   │   │   ├── DesktopApp.java                 # JavaFX entry point
│   │   │   │   └── exec.txt                        # Program Run Commands
│   │   │   │
│   │   │   └── resources/
│   │   │       ├── application.properties          # Spring Boot configuration
│   │   │       ├── static/                         # Static web assets (JS, CSS, images)
│   │   │       │   ├── css/
│   │   │       │   │   └── style.css
│   │   │       │   │
│   │   │       │   ├── images/
│   │   │       │   └── js/
│   │   │       │       └── script.js
│   │   │       │
│   │   │       └── templates/                      # Thymeleaf + FXML templates
│   │   │           ├── fragments/
│   │   │           ├── fxml/
│   │   │           │   └── hello-view.fxml
│   │   │           │
│   │   │           └── home.html                   # Main html homepage
│   │   │
│   │   └── test/                                   # Unit & integration tests
│   │
│   ├── target/                                     # Auto-generated build output (ignored by Git)
│   ├── .gitattributes
│   ├── .gitignore
│   ├── HELP.md
│   └── pom.xml                                     # Maven dependencies & plugins
│
├── CODE_OF_CONDUCT.md
├── CONTRIBUTING.md
├── LICENSE
└── README.md
```