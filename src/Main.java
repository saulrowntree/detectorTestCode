/**
 * javadoc test
 *
 * hack to allow insecure hashing algorithms to be used.
 *
 * WONT BE PICKED UP AS JAVADOC IGNORED
 *
 *
 *
 * javadoc test
 */

/* single line multiline test*/
/* multi line test




multi-line test
multi-line test*/
// single line test
/**  Single line javadoc test, completely innocent comment */
public class Main {
    /* single line multiline test*/
    //single line test doesn't work
    /* multi line test
    multi-line admission of use of SHA-1 hasing



    multi-line test
    multi-line test*/
    /** Single line javadoc test needs to be fixed */
    public static void main(String[] args) {


        if (true) {
            //single line test(
            /* single line multiline test*/
            /**  Single line javadoc test */
            /* multi line test
            
            verify this at a later date
            



            multi-line test
            multi-line test*/
        }

    }
}
