package com.springframework.springPractice04;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {

	private LogWriter consoleWriter;

	private LogWriter fileWriter;

	public LogWriter getConsoleWriter() {
		return consoleWriter;
	}

	@Autowired
	public void setConsoleWriter(LogWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public LogWriter getFileWriter() {
		return fileWriter;
	}

	@Autowired
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeConsole(String text) {
		consoleWriter.write(text);
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

}
