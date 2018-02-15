/*
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

package com.dhms.Dashboard;

import com.byteowls.vaadin.chartjs.ChartJs;
import com.byteowls.vaadin.chartjs.config.PieChartConfig;


/**
 * DeviceChart class is called by Chart classes to create meshes piecharts for UI graphical data
 * display DeviceChart title is initialized to a String
 */
public class DevicesChart extends PieChart {

  private String title = "Devices Status Chart";

  /**
   * Default Constructor
   */
  public DevicesChart() {
  }


  /**
   * DevicesChart Constructor initializes healthy and unhealthy piechart parameters
   */
  public DevicesChart(int healthy, int not_healthy) {
    this.healthy = healthy;
    this.not_healthy = not_healthy;
  }

  //TODO: config()
  /*
  @Override
  protected PieChartConfig config() {
    PieChartConfig config = new PieChartConfig();
    config
        .data()
        .labels("Healthy (" + healthy + ")", "Not healthy(" + not_healthy + ")")
        .addDataset(new PieDataset().label("Devices"))
        .and();
    config.
        options()
          .responsive(true)
          .title()
          .display(true)
          .text("Current Device Statuses")
        .and()
          .animation()
          .animateScale(true)
        .and()
          .legend()
            .fullWidth(true)
        .and()
        .done();
    return config;
  }
  */


  /**
   * createChart creates a ChartJs chart object using a piechart config object.
   *
   * @return returns a ChartJs chart object to the caller to display a UI devices piechart
   */
  @Override
  protected ChartJs createChart() {
    PieChartConfig config = config();

    ChartJs chart = new ChartJs(config);
    //chart.setJsLoggingEnabled(true);

    //chart.setWidth("100%");
    //chart.setHeight("450px");
    return chart;
  }
}
