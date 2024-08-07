public class App {


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        RecordPlayer recordPlayer = new RecordPlayer();
        RecordAdapter recordAdapter = new RecordAdapter(recordPlayer);

        play(recordAdapter);
    }

    public static void play(CDPlayer cdPlayer) {
        cdPlayer.playCD();
    }
}
