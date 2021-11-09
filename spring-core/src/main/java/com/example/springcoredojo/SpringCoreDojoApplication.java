package com.example.springcoredojo;

import com.example.springcoredojo.practica2.ConfigPractica;
import com.example.springcoredojo.practica2.Usuario;
import com.example.springcoredojo.practica2.Youtuber;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreDojoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringCoreDojoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			//Creacion de Bean
			//creacionBean();
			classPathXmlAppicationContext2();
			classPathXmlAppicationContext();
		};
	}
	public void classPathXmlAppicationContext2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("user-bean-configusuarios.xml");
		Usuario usuario = (Usuario) context.getBean(Usuario.class);
		System.out.println("Usuario: " + usuario.getAlumno());
	}

	public void classPathXmlAppicationContext(){
		ApplicationContext context = new ClassPathXmlApplicationContext("user-bean-config.xml");
		Youtuber youtuber = (Youtuber) context.getBean(Youtuber.class);
		System.out.println("Youtuber: " + youtuber.getNombre());
	}


	private void creacionBean() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigPractica.class);
		Usuario usuarioGeneradoPorBean = context.getBean( Usuario.class);
		System.out.println("Usuario: " + usuarioGeneradoPorBean);
	}


}
