package com.diegomartinez.commanumbers.utils;

public class Constants {
    public static String COMMA = ",";
    public static String AVG = "average: ";
    public static String MAX = "max: ";
    public static String MIN = "min: ";
    public static String SUM = "sum: ";
    public static String BLANK_SPACE= " ";
    public static String CALC = "Calculated";
    public static String WRONG = "Something went wrong";
    public enum ResponseConstant{
        SUCCESS("SUCCESS"),
        FAILURE("FAILURE");

        private String description;

        ResponseConstant(final String description){
            this.description = description;
        }

        public String getDescription(){
            return this.description;
        }


    }
}
