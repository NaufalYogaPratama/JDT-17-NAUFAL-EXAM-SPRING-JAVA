package com.indivaragroup.exam.spring;

import com.indivaragroup.exam.spring.challenge.addition.BallBox;
import com.indivaragroup.exam.spring.challenge.addition.BallService;
import com.indivaragroup.exam.spring.challenge.eight.model.Student;
import com.indivaragroup.exam.spring.challenge.eight.repository.StudentRepository;
import com.indivaragroup.exam.spring.challenge.eight.service.StudentService;
import com.indivaragroup.exam.spring.challenge.finalexam.model.Book;
import com.indivaragroup.exam.spring.challenge.finalexam.repository.BookRepository;
import com.indivaragroup.exam.spring.challenge.finalexam.service.BookService;
import com.indivaragroup.exam.spring.challenge.five.AppConfig;
import com.indivaragroup.exam.spring.challenge.four.UserSession;
import com.indivaragroup.exam.spring.challenge.one.GreetingService;
import com.indivaragroup.exam.spring.challenge.seven.DatabaseConnection;
import com.indivaragroup.exam.spring.challenge.six.CalculatorService;
import com.indivaragroup.exam.spring.challenge.three.service.AnimalService;
import com.indivaragroup.exam.spring.challenge.three.impl.Cat;
import com.indivaragroup.exam.spring.challenge.three.impl.Dog;
import com.indivaragroup.exam.spring.challenge.two.GreetingServiceTwo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ExamSpringApplication {
	public static void main(String[] args) {

		// CHALLLENGE 1
		var contextGreetings = new AnnotationConfigApplicationContext(
				GreetingService.class
		);
		GreetingService greetingService = contextGreetings.getBean(GreetingService.class);
		System.out.println("CHALLENGE 1 = " + greetingService.sayHello());
		System.out.println();
		contextGreetings.close();

		// CHALLENGE 2
		var contextMessage = new AnnotationConfigApplicationContext(GreetingServiceTwo.class);
		GreetingServiceTwo messageService = contextMessage.getBean(GreetingServiceTwo.class);
		System.out.printf("CHALLENGE 2 = ");
		messageService.greet();
		System.out.println();
		contextMessage.close();

		// CHALLENGE 3
		var contextAnimal = new AnnotationConfigApplicationContext(
				AnimalService.class, Dog.class, Cat.class
		);
		AnimalService animalService = contextAnimal.getBean(AnimalService.class);
		System.out.println("CHALLENGE 3 = ");
		animalService.playSound();
		System.out.println();
		contextAnimal.close();


		// CHALLENGE 4
		var contextUserSession = new AnnotationConfigApplicationContext(
				UserSession.class
		);
		UserSession userSessionOne = contextUserSession.getBean(UserSession.class);
		UserSession userSessionTwo = contextUserSession.getBean(UserSession.class);
		System.out.println("CHALLENGE 4 = " + (userSessionOne == userSessionTwo));
		System.out.println();
		contextUserSession.close();

		// CHALLENGE 5
		var contextAppConfig = new AnnotationConfigApplicationContext(
				AppConfig.class
		);
		AppConfig appConfig = contextAppConfig.getBean(AppConfig.class);
		System.out.println("CHALLENGE 5 = " + appConfig.applicationName());
		System.out.println();
		contextAppConfig.close();

		// CHALLENGE 6
		var contextCalculator = new AnnotationConfigApplicationContext(
				CalculatorService.class
		);
		CalculatorService calculatorService = contextCalculator.getBean(CalculatorService.class);
		System.out.println("CHALLENGE 6 = ");
		System.out.println("10 + 5 = " + calculatorService.add(10,5));
		System.out.println("10 - 5 = " + calculatorService.subtract(10,5));
		System.out.println("10 * 5 = " + calculatorService.multiply(10,5));
		System.out.println("10 / 5 = " + calculatorService.divide(10,5));
		System.out.println();
		contextCalculator.close();

		// CHALLENGE 7
		var contextDatabaseConnection = new AnnotationConfigApplicationContext(
				DatabaseConnection.class
		);
		DatabaseConnection databaseConnection = contextDatabaseConnection.getBean(DatabaseConnection.class);
		System.out.println("CHALLENGE 7 = ");
		System.out.println(databaseConnection.showConnected());
		System.out.println(databaseConnection.showDisonnected());
		System.out.println();
		contextDatabaseConnection.close();

		// CHALLENGE 8
		var contextStudent = new AnnotationConfigApplicationContext(
				StudentService.class, StudentRepository.class
		);
		StudentService studentService = contextStudent.getBean(StudentService.class);
		Student budi = new Student(1, "Budi");
		Student andi = new Student(2, "Andi");
		Student siti = new Student(3, "Siti");

		studentService.addStudent(budi);
		studentService.addStudent(andi);
		studentService.addStudent(siti);

		studentService.printAllStudents();
		System.out.println();
		contextStudent.close();

		// CHALLENGE 9
		var contextBook = new AnnotationConfigApplicationContext(
				BookService.class, BookRepository.class
		);
		BookService bookService = contextBook.getBean(BookService.class);
		System.out.println("FINAL CHALLENGE = ");
		bookService.adBook(new Book(1, "Clean Code"));
		bookService.adBook(new Book(2, "Spring In Action"));
		bookService.adBook(new Book(3, "Effective Java"));
		for (var book : bookService.getAllBooks()) {
			System.out.println(book.getId() + ". " + book.getTitle());
		}
		System.out.println();
		System.out.println();
		contextBook.close();

		// addition
		var contextBall = new AnnotationConfigApplicationContext(
				BallBox.class,
				BallService.class
		);
		BallService ballService = contextBall.getBean(BallService.class);
		System.out.println("=== CHALLENGE JDT-17: Ball Problem ===");
		ballService.runSimulation(0.98);
		System.out.println();
		contextBall.close();

		SpringApplication.run(ExamSpringApplication.class, args);
	}
}
