## Install Eclipse IDE [Download](https://spring.io/tools).

## MySQL 
```
Create one schema with name as markshark_assignment
```
### open application.properties file path = "src/main/resources/application.properties"
```
spring.datasource.url=jdbc:mysql://localhost:3306/markshark_assignment
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```
### chnage MySQL username and password as yours
```
spring.datasource.username=
spring.datasource.password=
```

## download and open this repository files in eclipse IDE

### Rum *MarkSharksAssignment.java* file 
            - path = "src/main/java/com/marksharks/assg/MarkSharksAssignmentApplication.java"

## Insert some supplier data in mysql using this API "http://localhost:8080/api/supplier/create/" [POST]
            -![Screenshot 2024-08-24 164827](https://github.com/user-attachments/assets/e95d7dcc-6151-4e33-b53a-1c826b677c49)
            -### Write body section as raw data
```
            {
                        "companyName": "ghjs Manufacturing",
                        "website": "https://www.zxcvb.com",
                        "location": "Japan",
                        "natureOfBusiness": "MEDIUM_SCALE",
                        "manufacturingProcesses": [
                            "MOULDING",
                            "COATING"
                        ]
            }
```

## API to get All suppliers details without any filter 
  - http://localhost:8080/api/supplier/   [GET]
  - ![image](https://github.com/user-attachments/assets/4a29c90e-d601-43bc-b8fd-9c14bc179698)

## API to get All suppliers details with filter 

  - http://localhost:8080/api/supplier/search2/ or http://localhost:8080/api/supplier/search1/             [POST]
  - ![image](https://github.com/user-attachments/assets/dec2ad4b-24f1-479f-b514-1ffc1f078008)

  - ```
    {
        "location": "India",
        "natureOfBusiness": "LARGE_SCALE",
        "manufacturingProcesses":[
            "MOULDING"
        ]
    }
    ```
  - ### with pagination use API "http://localhost:8080/api/supplier/search2/?pageNumber=0&pageSize=4"
