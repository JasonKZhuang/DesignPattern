package creationalPatterns.SimpleFactory;

import creationalPatterns.SimpleFactory.ChartExample.Chart;
import creationalPatterns.SimpleFactory.ChartExample.ChartFactory;
import creationalPatterns.SimpleFactory.ChartExample.XMLUtilChart;

public class ClientChart
{
	public static void main(String[] args)
	{
		Chart chart;
		//Create product by static factory method
		chart = ChartFactory.getChart("histogram"); 
		chart.display();
		
		chart = ChartFactory.getChart("pie"); 
		chart.display();
		
		chart = ChartFactory.getChart("line"); 
		chart.display();
		
		String type = XMLUtilChart.getChartType();
		chart = ChartFactory.getChart(type); 
		chart.display();
		
	}
}
