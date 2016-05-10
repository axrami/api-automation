package lpApiAutomation;

import lpApiAutomation.configuration.LPMobileConfig;
import lpApiAutomation.configuration.LPMobileConfigBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by andrew on 4/9/16.
 */
public class Main {
    public static Logger logger = LoggerFactory.getLogger("Main");
    private static LPMobileConfigBuilder configBuilder = new LPMobileConfigBuilder();
    public static void main(String args[]) {
        if(args.length > 1) {
            printHelpMessage();
        } else {
            for(String arg : args) {
                if(arg.equals("-help")){
                    printHelpMessage();
                } else {
                    if(!arg.contains("=")){
                        System.out.println("invalid arg: " + arg);
                        printHelpMessage();
                    } else {
                        String param = arg.split("=")[0];
                        String value = arg.split("=")[1];
                        parseArgs(param, value);
                    }
                }
            }
            configBuilder.build();
        }
    }

    public static void parseArgs(String param, String value){
        switch (param) {
            case "-visits":
                configBuilder.setVisits(Integer.parseInt(value));
                logger.debug("setting visits: " + value);
                break;
            case "-chats":
                configBuilder.setChats(Integer.parseInt(value));
                logger.debug("setting chats: " + value);
                break;
            case "-time":
                configBuilder.setRunTime(Integer.parseInt(value));
                logger.debug("setting time: " + value);
                break;
            case "-environment":
                configBuilder.setEnvironment(value);
                logger.debug("setting environment: " + value);
                break;
            case "-appid":
                configBuilder.setAppid(value);
                logger.debug("setting appid: " + value);
                break;
            case "-platform":
                logger.debug("setting platform: " + value);
                if(value.equalsIgnoreCase("ios")) {
                    configBuilder.setPlatform("Apple iOS");
                } else if(value.equalsIgnoreCase("web")){
                    configBuilder.setPlatform("Web");
                } else if(value.equals("android")) {
                    configBuilder.setPlatform("Android");
                } else {
                    logger.debug("invalid platform: " + value);
                    System.exit(1);
                }
                break;
            case "-report":
                logger.debug("setting report values: " + value);
                configBuilder.setReport(value);
                break;
            case "-properties":
                configBuilder.setPropertiesFilePath(value);
                logger.debug("setting properties path: " + value);
                break;
            case "-loadTest":
                configBuilder.setIsLoadTest(Boolean.getBoolean(value));
                logger.debug("setting loadTest: " + value);
                break;
            default:
                printHelpMessage();
                throw new IllegalArgumentException(param);
        }
    }

    public static void printHelpMessage() {
        System.out.println("Backend automation commands \n" +
                "-visits        : define/override visit count \n" +
                "-chats         : define/override chat count \n" +
                "-time          : define/override runtime duration in seconds \n" +
                "-environment   : production, staging, staging-vpc, dev, production-vpc \n" +
                "-appid         : define/override appid \n" +
                "-platform      : Web, ios, Android \n" +
                "-properties    : path to properties file \n" +
                "-report        : define where to report results html/json/s3");
        System.exit(0);
    }
}
