package runner.browser_manager;


public class DriverManagerFactory {

    public static DriverManager getDriverManager(DriverType type) {

        DriverManager driverManager = null;

        switch (type){
            case CHROME:

                driverManager = new ChromeDriverManager();
                break;

            case FIREFOX:

                driverManager = new FirefoxDriverManager();
                break;

                default:
                    System.out.println("Invalid driver type");
                    break;
        }

        return driverManager;

    }

}
