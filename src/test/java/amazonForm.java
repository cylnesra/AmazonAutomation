import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestNG;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.example.tests.BaseTest.driver;

public class amazonForm {
    private JButton btnAyakkabi;
    private JTextArea basariliAlisverisTextArea;
    private JButton btnBebek;
    private JPanel mainPanel;
    private List<String> basariliBasvurular;

    public amazonForm() {
        basariliBasvurular = new ArrayList<>();

        btnAyakkabi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runSeleniumTestsFromTestNG("D:\\Automation\\amazon-automation-main\\amazon-automation\\ProductListenerLog.xml", "Kategori Ayakkabı Seçimi");
            }
        });

        btnBebek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runSeleniumTestsFromTestNG("D:\\Automation\\amazon-automation-main\\amazon-automation\\ProductBebekListener.xml","Kategori Bebek Seçimi");
            }
        });
    }

        public void runSeleniumTestsFromTestNG(String suitePath, String basvuruTuru) {
            System.out.println("TestNG ile test başlatılıyor: " + suitePath);

            TestNG testng = new TestNG();
            List<String> suites = new ArrayList<>();
            suites.add(suitePath);
            testng.setTestSuites(suites);


            testng.run();


            SwingUtilities.invokeLater(() -> {
                if (alisverisBasariliMi()) {
                    basariliBasvurular.add(basvuruTuru + " alışverişi başarılı!");
                    guncelleBasariliBasvurularTextArea();
                }
            });
        }

        public boolean alisverisBasariliMi() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            try {
                return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sc-subtotal-label-activecart"))).isDisplayed();
            } catch (Exception e) {
                System.out.println("Sepet sonucuna ulaşılamadı.");
                return false;
            }
        }

        private void guncelleBasariliBasvurularTextArea() {
            StringBuilder sb = new StringBuilder();
            for (String basvuru : basariliBasvurular) {
                sb.append(basvuru).append("\n");
            }

            basariliAlisverisTextArea.setText(sb.toString());
            System.out.println("Başarılı alışverişler güncelleniyor:\n" + sb.toString());
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("MainForm");
            amazonForm form = new amazonForm();
            frame.setContentPane(form.mainPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
}
