# Intro

Spring is a simpler, lightweight alternative to J2EE.

In J2EE EJB v1 and v2 was very complex and had poor performance

Spring is J2EE development without EJB

Spring was initially released in 2004. 

Spring version 4+ and Java EE 7 are roughly synonomous.

Java EE 6 (~2009) has the release of EJB 3.x, which is where many of the EJB problems were fixed. But, Spring presists.

# Spring 5

Spring 5 (2017) requires Java 8 and servlet API 4.0. Added Spring 5 WebFlux.

www.luv2code.com/spring-5-whats-new
www.luv2code.com/spring-5-faq

# Overview of Spring

Official website: www.spring.io

* Lightweight development with Java POJOs (instead of EJBs)

* Dependency injection to promote loose coupling

* Declarative programming with Aspect Oriented Programming (AOP)

* Minimize boilerplate code

* Core container of Spring manages how beans are created, factory for creating beans

* SpEL is how to refer to beans

* AOP allows you to create application wide services, logging, etc. Added via config or annotation

* JDBC is communication with database. 

# Download Spring Jar files

http://repo.spring.io/release/org/springframework/spring/

wget http://repo.spring.io/release/org/springframework/spring/5.1.6.RELEASE/spring-framework-5.1.6.RELEASE-dist.zip

In workspace, copy the lib/*.jar into a folder (such as lib). In the the project, select project properties->Java Build Path->Libraries->Add Jars, and select all of the jars in the lib folder. 

# Spring development process

1) Create your Spring Beans (POJOs)
2) Create the Spring Container
3) Retrieve beans from the container

## Spring beans
Beans are defined in src/applicationContext.xml

    <bean 
    	id="myCoach"
    	class="com.springdemo.TrackCoach"
    	>
    </bean>

## Spring Container

The Spring Container is responsible for: 

* creating and managing object (Inversion of Control)
* Injecting object dependencies

Spring Containers are configured using XML, Java Annotations, or Java Source Code.

### Inversion of Control

The approach of outsourcing the construction and management of objects.

ie. Factory Pattern

## Create the Spring Container

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

## Get a bean from the spring container

ICoach theCoach = context.getBean("myCoach", ICoach.class);

# Spring container summary

It is an XML file used to construct Java classes.

It can inject/construct other classes into constructors.

It can inject property values and read those property values from propery files.

The container is constructed using ClassPathXmlApplicationContext. Beans are obtained using getBean()

ICoach trackCoach = context.getBean("trackCoach", ICoach.class);

