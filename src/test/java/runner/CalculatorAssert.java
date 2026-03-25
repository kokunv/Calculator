package runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class CalculatorAssert {

    private static final Logger logger = LogManager.getLogger(CalculatorAssert.class);
    private static final double DELTA_FOR_ACCURACY = 0.0001;

    public static void assertSum(double actual, double expected) {
        logger.info("Asserting double SUM: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect sum. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertSum(long actual, long expected) {
        logger.info("Asserting long SUM: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected,
                "Incorrect sum. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertSub(double actual, double expected) {
        logger.info("Asserting double SUB: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect subtraction. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertSub(long actual, long expected) {
        logger.info("Asserting long SUB: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected,
                "Incorrect subtraction. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertMult(double actual, double expected) {
        logger.info("Asserting double MULT: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect multiplication. Expected: " + expected + ", but was: " + actual);
    }
    public static void assertMult(long actual, long expected) {
        logger.info("Asserting long MULT: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected,
                "Incorrect multiplication. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertDiv(double actual, double expected) {
        logger.info("Asserting double DIV: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect division. Expected: " + expected + ", but was: " + actual);
    }
    public static void assertDiv(long actual, long expected) {
        logger.info("Asserting long DIV: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected,
        "Incorrect division. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertValidationOfNumber(boolean actual, boolean expected){
        logger.info("Asserting VALIDATION number: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected,
        "Incorrect validation. Expected: " + expected + ", but was: " + actual );
    }

    public static void assertTg(double actual, double expected) {
        logger.info("Asserting TG: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertSqrt(double actual, double expected) {
        logger.info("Asserting SQRT: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertSin(double actual, double expected) {
        logger.info("Asserting SIN: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertPow(double actual, double expected) {
        logger.info("Asserting POW: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertCtg(double actual, double expected) {
        logger.info("Asserting CTG: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertCos(double actual, double expected) {
        logger.info("Asserting COS: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect. Expected: " + expected + ", but was: " + actual);
    }

}













