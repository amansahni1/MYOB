# MYOB

##Problem statement: refer https://github.com/MYOB-Technology/ops-technical-test

## Main URLs available:

### For Healthcheck: http://localhost:8080/myapp/health
NOTE: Currently only negative ie 'DOWN' scenario is configured.

### Welcome page/Hello World page : http://localhost:8080/myapp/welcome

### API Info URLs:
http://localhost:8080/myapp/name

http://localhost:8080/myapp/description

http://localhost:8080/myapp/version

http://localhost:8080/actuator/info

# Testing/Deployment Instructions

1.	Import the boot project (mobile-app-ws) into eclypse and run the apring boot app to deploy into tomcat.

2.	Hit the APIs created using curl or browser

OR

1.	Deploy the provided JAR into tomcat.

2.	Hit the APIs created using curl or browser







