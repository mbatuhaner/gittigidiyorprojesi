package Constants;

import org.openqa.selenium.By;

import java.security.PublicKey;

public class Constants {

    public static String SAYFALINK = "https://www.gittigidiyor.com/";
    public static String TITLE = "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";
    public static String KULLANICI = "mbatuhaneraslan@gmail.com";
    public static String PW = "random123";
    public static String URUN = "bilgisayar";
    public static String SONRAKI_SAYFA_KONTROL = "https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2";
    public static final By KULLANICI_MENU = By.cssSelector("[data-cy='header-user-menu']");
    public static final By GIRIS = By.cssSelector("[data-cy='header-login-button']");
    public static final By KULLANICI_ADI = By.id("L-UserNameField");
    public static final By SIFRE = By.id("L-PasswordField");
    public static final By GIRIS_YAP = By.id("gg-login-enter");
    public static final By ARA = By.cssSelector("[data-cy='header-search-input']");
    public static final By BUL = By.cssSelector("[data-cy='search-find-button']");
    public static final By SONRAKI_SAYFA = By.className("next-link");
    public static final By URUN_LISTESI = By.className("product-hslider-container");
    public static final By ADET_ARTTIRMA = By.xpath("//a[@aria-label='Adeti Artır']");
    public static final By SEPETE_EKLE = By.id("add-to-basket");
    public static final By SEPETE_GIT = By.xpath("//span[text()='Sepetim']");
    public static final By TOPLAM_UCRET = By.xpath("//div[@class='total-price']");
    public static final By URUN_UCRETI = By.xpath("(//p)[14]");
    public static final By URUN_SAYISI = By.xpath("//div[@class='gg-d-16 detail-text']");
    public static final By COP_KUTUSU = By.className("gg-icon-bin-medium");
}
