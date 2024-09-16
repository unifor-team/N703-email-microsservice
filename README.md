# N703 - Email microsservice

## Installation

Make the repository clone on your workspace

```
$ git clone https://github.com/unifor-team/N703-email-microsservice.git
```
Then

```
$ cd N703-email-microsservice
```

## Microsservice Email Application Structure 
```
.
|────src/
| |────main/
| | |────java/
| | | |────com.email.ms_email/
| | | | |────configs/
| | | | |────consumers/
| | | | |────controller/
| | | | |────dtos/
| | | | |────EmailService/
| | | | |────enums/
| | | | |────models/
| | | | |────repository/
| | | | |────MsEmailApplication
| | |────resources/
| | | |────application.properties
| |────test/
|──────.gitignore
|──────Dockerfile
|──────mvnw
|──────mvnw.cmd
|──────pom.xml
```


## Run app local

#### Example

```
mvn spring-boot:run
```

# Endpoins

## Emails

### Request
         /emails (GET)
### Response
    [{
        "emailId": string,
        "userId": string,
        "emailFrom": string,
        "emailTo": string,
        "subject": string,
        "text": string,
        "sendDateEmail": date,
        "statusEmail": string
    }]

# Production URL
```
https://n703-email-microsservice.onrender.com
```
