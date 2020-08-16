Controller/EmployeeController Class
--

`@RestController`

@RestController annotation indicates that the data returned by each method will be written 
straight into the response body instead of rendering a template.

EmployeeRepository
--
`EmployeeRepository`

EmployeeRepository is injected by a constructor into the com.seycileli.restservicespring.controller

JPA Annotations
--

`@GetMapping, @PostMapping, @PutMapping and @DeleteMapping`

Correspondents to the HTTP Get, Post, Put and Delete calls.

`EmployeeNotFoundException`

Spring HATEOAS Dependency
--

Add Spring HATEOAS dependency to pom.xml

`<dependency>
 	<groupId>org.springframework.boot</groupId>
 	<artifactId>spring-boot-starter-hateoas</artifactId>
 </dependency>`
 
So what is HATEOAS?
 
Introducing Spring HATEOAS, a Spring project that's aimed at helping us write 
hypermedia-driven outputs. To upgrade our service to being RESTful.

The side effect of NOT including hypermedia in our representations is that clients 
MUST hard code URIs to navigate the API. This leads to the same brittle nature that 
predated the rise of e-commerce on the web.

It’s a signal our JSON output needs a little help.

With the addition of the HATEOAS dependency, this tiny library will give us the 
constructs to define a RESTful service and then render it in an acceptable format
for client consumption.

What is the meaning of 'Business Service'
--

We'll declare the class with the @Service annotation.

Then we'll call our service class into our controller and create a 
constructor injected dependency.

Why go with Constructor Injection over Field?

Better testability, Immutability, Safer code, Cleaner expression.

Better testability:

You do not need any mocking library or a Spring context in unit tests. 
You can create an object that you want to test with the new keyword. 
Such tests are always faster because they not rely on the reflection mechanism. 
(This question was asked 30 minutes later. 
If the author had used constructor injection it would have not appeared).

Immutability:

Once the dependencies are set they cannot be changed.

Safer code:

After execution of a constructor your object is ready to use as you can validate 
anything that was passed as a parameter. The object can be either ready or not, 
there is no state in-between. With field injection you can introduce an intermediate 
step when the object is fragile.

Cleaner expression of mandatory dependencies. Field injection is ambiguous in this matter.

https://stackoverflow.com/questions/39890849/what-exactly-is-field-injection-and-how-to-avoid-it

What is Spring Data JPA?
--

JPA is an acronym for Java Persistence API, a specification that lets us do ORM.

What is ORM?
ORM lets us map our entity classes to our SQL tables, so that when we connect to the DB
we provide metadata to our Entity classes. So that way we don't have to do the querying 
and mapping ourselves, the framework will handle this for us.

The JPA is a way for us to use ORM. JPA is the API, which lets us configure our
Entity classes, which we give to our framework which will handle the rest from there.

This is what JPA is in a nutshell. As for what Spring Data JPA is, it's a tool
that makes handling ORM's even easier.
