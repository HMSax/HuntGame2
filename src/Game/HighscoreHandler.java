package Game;

import java.io.*;
import java.util.Scanner;

public class HighscoreHandler {
    private static HighscoreHandler instance;
    File highscoreFile = new File("src/TextFiles/Highscore.txt");
    int currentHighscore;

    private HighscoreHandler(){
        currentHighscore = getScoreFromFile();
    }
    public static HighscoreHandler getInstance() {
        if (instance == null) {
            instance = new HighscoreHandler();
        }
        return instance;
    }
    public int getCurrentHighscore() {
        return currentHighscore;
    }


    public void compareScore(int score){
        if (score > currentHighscore){
            currentHighscore = score;
            writeScoreToFile();
        }
    }

    private int getScoreFromFile() {
        try (Scanner scanner = new Scanner(highscoreFile)) {
            int score = scanner.nextInt();
            return score;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    private void writeScoreToFile(){
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(
                new FileWriter(highscoreFile)))) {
            writer.println(currentHighscore);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
