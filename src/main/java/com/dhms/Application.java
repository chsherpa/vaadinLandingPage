package com.dhms;/*
 * MIT License
 *
 * Copyright (c) 2018 Alex Michael, Andy Mayer, Bin Chen, Chhewang Sherpa, Mackenzie Wangenstein, Warren Black
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

//TODO: Write JavaDoc
@SpringBootApplication
@EnableScheduling
public class Application {

  private static final Logger log = LoggerFactory.getLogger(Application.class);

  //TODO: Write JavaDoc
  public static void main(String[] args) {
    /*
    log.info("Setting SensMit API key...");
    String sensmitKey = System.getenv("SENSMIT_KEY");
    SensmitConnector.setSensmitApiKey(sensmitKey);
    log.debug("SensMit API key: " + sensmitKey);

    log.info("Setting Google Maps API key...");
    String googleMapsKey = System.getenv("GOOGLE_MAPS_KEY");
    DashboardController.setGoogleMapsApiKey(googleMapsKey);
    log.debug("Google Maps API key: " + googleMapsKey);

    log.info("Initializing DataController...");
    DataController.init();

    log.info("Initializing SystemController...");
    SystemController.init();

    log.info("Starting Spring application...");
    */
    SpringApplication.run(Application.class);
  }
}
