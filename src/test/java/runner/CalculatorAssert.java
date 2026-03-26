package runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class CalculatorAssert {

    private static final Logger logger = LogManager.getLogger(CalculatorAssert.class);
    private static final double DELTA_FOR_ACCURACY = 0.0001;

    public static void assertAddition(double actual, double expected) {
        logger.info("Asserting double Addition: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect addition Expected: " + expected + ", but was: " + actual);
    }

    public static void assertAddition(long actual, long expected) {
        logger.info("Asserting long Addition: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected,
                "Incorrect addition Expected: " + expected + ", but was: " + actual);
    }

    public static void assertSubtraction(double actual, double expected) {
        logger.info("Asserting double Subtraction: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect subtraction Expected: " + expected + ", but was: " + actual);
    }

    public static void assertSubtraction(long actual, long expected) {
        logger.info("Asserting long Subtraction: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected,
                "Incorrect subtraction Expected: " + expected + ", but was: " + actual);
    }

    public static void assertMultiplication(double actual, double expected) {
        logger.info("Asserting double Multiplication: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect multiplication Expected: " + expected + ", but was: " + actual);
    }
    public static void assertMultiplication(long actual, long expected) {
        logger.info("Asserting long Multiplication: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected,
                "Incorrect multiplication Expected: " + expected + ", but was: " + actual);
    }

    public static void assertDivision(double actual, double expected) {
        logger.info("Asserting double Division expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect division Expected: " + expected + ", but was: " + actual);
    }
    public static void assertDivision(long actual, long expected) {
        logger.info("Asserting long Division expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected,
        "Incorrect division Expected: " + expected + ", but was: " + actual);
    }

    public static void assertValidationOfNumber(boolean actual, boolean expected){
        logger.info("Asserting VALIDATION number: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected,
        "Incorrect validation. Expected: " + expected + ", but was: " + actual );
    }

    public static void assertTangent(double actual, double expected) {
        logger.info("Asserting Tangent: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertSquare(double actual, double expected) {
        logger.info("Asserting Square: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertSine(double actual, double expected) {
        logger.info("Asserting Sine: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertPower(double actual, double expected) {
        logger.info("Asserting Power: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertCotangent(double actual, double expected) {
        logger.info("Asserting Cotangent: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect. Expected: " + expected + ", but was: " + actual);
    }

    public static void assertCosine(double actual, double expected) {
        logger.info("Asserting Cosine: expected={}, actual={}", expected, actual);

        Assert.assertEquals(actual, expected, DELTA_FOR_ACCURACY,
                "Incorrect. Expected: " + expected + ", but was: " + actual);
    }

}













