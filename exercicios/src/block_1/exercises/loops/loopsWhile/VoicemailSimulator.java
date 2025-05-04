package block_1.exercises.loops.loopsWhile;

import java.util.Scanner;

public class VoicemailSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int messageCount = 0;

        System.out.println("How many messages do you have?");
        int totalMessages = scanner.nextInt();

        if (totalMessages == 0) {
            System.out.println("⚠️ No new messages.");
        }

        while (messageCount != totalMessages) {
            messageCount++;
            System.out.println("🔊 Playing message " + messageCount + "...");
        }

        System.out.println("✅ All messages have been played.");
        scanner.close();
    }
}
