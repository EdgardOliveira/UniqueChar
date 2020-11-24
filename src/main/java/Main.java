/**
 * Edgard Oliveira
 * input: axaaababawaax
 * output: w
 */
public class Main {
    public static void main(String[] args) {

        String s = "axaaababawaax";
        int unq = -1;

        for (int i = 0; i < s.length(); i++) {
            System.out.println("Pivo: " + s.charAt(i));

            for (int j = 0; j < s.length(); j++) {
                if (i != j) { //Não comparar com ele mesmo

                    System.out.println(" Comparado " + s.charAt(i) + " com " + s.charAt(j));
                    if (s.charAt(i) == s.charAt(j))
                        break; //sai do loop se ja encontrou igual
                    else if (s.charAt(i) != s.charAt(j))
                        if (j == s.length() - 1)
                            unq = i;
                }
            }
        }

        if (unq != -1)
            System.out.println(s.charAt(unq));
    }
}
