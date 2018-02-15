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
import com.byteowls.vaadin.chartjs.data.PieDataset;


/**
 * PieChart class is called by Chart classes to create PieCharts for UI graphical data display
 */
public class PieChart {

  protected int healthy = 0;
  protected int not_healthy = 0;
  protected String title = "Parent Pie Chart";
  protected String labelHealthy = "Healthy";
  protected String labelNotHealthy = "Not Healthy";


  /**
   * PieChart() draws PieCharts to graphically display data on UI
   */
  protected PieChart() {
  }


  /**
   * PieChartConfig is used by PieChart class to configure data and labels for piecharts
   *
   * @return returns a PieChart config object
   */
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

  /**
   * createChart creates a ChartJs chart object using a piechart config object.
   *
   * @return returns a ChartJs chart object to the caller to display a UI piechart
   */
  protected ChartJs createChart() {
    PieChartConfig config = config();

    ChartJs chart = new ChartJs(config);
    //chart.setJsLoggingEnabled(true);

    //chart.setWidth("100%");
    //chart.setHeight("450px");
    return chart;
  }
}
