package src.utils;

public class PrettyPrint {
    public static void border(String content) {
        String[] lines = content.split("\n");
        int maxWidth = 0;

        // Find the longest line
        for (String line : lines) {
            if (line.length() > maxWidth) {
                maxWidth = line.length();
            }
        }

        int frameWidth = maxWidth + 6; // Padding for left/right spaces

        // Top border
        System.out.println(" __| |" + "_".repeat(frameWidth) + "| |__");
        System.out.println("(__   " + "_".repeat(frameWidth) + "   __)");

        // Empty line before content
        System.out.println("   | |" + " ".repeat(frameWidth) + "| |");

        // Content lines
        for (String line : lines) {
            System.out.println("   | |   " + line + " ".repeat(maxWidth - line.length()) + "   | |");
        }

        // Bottom border
        System.out.println(" __| |" + "_".repeat(frameWidth) + "| |__");
        System.out.println("(__   " + "_".repeat(frameWidth) + "   __)");
        System.out.println("   | |" + " ".repeat(frameWidth) + "| |");
    }
}
