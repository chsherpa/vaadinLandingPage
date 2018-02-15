package com.dhms.Dashboard;

import com.byteowls.vaadin.chartjs.ChartJs;
import com.byteowls.vaadin.chartjs.config.LineChartConfig;
import com.byteowls.vaadin.chartjs.data.LineDataset;

public class LineChart {

  protected int healthy = 20;
  protected int not_healthy = 10;
  protected String title = "Parent Line Chart";
  protected String labelHealthy = "Healthy";
  protected String labelNotHealthy = "Not Healthy";

  /**
   * LineChart() draws LineCharts to graphically display data on UI
   */
  protected LineChart() {
  }


  /**
   * LineChartConfig is used by LineChart class to configure data and labels for lineCharts
   *
   * @return returns a LineChart config object
   */
  protected LineChartConfig config() {
    LineChartConfig config = new LineChartConfig();
    config
        .data()
        .labels("Healthy (" + healthy + ")", "Not healthy(" + not_healthy + ")")
        .addDataset(new LineDataset().label("Devices"))
        .and();
    config.
        options()
        .responsive(true)
        .title()
        .display(true)
        .text("Current Device Statuses")
        .and()
        .animation()
        //   .animateScale(true)
        .and()
        .legend()
        .fullWidth(true)
        .and()
        .done();
    return config;
  }

  /**
   * createChart creates a ChartJs chart object using a lineChart config object.
   *
   * @return returns a ChartJs chart object to the caller to display a UI lineChart
   */
  protected ChartJs createChart() {
    LineChartConfig config = config();

    ChartJs chart = new ChartJs(config);
    //chart.setJsLoggingEnabled(true);

    //chart.setWidth("100%");
    //chart.setHeight("450px");
    return chart;
  }


}
