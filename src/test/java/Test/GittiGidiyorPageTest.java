package Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Base.BaseTest;
import Page.GittiGidiyorPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GittiGidiyorPageTest extends BaseTest {
    GittiGidiyorPage GittiGidiyorPage;
    private static Logger logger = LogManager.getLogger(GittiGidiyorPageTest.class);

    @Before
    public void before() {
        logger.info("---Driver ayağa kaldırılıyor---");
        GittiGidiyorPage = new GittiGidiyorPage(getWebDriver());
        logger.info("---Driver ayağa kaldırıldı---");
    }

    @Test
    public void testLogin() throws InterruptedException {
        logger.info("---proje başlatılıyor---");
        GittiGidiyorPage.baslangic().giris().arama().sonrakisayfa().randomClick().adetyukselt().sepeteekle().copkutusu();
        logger.info("---proje çalıştı---");
    }

    @After
    public void after() throws InterruptedException {
        logger.info("---Driver Kapatılıyor---");
        tearDown();
    }
}