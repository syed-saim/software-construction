package fig1;
import java.util.*;

public class Amazon implements CloudHostingProvider, CDNProvider, CloudStorageProvider {

    private final Map<String, String> files = new HashMap<>();
    private final Map<String, List<String>> serversByRegion = new HashMap<>();
    private String cdnAddress = "cdn.amazon.example.com";

    @Override
    public void storeFile(String name) {
        files.put(name, "File data for " + name);
        System.out.println("[Amazon] Stored file: " + name);
    }

    @Override
    public String getFile(String name) {
        String data = files.get(name);
        System.out.println("[Amazon] Getting file: " + name);
        return data;
    }

    @Override
    public void createServer(String region) {
        serversByRegion
                .computeIfAbsent(region, r -> new ArrayList<>())
                .add("server-" + (serversByRegion.get(region).size() + 1));
        System.out.println("[Amazon] Created server in region: " + region);
    }

    @Override
    public List<String> listServers(String region) {
        return serversByRegion.getOrDefault(region, Collections.emptyList());
    }

    @Override
    public String getCDNAddress() {
        System.out.println("[Amazon] Returning CDN address");
        return cdnAddress;
    }
}