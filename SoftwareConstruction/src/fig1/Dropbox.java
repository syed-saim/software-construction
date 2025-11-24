package fig1;

import java.util.HashMap;
import java.util.Map;

public class Dropbox implements CloudStorageProvider {

    private final Map<String, String> files = new HashMap<>();

    @Override
    public void storeFile(String name) {
        files.put(name, "File data for " + name);
        System.out.println("[Dropbox] Stored file: " + name);
    }

    @Override
    public String getFile(String name) {
        System.out.println("[Dropbox] Getting file: " + name);
        return files.get(name);
    }
}