#!/bin/bash

javac contact/controller/ContactController.java contact/controller/Repository.java
javac contact/model/Contact.java contact/model/ContactEmail.java contact/model/ContactNumber.java

javac contact/exception/RepositoryException.java contact/exception/ErrorCode.java
javac contact/extra/AlertBox.java
javac contact/extra/ApplicationProperties.java

javac contact/view/controller/ContactDetailController.java
javac contact/view/controller/MainViewController.java

javac contact/view/controller/CreateContactController.java

javac TDD.java

