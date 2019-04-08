
package ConnectFour;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;

import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.annotations.Expose;

/** 
 * */
public class PlayerProcess {
    
    // Note: I think it might be interesting to have a
    // Driver.converter.toJson()
    private static final Gson jsonConverter = new Gson();
    
    private class PlayerMove {
        public int move;
    }
    
    private BufferedReader in;
    private OutputStreamWriter out;
    
    /** Constructor
     * */
    PlayerProcess(Process p) {
        in = new BufferedReader(new InputStreamReader(p.getInputStream()));
        out = new OutputStreamWriter(p.getOutputStream());
    }

    public void sendGrid(Board b) throws IOException {
        String json = b.toString();
        out.write(json, 0, json.length());
        out.write("\n", 0, 1);
        out.flush();
    }

    public int getMove() throws IOException {
        String line;
        while ((line = in.readLine()) != null) {
            PlayerMove pm = jsonConverter.fromJson(line, PlayerMove.class);
            return pm.move;
        }
        return -1;
    }

    public void close() throws IOException {
        in.close();
        out.close();
    }

}
