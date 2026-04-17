# Web Testing Automation

This project is a Selenium-based test automation framework for testing the login functionality of the [Practice Test Automation](https://practicetestautomation.com/practice-test-login/) website.

## Technologies Used
- **Selenium WebDriver**: For browser automation
- **TestNG**: For test execution and reporting
- **ExtentReports**: For detailed test reports
- **Maven**: For dependency management

## Prerequisites
- Java 17 or higher
- Maven 3.x
- Google Chrome browser (for ChromeDriver)

## Setup and Execution
1. Clone the repository:
   ```
   git clone <repository-url>
   cd webtesting
   ```

2. Install dependencies:
   ```
   mvn clean install
   ```

3. Run the tests:
   ```
   mvn test
   ```

## Project Structure
- `src/main/java/base/`: Base test class with setup/teardown
- `src/main/java/pages/`: Page Object Model classes (e.g., LoginPage)
- `src/main/java/tests/`: Test classes (e.g., LoginTest)
- `src/main/java/utils/`: Utility classes (ConfigReader, TestData, ExtentManager, TestListener)
- `src/test/resources/`: Configuration files (config.properties)
- `reports/`: Generated test reports (extent-report.html)

## Configuration
Update `src/test/resources/config.properties` to modify:
- Base URL
- Browser type
- Valid credentials

## Reports
After running tests, view the detailed report at `reports/extent-report.html`.
