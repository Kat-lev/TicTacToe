package com.tictactoe;
public class Welcome {
    public static void main(String[] args) {
        printWelcomeMessage();
    }
    public static void printWelcomeMessage() {
        String asciiArt = """
        ██╗  ██╗ ██████╗ ██╗      █████╗    
        ██║  ██║██╔═══██╗██║     ██╔══██╗   
        ███████║██║   ██║██║     ███████║   
        ██╔══██║██║   ██║██║     ██╔══██║   
        ██║  ██║╚██████╔╝███████╗██║  ██║   
        ╚═╝  ╚═╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝     
        """;
      
        String welcomeMessage = """
        ════════════════════════════════════
           ¡Bienvenide al juego del Gato!    
                ¿Liste para jugar?   
        ════════════════════════════════════
        """;
      
        System.out.println(asciiArt);
        System.out.println(welcomeMessage);
        System.out.println("  ¡Elige tu movimiento y diviértete! 🎮");
        System.out.println("   _.---.._             _.---...__\n" +
        ".-'   /\\   \\          .'  /\\     /\n" +
        "`.   (  )   \\        /   (  )   /\n" +
        "  `.  \\/   .'\\      /`.   \\/  .'\n" +
        "    ``---''   )    (   ``---''\n" +
        "            .';.--.;`.\n" +
        "          .' /_...._\\ `.\n" +
        "        .'   `.a  a.'   `.\n" +
        "       (        \\/        )\n" +
        "        `.___..-'`-..___.'\n" +
        "           \\          /\n" +
        "            `-.____.-'");
        

    }
}