package org.example.DesignPatterns.Singleton;
import java.util.concurrent.locks.ReentrantLock;
public class DBConnection {
    String url;
    String password;
    private static DBConnection instance = null;
    private DBConnection(String url, String password){
        this.password=password;
        this.url=url;
    }
    static DBConnection getInstance(String url, String password) {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if(instance==null){
                    instance=new DBConnection(url,password);
                }
                }
        }return instance;
    }
}
