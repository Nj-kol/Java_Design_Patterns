package com.njkol.designpatterrns.structural.decorator;

public interface DataSource {
	
    void writeData(String data);

    String readData();
}