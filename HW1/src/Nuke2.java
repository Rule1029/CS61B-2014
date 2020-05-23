import java.io.*;

class Nuke2 {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard;
        String inputLine;

        keyboard = new BufferedReader(new InputStreamReader(System.in));
        inputLine = keyboard.readLine();
        String target = "" + inputLine.charAt(1);
        inputLine = inputLine.replaceFirst(target, "");
        System.out.println(inputLine);
    }
}