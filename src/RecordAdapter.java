public class RecordAdapter extends CDPlayer {
    
    private RecordPlayer recordPlayer;

    public RecordAdapter(RecordPlayer recordPlayer) {
        this.recordPlayer = recordPlayer;
    }

    public void playCD() {
        recordPlayer.playRecord();
    }
}
