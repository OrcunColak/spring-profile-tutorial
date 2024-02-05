# Read Me First

The original idea is from  
https://medium.com/@sharadblog/how-do-i-access-my-profile-name-in-springboot-application-63b4bd229e2b

# @Profile Annotation

The original idea is from  
https://levelup.gitconnected.com/spring-boot-profiling-and-how-to-set-it-updated-2023-2b4ccdc2d7cb

# @ActiveProfiles Annotation

This annotation is used to set active profile of the test

# Pass Active Profile To Application

The original idea is from
https://medium.com/@r.ali.ashik/spring-boot-property-file-best-practices-db1b26cc153c

```
mvn spring-boot:run '-Dspring-boot.run.profiles=dev'
or
java -jar my-app.jar --spring.profiles.active=dev
```