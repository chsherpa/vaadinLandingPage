package com.dhms.Dashboard;
import com.byteowls.vaadin.chartjs.ChartJs;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("valo")
@SuppressWarnings("serial")
public class DashboardLayout extends UI{

  //This is the main function
  @Override
  protected void init(VaadinRequest vaadinRequest) {

  }
}
//https://vaadin.com/docs/v8/framework/layout/layout-overview.html
//https://vaadin.com/api/com/vaadin/ui/Layout.html

///*
//
///**
// * Dashboard UI class creates Mesh, Devices, Mesh History, and Devices History charts to be
// * displayed as chart data for the user
// */
//@SpringUI
//@Theme("valo")
//@SuppressWarnings("serial")
//@Widgetset("com.nemo.dhms.widgetset.SmartVineyardsWidgetSet")
//public class DashboardUI extends UI {
//
//  /**
//   * GridLayout creates a grid for use in placing chart objects for display in the UI
//   *
//   * @param x is the number of columns in the grid
//   * @param y is the number of rows in the grid
//   * @return - returns a GridLayout object to the caller
//   */
//  protected GridLayout grid(int x, int y) {
//    GridLayout gridConfig = new GridLayout();
//    gridConfig.getComponent(x, y);
//    return gridConfig;
//  }
//
//  /**
//   * Layout for arranging UI components vertically
//   *
//   * @return - returns a verticalLayout object to the caller
//   */
//  protected VerticalLayout verticalLayoutConfig() {
//    VerticalLayout vlayout = new VerticalLayout();
//    return vlayout;
//  }
//
//  /**
//   * init proccesses each UI display request
//   */
//  @Override
//  protected void init(VaadinRequest request) {
///*
//    // Create the content root layout for the UI
//    VerticalLayout vlayout = verticalLayoutConfig();
//\*/
//    VerticalLayout rootLaylout = verticalLayoutConfig();
//    GridLayout gridLayout = new GridLayout(3, 2); //TODO fix put back 3,2
//
//    // Have a clickable button
//
//    //Pie Charts
//    gridLayout.addComponent(meshHistoryPrompt(), 0, 0);
////    gridLayout.getComponent(0, 0).setHeight("250px");
//    gridLayout.addComponent(MeshChart(), 1, 0);
//    gridLayout.addComponent(DevicesChart(), 2, 0);
//    gridLayout.setSpacing(true);
//    gridLayout.setWidth("100%");
//
//    rootLaylout.addComponent(googleMapVerticalLayout());
//    rootLaylout.addComponent(gridLayout);
//    rootLaylout.setWidth("100%");
//    rootLaylout.setSpacing(true);
////    rootLaylout.setResponsive(true);  //TODo : remove?
//
//    Panel panel = new Panel();
//    panel.setContent(rootLaylout);
//    panel.setHeight("1200px");
////    panel.setResponsive(true); //TODo : remove?
//
//    setContent(panel);
//  }
//
//  /**
//   * Creates a Mesh Chart using a DashboardController object
//   *
//   * @return - returns a Mesh chart object
//   */
//  private ChartJs MeshChart() {
//    return DashboardController.createMeshChart();
//  }
//
//  /**
//   * Creates a Mesh History Chart using a DashboardController object
//   *
//   * @return - returns a Mesh History chart object
//   */
//  private ChartJs MeshHistory() {
//    return DashboardController.createMeshChart();
//  }
//
//  /**
//   * Creates a Devices History Chart using a DashboardController object
//   *
//   * @return - returns a Devices History chart object
//   */
//  private ChartJs DevicesHistory() {
//    return DashboardController.createDevicesHistory();
//  }
//
//  /**
//   * Creates a Devices Chart using a DashboardController object
//   *
//   * @return - returns a DevicesChart object
//   */
//  private ChartJs DevicesChart() {
//    return DashboardController.createDevicesChart();
//  }
//
//  private VerticalLayout meshHistoryPrompt() {
//    return DashboardController.meshHistoryPrompt();
//  }
//
//  private VerticalLayout googleMapVerticalLayout() {
//    return DashboardController.googleMapVerticalLayout();
//  }
//}
