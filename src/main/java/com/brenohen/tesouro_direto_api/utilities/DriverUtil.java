package com.brenohen.tesouro_direto_api.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

@Service
public class DriverUtil {
    public static WebDriver initializeDriver() {


        // capturando o arquivo msedgedriver.exe na pasta resources
        try {
            URL resource = DriverUtil.class.getClassLoader().getResource("msedgedriver.exe");
            if (resource != null) {
                Path absolutePath = Paths.get(resource.toURI());
                System.setProperty("webdriver.edge.driver", absolutePath.toString());
                System.out.println("Caminho absoluto do driver: " + System.getProperty("webdriver.edge.driver"));
            } else {
                System.err.println("Arquivo não encontrado: msedgedriver.exe");
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", null);
        options.addArguments("Window-size=1200,800");
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
        return new EdgeDriver(options);
    }
}
