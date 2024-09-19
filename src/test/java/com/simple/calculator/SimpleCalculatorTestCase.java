package com.simple.calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleCalculatorTestCase extends BaseTest{
    @Test
    public void addShouldSuccess(){
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("plus")).click();
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.id("equal")).click();

        Assert.assertEquals(driver.findElement(By.id("formula")).getText().trim(),17);

    }
    @Test
    public void minusShouldSuccess(){
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("minus")).click();
        driver.findElement(By.id("btn_8")).click();
        driver.findElement(By.id("equal")).click();

        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "4");

    }
@Test
    public void multipleShouldSuccess(){
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("multi")).click();
        driver.findElement(By.id("btn_8")).click();
        driver.findElement(By.id("equal")).click();

        Assert.assertEquals(driver.findElement(By.id("formula")).getText().trim(),96);

        Assert.assertEquals(driver.findElement(By.id("formula")).getText().trim(),96);


    }




}
