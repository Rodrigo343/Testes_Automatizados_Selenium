package br.com.alura.leilao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObeject {
    protected WebDriver browser;

    public PageObeject(WebDriver browser) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        if (browser == null){
            this.browser = new ChromeDriver();
        }else{
            this.browser = browser;
        }
    }

    public void fechar() {
        this.browser.quit();
    }

}
