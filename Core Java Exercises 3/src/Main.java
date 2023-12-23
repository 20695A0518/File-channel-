import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileChannel obj1=FileChannel.open(Path.of("C:\\Users\\AD41928\\IdeaProjects\\Core Java Exercises 3\\src\\some good quotes.txt"), StandardOpenOption.READ);
        ByteBuffer rb=ByteBuffer.allocate(4094);
        List<String> li=new ArrayList<>();
        obj1.read(rb);
        rb.flip();
        Charset utf= StandardCharsets.UTF_8;
        CharBuffer rcb=utf.decode(rb);
        li.add(rcb.toString());
        obj1.close();

        for (String a:li
        ) {
            System.out.println(a);

        }
    }
}