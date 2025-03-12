package UTILS;

public class ACTIONS {

    public static String getMethodName(){

        String methodName = "";

        try {

            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            methodName = stackTrace[2].getMethodName();

        }catch (Exception e){
            System.out.println("An error has ocured: "+e.getCause()+"In getMethodName");
        }

        return methodName;

    }

}
