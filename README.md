# JobPortal
# How to run JobPortal applications? follow below steps=>

A) Download or clone code from https://github.com/thekanchanchavan/JobPortal.git

B) Run SpringBoot project 
    # Prerequisites to run Spring boot project=>
      1. install postgresql which is required to store data in db.
      2. create db with name=> ZIDIOConnect
      3. create app password for your email id => (You can refer this website to create app password: https://myaccount.google.com/apppasswords )
      4. add your email id & app password in application.properties file at path => JobPortal-Backend/src/main/resources/application.properties
    run java for file => ProjectApplication.java (file path=> JobPortal-Backend/src/main/java/com/zidio/project/ProjectApplication.java)

C) Run ReactJS project
  1. Go to JobPortal-Frontend directory where package.json file is present & install npm packages using command => npm install
  2. run this command to start project from same directory=> npm start
