#! /usr/bin/env bash
#Changes all instances of port 9020 to the port you hosted your app on.
sed  -i -r 's/:9020/:9038/g' /media/wwang3/JPL-Front/app/util/Constants.java
sed  -i -r 's/:9020/:9038/g' /media/wwang3/JPL-Front/app/models/DataSet.java
sed  -i -r 's/:9020/:9038/g' /media/wwang3/JPL-Front/app/models/NasaRegistration.java
sed  -i -r 's/:9020/:9038/g' /media/wwang3/JPL-Front/app/controllers/AccountController.java
#Changes all instances of localhost to a specified IP
#sed  -i -r 's/localhost/10.0.20.144/g' /media/wwang3/JPL-Front/app/util/Constants.java
#sed  -i -r 's/localhost/10.0.20.144/g' /media/wwang3/JPL-Front/app/models/DataSet.java
#sed  -i -r 's/localhost/10.0.20.144/g' /media/wwang3/JPL-Front/app/models/NasaRegistration.java
#sed  -i -r 's/localhost/10.0.20.144/g' /media/wwang3/JPL-Front/app/controllers/AccountController.java
