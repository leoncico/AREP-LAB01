/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package escuelaing.edu.co.arep;

/**
 *
 * @author David Leonardo Pineros
 */
import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
 
public class AREP {
    private static final int PORT = 8080;
    public static final String WEB_ROOT = "target/classes/webroot";
    public static final Map<String, RESTService> services = new HashMap();
    public static final ExerciseService exerciseService = new ExerciseService();
    
    public static void main(String[] args) throws IOException {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        ServerSocket serverSocket = new ServerSocket(PORT);
        addServices();
 
        while (true) {
            Socket clientSocket = serverSocket.accept();
            threadPool.submit(new ClientHandler(clientSocket));
        }
    }
    
    private static void addServices(){
        services.put("addExercise", new AddExerciseService(exerciseService));
        services.put("listExerciseService", new ListExerciseService(exerciseService));
    }


}
