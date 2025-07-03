# EMPLOYEE MANAGEMENT SYSTEM

An [Employee Management System](https://github.com/pournimaghude/EMPLOYEE_MANAGEMENT/tree/master) (EMS) built using **Spring Boot** and **JSP**, enabling basic CRUD operations like creating, viewing, updating, and deleting employee records with integrated **email functionality**.



##  Features

-  Employee Registration  
-  Secure Login System  
-  Home Dashboard after login  
-  Edit/Update Employee Details  
-  Delete Employee Records  
- Email Notification Sending  
-  Navigation with JSP pages  
-  Fully functional CRUD operations  
-  Local Deployment with Spring Boot


##  Technologies Used

| Tech Stack     | Purpose                          |
|----------------|----------------------------------|
| `Spring Boot`  | Backend logic, MVC architecture |
| `JSP`          | Frontend templating              |
| `Spring MVC`   | Web architecture & routing       |
| `Spring Data JPA` | ORM and database operations |
| `MySQL`        | Database                         |
| `Thymeleaf (optional)` | Templating engine (if used)  |
| `JavaMailSender` | Sending email functionality    |
| `HTML/CSS`     | UI Styling (JSP pages)           |


##  Folder Structure
```
EMPLOYEE_MANAGEMENT/
├── src/
│ ├── main/
│ │ ├── java/com/employee/...
│ │ └── resources/
│ │ ├── application.properties
│ │ └── templates/
| | ├── Webapp
│ │ | ├── login.jsp
│ │ | ├── home.jsp
│ │ | ├── register.jsp
│ │ | └── update.jsp
├── pom.xml
└── README.md
```



## Pages Description

| Page             | Purpose                                                                 |
|------------------|-------------------------------------------------------------------------|
| `login.jsp`      | Login with username and password                                         |
| `register.jsp`   | New employee registration with form input                                |
| `home.jsp`       | Display all registered employees after login                             |
| `update.jsp`     | Update employee details based on ID                                      |
| `emailService.java` | Sends confirmation emails or notifications to employees                |


##  How to Run the Project
1. **Clone the Repository**
   ```bash
   git clone https://github.com/pournimaghude/EMPLOYEE_MANAGEMENT.git
   cd EMPLOYEE_MANAGEMENT```
   
2. **Set up MySQL Database**
  Create a database named: employee_db
  Update DB credentials in application.properties:

      ```bash
      spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
      spring.datasource.username=your_username
      spring.datasource.password=your_password
      spring.jpa.hibernate.ddl-auto=update
    ```

3. Build and Run the Application
   - Open in IntelliJ IDEA / Eclipse
   - Run EmployeeManagementApplication.java
   - Access via browser: http://localhost:8080/
  
     #### 📧 Email Configuration

    Make sure you configure email credentials in application.properties:
      ```bash
      spring.mail.host=smtp.gmail.com
      spring.mail.port=587
      spring.mail.username=your_email@gmail.com
      spring.mail.password=your_app_password
      spring.mail.properties.mail.smtp.auth=true
      spring.mail.properties.mail.smtp.starttls.enable=true
    ```

### ✍️ Author
**👩‍💻 Pournima Ghude**
🔗 [LinkedIn](https://www.linkedin.com/in/pournima-ghude-822546202)
💻 [GitHub](https://github.com/pournimaghude/EMPLOYEE_MANAGEMENT/tree/master)
