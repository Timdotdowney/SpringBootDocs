Spring Boot pom has a parent for Spring Boot. It does not add dependencies, but inherits
goals, like spring-boot:run

@SpringBootApplication equals @Configuration , @EnableAutoConfiguration and @ComponentScan

@EnableAutoConfiguration allows Spring to guess what you are building and include the
necessary dependencies. Auto-configuration tries to be as intelligent as possible and will back-away as you define more of your own configuration. You can always manually exclude() any configuration that you never want to apply (use excludeName() if you don't have access to them). You can also exclude them via the spring.autoconfigure.exclude property. Auto-configuration is always applied after user-defined beans have been registered.

XML is not preferred. Try to use Java.

Only add one SpringBootApplication or EnableAutoConfiguration annotation in a project.

Use Autowired annotation along with ComponentScan to define beans. All Component, Service,
Repository, Controller are registered as Beans. A single constructor allows omission of
Autowired.





