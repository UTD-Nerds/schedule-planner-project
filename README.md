# **Schedule Planner Project**

A desktop + web planner application built with **Spring Boot**, **JavaFX**. We still don't know what it does :D

---

## **Building Requirements**

1. [Java Development Kit (JDK) 23](https://jdk.java.net/23/) (or higher)

2. [Apache Maven 3.9+](https://maven.apache.org/download.cgi)

3. [Git](https://git-scm.com/downloads)

4. A Java IDE (optional but recommended):  
    -  [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)  
    -  [VS Code](https://code.visualstudio.com/) with **Extension Pack for Java** and **Spring Boot Extension Pack**

## **Setup Instructions**

1. Clone the repository
	-  `git clone https://github.com/khangdoan514/schedule-planner-project`

2. CD into the cloned working directory
	-  `cd ./schedule-planner-project/planner` 

## **Project Structure**

planner/
├── pom.xml                                # Maven dependencies & plugins
├── src/
│   ├── main/
│   │   ├── java/org/utd/planner/
│   │   │   ├── controller/
│   │   │   │   └── HomeController.java
│   │   │   ├── WebpageApp.java            # Spring Boot entry point
│   │   │   ├── DesktopApp.java            # JavaFX entry point
│   │   │   └── exec.txt                   # Program Run Commands
│   │   │
│   │   └── resources/
│   │       ├── application.properties     # Spring Boot configuration
│   │       ├── static/                    # Static web assets
│   │       │   ├── css/
│   │       │   ├── images/
│   │       │   └── js/
│   │       └── templates/                 # Thymeleaf + FXML templates
│   │           ├── fragments/
│   │           ├── fxml/
│   │           │   └── hello-view.fxml
│   │           └── home.html
│   │
│   └── test/                              # Unit & integration tests
│
└── target/                                # Auto-generated build output (ignored by Git)
