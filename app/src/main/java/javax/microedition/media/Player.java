package javax.microedition.media;
import java.io.InputStream;

public interface Player {
    void start() throws Exception;
    void stop() throws Exception;
    void close();
    void setLoopCount(int count);
}
