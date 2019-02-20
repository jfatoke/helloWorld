Write a Hello World program:

1. The program has 1 current business requirement a write Hello World to the console/screen.

2. The program should have an API that is separated from the program logic to eventually support mobile applications, web applications, console applications or windows services.

3. The program should support future enhancements for writing to a database, console application, etc.

a. Use common design patterns (inheritance, e.g.) to account for these future concerns.

b. Use configuration files or another industry standard mechanism for determining where to write the information to.

4. Write unit tests to support the API.

SOLUTION
This is a Grails application.
It uses MVC architectural pattern.
It has two Service interfaces for printing and data retrieval.
The print destination is set in the configuration file and print to Console is the default.
There are also Unit tests for the controller and the two services.

TO RUN
grails run-app 
& 
the API is available on localhost:8080 port


