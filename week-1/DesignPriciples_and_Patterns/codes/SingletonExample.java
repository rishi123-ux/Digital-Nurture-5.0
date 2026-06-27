package DesignPriciples_and_Patterns.codes;

class ServiceLogger {

    private static ServiceLogger instance;

    private ServiceLogger() {
        System.out.println("Logger Instance Created");
    }

    public static ServiceLogger getInstance() {
        if (instance == null) {
            instance = new ServiceLogger();
        }
        return instance;
    }

    public void logMessage(String message) {
        System.out.println("LOG: " + message);
    }
}

public class SingletonExample {

    public static void main(String[] args) {

        ServiceLogger firstLogger = ServiceLogger.getInstance();
        ServiceLogger secondLogger = ServiceLogger.getInstance();

        firstLogger.logMessage("Application Started");
        secondLogger.logMessage("User Logged In");

        System.out.println("firstLogger HashCode: " + firstLogger.hashCode());
        System.out.println("secondLogger HashCode: " + secondLogger.hashCode());

        if (firstLogger == secondLogger) {
            System.out.println("Only One Logger Instance Exists");
        } else {
            System.out.println("Multiple Instances Created");
        }
    }
}