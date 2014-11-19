Facebook Connector DEMO
======================================================
This is a simple demo, to avoid any privacy issues with your friends, this time we are going to get your birthday from Facebook, calculate how many days left till your next birthday, and then publish it to your Facebook status. 

Setup and configuration
-----------------------

Download JBoss Fuse from jboss.org, and place the downloaded zip file under installs folder.

Add fabric server passwords for Maven Plugin to your ~/.m2/settings.xml file the fabric server's user and password so that the maven plugin can login to the fabric.

```
<server>
  <id>fabric8.upload.repo</id>
  <username>admin</username>
  <password>admin</password>
</server>
```
Goto project folder, under fbdemo/src/main/fabric8, find the facebookdemo.properties file, 
replace 3 mandatory parameters with the content from Facebook Deverloper site.
(See my blog for more detail: )
 
-oAuthAppId
-oAuthAppSecret
-oAuthAccessToken


run 
```
init.sh
```

It will setup JBoss Fuse, install fabric, build and deploy the profile. 

The demo video are located here too:
https://vimeo.com/112186794
https://vimeo.com/112250849  
