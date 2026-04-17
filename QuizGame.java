import java.util.Scanner;

public class QuizGame {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        char option;

        do { 
            System.out.println("===Juego de Adivinanza===");
            System.out.println("Elige nivel de dificultad:");
            System.out.println("1) Fácil");
            System.out.println("2) Medio");
            System.out.println("3) Difícil");
            int level = sc.nextInt();

            int score = 0;

            if (level == 1) {
                // Preguntas fáciles
                System.out.println("¿Qué significa 'CPU'?");
                System.out.println("A) Central Processing Unit  B) Computer Personal Utility  C) Control Program Unit");
                char ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'A') score++;

                System.out.println("¿Qué empresa creó Windows?");
                System.out.println("A) Apple  B) Microsoft  C) Google");
                ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'B') score++;

                System.out.println("¿Qué navegador pertenece a Google?");
                System.out.println("A) Safari  B) Chrome  C) Edge");
                ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'B') score++;

            } else if (level == 2) {
                // Preguntas medias
                System.out.println("¿Qué significa 'HTML'?");
                System.out.println("A) HyperText Markup Language  B) High Tech Modern Logic  C) Home Tool Management List");
                char ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'A') score++;

                System.out.println("Qué empresa desarrolló el sistema operativo Android?");
                System.out.println("A) Apple  B) Google  C) Microsoft");
                ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'B') score++;

                System.out.println("¿Qué lenguaje se usa principalment para páginas web dinámicas?");
                System.out.println("A) JavaScript  B) Python  C) C++");
                ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'A') score++;

            } else if (level == 3) {
                //Preguntas difíciles 
                System.out.println("¿Quién es considerado el padre de la computación?");
                System.out.println("A) Alan Turing B) Charles Babbage  C) Bill Gates");
                char ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'B') score++;

                System.out.println("¿Qué protocolo se usa para transferir archivos en internet?");
                System.out.println("A) FTP  B) SMTP  C) HTTP");
                ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'A') score++;

                System.out.println("¿En qué año se lanzó la primera versión de Java?");
                System.out.println("A) 1995  B) 2000  C) 1989");
                ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'A') score++;
            }
        
            //mostrar puntaje final 
            System.out.println("\nTu puntaje final:" + score);
            if (score == 3) {
                System.out.println("¡Excelente, todas correctas!");
            } else if (score == 2) {
                System.out.println("Muy bien, casi perfecto.");
            } else if (score == 1) {
                System.out.println("Bien, pero puedes mejorar.");
            } else {
                System.out.println("Necesitas estudiar más, ¡ánimo!");
            }

            //Preguntar si quiere jugar otra vez
            System.out.println("\n¿Quieres jugar otra vez? (y/n)");
            option = sc.next().charAt(0);

        } while (option == 'y'|| option == 'Y');
        System.out.println("Gracias por jugar.");
        sc.close();
    }
}