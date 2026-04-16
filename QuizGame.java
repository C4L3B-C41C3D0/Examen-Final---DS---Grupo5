import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char option;

        do {
            System.out.println("=== QUIZ DE FÚTBOL, TECNOLOGÍA E HISTORIA ===");
            System.out.println("Elige nivel de dificultad:");
            System.out.println("1) Fácil");
            System.out.println("2) Medio");
            System.out.println("3) Difícil");
            int level = sc.nextInt();

            int score = 0;

            if (level == 1) {
                // Preguntas fáciles
                System.out.println("Fútbol: ¿Quién es conocido como 'La Pulga'?");
                System.out.println("A) Cristiano Ronaldo  B) Lionel Messi  C) Neymar");
                char ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'B') score++;

                System.out.println("Tecnología: ¿Qué empresa creó Windows?");
                System.out.println("A) Apple  B) Microsoft  C) Google");
                ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'B') score++;

                System.out.println("Historia: ¿Quién descubrió América en 1492?");
                System.out.println("A) Cristóbal Colón  B) Simón Bolívar  C) Hernán Cortés");
                ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'A') score++;

            } else if (level == 2) {
                // Preguntas medias
                System.out.println("Fútbol: ¿Qué país ganó el Mundial 2014?");
                System.out.println("A) Alemania  B) Brasil  C) Argentina");
                char ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'A') score++;

                System.out.println("Tecnología: ¿Qué significa 'HTML'?");
                System.out.println("A) HyperText Markup Language  B) High Tech Modern Logic  C) Home Tool Management List");
                ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'A') score++;

                System.out.println("Historia: ¿En qué año cayó el Muro de Berlín?");
                System.out.println("A) 1989  B) 1975  C) 1999");
                ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'A') score++;

            } else if (level == 3) {
                // Preguntas difíciles
                System.out.println("Fútbol: ¿Qué jugador tiene más goles en Mundiales?");
                System.out.println("A) Miroslav Klose  B) Pelé  C) Ronaldo Nazário");
                char ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'A') score++;

                System.out.println("Tecnología: ¿Quién es considerado el padre de la computación?");
                System.out.println("A) Alan Turing  B) Charles Babbage  C) Bill Gates");
                ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'B') score++;

                System.out.println("Historia: ¿En qué año comenzó la Primera Guerra Mundial?");
                System.out.println("A) 1914  B) 1939  C) 1929");
                ans = sc.next().toUpperCase().charAt(0);
                if (ans == 'A') score++;
            }

            // Mostrar puntaje final
            System.out.println("\nTu puntaje final: " + score);
            if (score == 3) {
                System.out.println("¡Excelente, todas correctas!");
            } else if (score == 2) {
                System.out.println("Muy bien, casi perfecto.");
            } else if (score == 1) {
                System.out.println("Bien, pero puedes mejorar.");
            } else {
                System.out.println("Necesitas estudiar más, ¡ánimo!");
            }

            // Preguntar si quiere jugar otra vez
            System.out.println("\n¿Quieres jugar otra vez? (y/n)");
            option = sc.next().charAt(0);

        } while (option == 'y' || option == 'Y');

        System.out.println("Gracias por jugar.");
        sc.close();
    }
}
