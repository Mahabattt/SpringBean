package org.example.bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanApplication {

   public static void main(String [] args){
       ApplicationContext context = new AnnotationConfigApplicationContext("org.example.bean");
       LibraryService libraryService = context.getBean(LibraryService.class);
       libraryService.displayLibraryInfo();
   }
    }


