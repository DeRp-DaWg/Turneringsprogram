import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try {
            IO io = new IO("TournamentTestFile");
            //io.readFromFile();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
