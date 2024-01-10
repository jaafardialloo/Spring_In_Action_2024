# Spring_In_Action_2024
In this repository i am working through a fundamental spring element: Spring Context which is the backbone of spring framework and the of the DI and bean management.

Spring contexte :

Sring context is a crucial element in spring framework , learning it should be the first thing for every newbie to spring framework during embording,instead of diving direclty  into annotations.
Grasping fundamental elements of the spring framework provides more control on the code and granties flexible coding style.Coming from java , a newbie is already used to instanciate objects usung new operator,  whenever needed,  but with spring this task is handled by the framework and hence programmers just need to declare the dependencies (this is called dependency Injection we will talk about it in upcoming posts).

The aforementioned worklow abstracts what going under the hood and mau cause confusions for newbie at the beginning (it was my case).

Next let's talk briefly about spring contexte :

A -  Spring contexte : Spring contexte is like a place in the application memory in which you register the objects that you want spring IOC to manage for you (beans).
B -  Objects by default are unknown to spring until they are registered in the contexte then they become beans.
C - Objects in spring framework are of two types:  The ones managed by spring itself, they are called beans.  The other ones that are simple objects and spring is not even aware of their existance such as DTO .
D - Beans are nothing than objects managed by spring IOC container which means that their life cycle is managed by beanFactory.
E -  There are three ways to introduce beans to  spring contexte :    
     1 - Using the @Bean annotation : define a method within a configuration class that returns a bean of the Type . 
     2 - Using Stereotype annotations : The @ComponentScan will scan and register in the contexte as beans,  every classe annotated by @Components and it's derivatives such as @Service, @Controller, @Repository .
     3 - programmatically : The method registerBean() allows to register beans dynamically based on some conditions.
For more details i recommend the book : #Spring_start_here

