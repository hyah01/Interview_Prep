Develop a Task Management System as a Spring Boot-based REST API to manage and track tasks for 
multiple projects. The system should allow users to create, update, and delete tasks, 
assign tasks to team members, set priorities and deadlines, and track the status of each task. 
Additionally, users should be able to organize tasks into specific projects for better categorization.

To build scalability and modularity into the system, use a microservices architecture with Eureka 
Server for service discovery. The project will consist of two main microservices:

	1.	Task Service – manages task creation, updates, assignment, and status tracking.
	2.	Notification Service – sends notifications to team members when tasks are assigned, updated, 
        or marked complete.

The Eureka Server should register both services, enabling them to communicate seamlessly.