package singleton;

public class ConfigManager {
    private static ConfigManager instance;

    private String currency = "VND";
    private String appName = "Online Book Store";

    private ConfigManager() {}

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getCurrency() {
        return currency;
    }

    public String getAppName() {
        return appName;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

