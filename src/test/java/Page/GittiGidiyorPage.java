package Page;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static Constants.Constants.*;

public class GittiGidiyorPage extends BasePage {


    public GittiGidiyorPage(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = LogManager.getLogger(BasePage.class);

    public GittiGidiyorPage baslangic() { //web sitesinin title'ı kontrol ediliyor ve başlangıç koşulları doğrulanıyor.
        logger.info("---başlangıç koşulları hazırlanıyor.---");
        assertionPage(TITLE);
        hoverElement(KULLANICI_MENU);
        logger.info("---başlangıç koşulları doğru yapıldı.---");
        return this;
    }
    public GittiGidiyorPage giris() throws InterruptedException {
        logger.info("---Üye girişi yapılıyor.---");
        click(GIRIS);
        sendKeys(KULLANICI_ADI,KULLANICI);
        sendKeys(SIFRE,PW);
        click(GIRIS_YAP);
        Thread.sleep(5000);
        assertionPage(TITLE);
        logger.info("---Üye girişi yapıldı.---");
        return this ;
    }

    public GittiGidiyorPage arama(){ // arama kutucuğuna bilgisayar kelimesi yazılıyor ve bula tıklanıyor.
        logger.info(URUN +"--- arama kutusuna bilgisayar kelimesi yazıldı---");
        findElement(ARA);
        sendKeys(ARA,URUN);
        click(BUL);
        logger.info(URUN + " bulundu.");
        return this ;

    }

    public GittiGidiyorPage sonrakisayfa(){ // sonraki sayfaya geçmek için ileri tuşu bulunuyor ve basılıyor. İkinci sayfada olunduğu linkten kontrol ediliyor.
        logger.info("---sonraki sayfaya geçiş yapılıyor.---");
        scrollToElement(SONRAKI_SAYFA);
        click(SONRAKI_SAYFA);
        assertionUrl(SONRAKI_SAYFA_KONTROL);
        logger.info("---sonraki sayfaya geçiş başarıyla yapıldı.---");
        return this;
    }
    public GittiGidiyorPage randomClick(){ // sayfada herhangi bir görsele tıklanıyor.
        randomItemClick(URUN_LISTESI);
        logger.info("---random ürün seçimi yapılıyor.---");
        return this;
    }

    public GittiGidiyorPage copkutusu(){ // son olarak ürün siliniyor.
        click(COP_KUTUSU);
        logger.info("---çöp kutusuna tıklanıyor.---");
        return this;
    }

    public GittiGidiyorPage adetyukselt(){ // adet arttırmaya tıklanıyor.
        logger.info("---adet arttırılıyor.---");
        scrollToElement(ADET_ARTTIRMA);
        click(ADET_ARTTIRMA);
        logger.info("---adet arttırıldı.---");
        return this;
    }

    public GittiGidiyorPage sepeteekle(){ //ürünlerin sepete eklenmeden önceki ve sonraki fiyatları karşılaştırılıyor. Ürün adeti kontrol ediliyor.
        logger.info("---Ürün sepete ekleniyor, sepete gidiliyor ve ürün adedi kontrol ediliyor.---");
        click(SEPETE_EKLE);
        click(SEPETE_GIT);
        Assert.assertEquals(findElement(TOPLAM_UCRET).getText(), findElement(URUN_UCRETI).getText());
        Assert.assertEquals(findElement(URUN_SAYISI).getText(), "Ürün Toplamı (2 Adet)");
        logger.info("---Ürün sepete eklendi, sepete gidildi ve adet kontrol edildi.---");
        return this;
    }




}

