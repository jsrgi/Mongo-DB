# Mongo-DB

Install and Create DB:

1. Download and install MOndo DB MSI
2. Go to the installed path (C:\Program Files\MongoDB\Server\3.2\bin\)
3. msiexec.exe /q /i mongodb-win32-x86_64-2008plus-ssl-3.2-signed.msi ^INSTALLLOCATION="C:\Program Files\MongoDB\Server\3.2\" ^ADDLOCAL="all"
4. msiexec.exe /q /i mongodb-win32-x86_64-2008plus-ssl-3.2-signed.msi ^INSTALLLOCATION="C:\Program Files\MongoDB\Server\3.2\" ^ADDLOCAL="MonitoringTools,ImportExportTools,MiscellaneousTools"
5. Create folders in C drive (C:\data\db)
6."C:\Program Files\MongoDB\Server\3.2\bin\mongod.exe" --dbpath c:\data (For server)
7."C:\Program Files\MongoDB\Server\3.2\bin\mongo.exe" (For client)
8. Command "Use urDBname"
9.db.createUser({user:"root", pwd:"root",roles:["readWrite","dbAdmin"]})
10.Start creating collections,documents
