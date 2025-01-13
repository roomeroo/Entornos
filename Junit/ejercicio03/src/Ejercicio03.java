public class Ejercicio03 {
    public int charCount(String str, char c) {
        int index = 0;
        int counter = 0;
        while (index <= str.length() - 1) {
            if(str.charAt(index) == c)
                counter++;
            index++;
        }
        return counter;
    }
}