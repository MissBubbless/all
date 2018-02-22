package CarDealer;

import java.io.Serializable;

public class CarModel implements Serializable{
int vin;
String colour;
String brand;
String series;
int price;
boolean condition;
public CarModel() {
	super();
}
public int getVin() {
	return vin;
}
public void setVin(int vin) {
	this.vin = vin;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getSeries() {
	return series;
}
public void setSeries(String series) {
	this.series = series;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public boolean isCondition() {
	return condition;
}
public void setCondition(boolean condition) {
	this.condition = condition;
}

}
