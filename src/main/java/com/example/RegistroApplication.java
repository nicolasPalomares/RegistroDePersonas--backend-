package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
 * --- (ES) ---
 * 
 * Esta aplicación backend realizada en Spring representa un sistema de registro de personas. Mediante una barra de búsqueda, el usuario puede buscar registros
 * especificando el DNI de la persona; las operaciones de agregar, editar y eliminar registros están configuradas para que sólo los usuarios con rol de
 * Administrador puedan realizarlas. Actualmente hay dos registros en la base de datos creados por mi como ejemplo, uno con DNI 11223344 y otro con DNI
 * 00000011; las credenciales de los usuarios de ejemplo establecidos también por mi son los siguientes:
 * 
 * (ROLE_USER)
 * Username: user1
 * Password: user12345
 * 
 * (ROLE_ADMIN)
 * Username: admin1
 * Password: admin12345
 * 
 * En la carpeta "db_backup" dentro del directorio del proyecto se encuentra una copia de respaldo de la base de datos.
 * El proyecto incluye internacionalización (i18n) para español e inglés, páginas de error personalizables, y está realizado
 * siguiendo la arquitectura MVC ('Model-View-Controller') de Spring.
 * 
 * --- (EN) ---
 * 
 * This backend application built with Spring represents a people registry system. Through a search bar, the user can search for records by specifying the person's
 * National ID number; the operations of adding, editing, and deleting records are configured so that only users with Administrator role can perform them.
 * Currently, there are two records in the database created by me as example, one with ID Number 11223344 and another with ID Number 00000011. The user's credentials
 * set by me (as example) are as follows:
 * 
 * (ROLE_USER) 
 * Username: user1 
 * Password: user12345
 * 
 * (ROLE_ADMIN) 
 * Username: admin1 
 * Password: admin12345
 *
 * A backup copy of the database can be found in the 'db_backup' folder within the project directory.
 * The project includes internationalization (i18n) for spanish and english, customizable error pages, and was made following Spring MVC architecture ('Model-View-Controller').
 * */

@SpringBootApplication
public class RegistroApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistroApplication.class, args);
	}

}
