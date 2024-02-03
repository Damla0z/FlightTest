package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

    public class ReusableMethods {

    public static void bekle (int saniye) {

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static List<String> stringListeCevir(List<WebElement> webElementList) {

        List<String> stringList = new ArrayList<>();
        for (WebElement eachElement : webElementList
        ) {
            stringList.add(eachElement.getText());
        }

        return stringList;
    }


}
