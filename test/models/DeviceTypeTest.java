package models;

import static org.junit.Assert.assertEquals;
import models.metadata.DeviceType;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Contains unit tests for Device Type
 */
@RunWith(JUnit4.class)
public class DeviceTypeTest
{
   private static DeviceType deviceType;
   private static String TEST_ID = "1";
   private static String TEST_NAME = "testDeviceType";
   private static String TEST_MANUFACTURER = "testSensorType";
   private static Double TEST_VERSION = 1.00;

//public DeviceType(String id, String deviceTypeName, String manufacturer, double version) {

   /**
    * Setup a sensor object to test on
    */
   @BeforeClass
   public static void initSensor()
   {
      //deviceType = new DeviceType(TEST_ID, TEST_NAME, TEST_MANUFACTURER, TEST_VERSION);
   }
   
   /**
    */
   @Test
   public void getterTest()
   {
      String deviceName =  deviceType.getDeviceTypeName();
      //String deviceManufacturer = sensor.getManufacturer();
      //assertEquals(TEST_DEVICE, deviceName);
      //assertEquals(TEST_SENSORTYPE, deviceManufacturer);
   }
}

