# Tasks
* REST security with OAUTH

# Info
https://github.com/Microsoft/api-guidelines/blob/master/Guidelines.md

# Services
* Login service
* Get all policies
* Get one policy
* Get user info
* Update user info, email


java -jar swagger-codegen-cli.jar generate -i http://localhost:9001/services/rest/swagger.json -l java -o dls -t \development\ --library jersey2 --model-package com.schantz.remotecq.client -DdateLibrary=java8