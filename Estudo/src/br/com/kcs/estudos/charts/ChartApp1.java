package br.com.kcs.estudos.charts;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ChartApp1 extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		PieChart pieChart = new PieChart();
		pieChart.setData(getChartData());
		pieChart.setTitle("Tiobe Index");
		/*pieChart.setLegendSide(Side.LEFT);
		pieChart.setClockwise(false);
		pieChart.setLabelsVisible(false);*/
		
		primaryStage.setTitle("PieChart");
		
		StackPane root = new StackPane();
		root.getChildren().add(pieChart);
		Scene scene = new Scene(root, 400, 250);
		scene.getStylesheets().add(getClass().getResource("chartappstyle.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private ObservableList<PieChart.Data> getChartData() {
		ObservableList<PieChart.Data> answer = FXCollections.observableArrayList();
		answer.addAll(new PieChart.Data("java", 17.56),
				new PieChart.Data("C", 17.06),
				new PieChart.Data("C++", 8.25),
				new PieChart.Data("C#", 8.20),
				new PieChart.Data("ObjectiveC", 6.8),
				new PieChart.Data("PHP", 6.0),
				new PieChart.Data("(Visual)Basic", 4.76),
				new PieChart.Data("Other", 31.37));
		return answer;
	}

}
