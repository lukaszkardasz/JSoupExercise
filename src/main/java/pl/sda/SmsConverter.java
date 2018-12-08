package pl.sda;

public class SmsConverter {

    String convert(String message) {
        String[] words = message.split(" ");
        String newMessage = "";

        for (String word : words) {
            if (word.isEmpty()) continue;

            //chce dodać pierwsza litere dużą
            newMessage += word.toUpperCase().charAt(0);

            //chce dodać reszte wyrazu
            newMessage += word.substring(1);
        }

        return newMessage;
    }
}
