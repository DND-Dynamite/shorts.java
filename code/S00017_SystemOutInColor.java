/**
 * https://en.wikipedia.org/wiki/ANSI_escape_code
 */

public class S00017_SystemOutInColor {

    public static void main(String... args) {
        System.out.println("\033[0;31mhello, duke");
        System.out.println("\033[0;32mhello, duke");
        System.out.println("\033[0;33mhello, duke");
    }

}