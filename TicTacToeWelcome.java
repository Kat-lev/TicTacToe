public class TicTacToeWelcome {
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
            ¡Bienvenide a Tic-Tac-Toe!    
          ¿Serás el maestro del juego?   
        ════════════════════════════════════
        """;
      
        System.out.println(asciiArt);
        System.out.println(welcomeMessage);
        System.out.println("  ¡Elige tu movimiento y diviértete! 🎮");
    }
}