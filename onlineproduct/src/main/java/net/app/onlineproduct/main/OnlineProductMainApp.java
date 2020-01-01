package net.app.onlineproduct.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"net.app.onlineproduct.main","net.app.onlineproductbackend"})
@SpringBootApplication
public class OnlineProductMainApp {

	public static void main(String args[])
	{
		SpringApplication.run(OnlineProductMainApp.class, args);
	}
}
