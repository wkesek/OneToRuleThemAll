 int totalElements = 0;
    int visibleElements = 0;

    // Pobranie listy elementów
    List<WebElement> ads = driver.findElements( By.className( "css-1iq2gw3" ) );

    // Sprawdzenie widoczności elementów
    for (WebElement element : ads) {
      if (element.isDisplayed()) {
        visibleElements++;
      }
    }

    // Przewijanie strony do momentu, gdy nie zostaną znalezione nowe elementy
    while (true) {
      int previousVisibleElements = visibleElements;

      // Przewijanie strony do dołu
      ((JavascriptExecutor) driver).executeScript("window.scrollBy(200, 600");

      // Oczekiwanie na pojawienie się nowych elementów
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.presenceOfNestedElementsLocatedBy( "css-1iq2gw3" )));//(By.className( "css-1iq2gw3" )));

      // Pobranie zaktualizowanej listy elementów
      ads = driver.findElements(By.className( "css-1iq2gw3" ));

      // Ponowne sprawdzenie widoczności elementów
      for (WebElement element : ads) {
        if (element.isDisplayed()) {
          visibleElements++;
        }
      }

      // Zatrzymanie przewijania, gdy nie ma nowych elementów
      if (previousVisibleElements == visibleElements) {
        break;
      }
    }

    // Zwrócenie łącznej liczby elementów
    totalElements = visibleElements;

    return totalElements;