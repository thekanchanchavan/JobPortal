# JobPortal
# How to run JobPortal applications? follow below steps=>

A) Download or clone code from https://github.com/thekanchanchavan/JobPortal.git

B) Run SpringBoot project 
    1) Prerequisites to run Spring boot project=>
       a) Install postgresql which is required to store data in db.
       b) Create database with name=> ZIDIOConnect
       c) Create app password for your email id => (You can refer this website to create app password: https://myaccount.google.com/apppasswords )
       d) Add your email id & app password in application.properties file at path => JobPortal-Backend/src/main/resources/application.properties
    2) Run java for file => ProjectApplication.java (file path=> JobPortal-Backend/src/main/java/com/zidio/project/ProjectApplication.java)

C) Run ReactJS project
  1. Go to JobPortal-Frontend directory where package.json file is present & install npm packages using command => npm install
  2. run this command to start project from same directory=> npm start
