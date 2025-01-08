package week05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileLogger implements Logger {
	
	private BufferedWriter writer;
	
	public FileLogger() {
		try {
			writer = new BufferedWriter(new FileWriter("logs.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void info(String info) {
		Date date = new Date();
		try {
			writer.write("INFO: " + date.toString() + " - " + info);
			writer.write("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void warning(String warning) {
		Date date = new Date();
		try {
			writer.write("WARNING: " + date.toString() + " - " + warning);
			writer.write("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		try {
			writer.write("ERROR: " + date.toString() + " - " + error);
			writer.write("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void fatal(String fatal) {
		Date date = new Date();
		try {
			writer.write("FATAL: " + date.toString() + " - " + fatal.toUpperCase());
			writer.write("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void close() {
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	};

}
