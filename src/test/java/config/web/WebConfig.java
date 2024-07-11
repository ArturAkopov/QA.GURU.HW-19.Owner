package config.web;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebConfig extends Config {

    @DefaultValue("chrome")
    String browser();

    @DefaultValue("121.0")
    String browserVersion();

    @DefaultValue("1920x1080")
    String browserSize();

    @DefaultValue("https://github.com/")
    String baseUrl();

    @DefaultValue("false")
    Boolean isRemote();

    @DefaultValue("https://github.com/")
    String remoteUrl();
}
